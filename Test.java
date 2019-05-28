package proje;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		String file_name = "C:/name.txt";
		String file_name2 = "C:/password.txt";
		String file_name3 = "C:/balance.txt";
		String file_name4 = "C:/ID.txt";
		String file_name5 = "C:/address.txt";
		String file_name6 = "C:/date.txt";
		ReadAddress file5 = new ReadAddress(file_name5);
		String[] address = file5.OpenFile();
		ReadDate file6 = new ReadDate(file_name6);
		String[] date = file6.OpenFile();
		ReadID file4 = new ReadID(file_name4);
		String[] ID = file4.OpenFile();
		ReadFile file = new ReadFile(file_name);
		String[] aryLines = file.OpenFile();
		ReadPassword file2 = new ReadPassword(file_name2);
		String[] password = file2.OpenFile();
		ReadBalance file3 = new ReadBalance(file_name3);
		String[] balance = file3.OpenFile();
		Double[] realBalance = new Double[balance.length];
		int[] realID = new int[ID.length];
		admin[] users = new USER[aryLines.length];
		int[] realDate = new int[date.length];
		for (int i = 0; i < realBalance.length; i++) {
			realBalance[i] = Double.parseDouble(balance[i]);
			realID[i] = Integer.parseInt(ID[i]);
			realDate[i] = Integer.parseInt(date[i]);
		}
		for (int i = 0; i < users.length; i++) {
			users[i] = new USER();
			users[i].setName(aryLines[i]);
			users[i].setPassword(password[i]);
			users[i].setBalance(realBalance[i]);
			users[i].setID(realID[i]);
			users[i].getHidden().setAddress(address[i]);
			users[i].getHidden().setYear(realDate[i]);
		}
		for (int i = 0; i < users.length; i++) {// this for loop is polymorphism
			System.out.println(aryLines[i]);
			System.out.println(password[i]);
			System.out.println(realBalance[i]);
			System.out.println(realID[i]);
			System.out.println(users[i].getHidden().getAddress());
			System.out.println(users[i].getHidden().getYear());
		}
		while (true) {
			/*
			 * String[] sArray = {"i", "love", "you"}; String s = ""; for (String n:sArray)
			 * s+= n; char[] c = s.toCharArray();
			 */
			boolean bool = false;
			System.out.println("Please enter name");
			String name = input.next();
			System.out.println("Please enter password");
			String pword = input.next();
			// char[] c=pword.toCharArray();//Actuall I tried to set password to echo char
			// but couldnt made it without JPassword field would like your feedback
			for (int i = 0; i < users.length; i++) {
				if (name.equals(users[i].getName()) && pword.equals(users[i].getPassword())) {
					System.out.println("Welcome " + users[i].getName() + " to our bank");
					bool = true;
					while (bool) {
						users[i].menu();// polymorphism
						int choice = input.nextInt();
						switch (choice) {
						case 1:
							users[i].display();
							break;
						case 2:
							System.out.println("Please enter value withdraw");
							double muney = input.nextDouble();
							users[i].withdraw(muney);// polymorphism
							break;
						case 3:
							System.out.println("Please enter value to deposit");
							double money = input.nextDouble();
							users[i].deposit(money);// polymorphism
							break;
						case 4:
							System.out.println("Enter ID of account you want to transfer");
							int IDs = input.nextInt();
							boolean foundit = false;
							for (int k = 0; k < users.length; k++) {
								if (users[k].getID() == IDs) {
									System.out.println("Please enter a value to transfer");
									double transfermoney = input.nextDouble();
									transfer.transfers(users[i], users[k], transfermoney);
									foundit = true;
								}
							}
							if (foundit == false) {
								System.out.println("Wrong ID try again");
							}
							break;

						case 5:
							System.out.println("Now logging out of your account");
							bool=false;
							break;
						case 6:
							System.out.println("Shutting down");
							System.exit(0);
						}
					}

				}

			}

		}
	}

}
