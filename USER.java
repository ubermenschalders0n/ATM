package proje;

public class USER extends admin implements print {
	private int ID;
	private hiddenInfo hidden;
	public USER(String name, String password, double balance,int ID,hiddenInfo hidden) {
		super(name, password, balance,hidden);
		setID(ID);
		this.hidden=new hiddenInfo();
	}
	public void setHidden(hiddenInfo _hidden) {
		hidden=_hidden;
	}
	public hiddenInfo getHidden() {
		return hidden;
	}
	public USER() {
		super();
		this.hidden=new hiddenInfo();
	}
	public void setID(int _ID) {
		ID=_ID;
	}
	public int getID() {
		return ID;
	}

	public void withdraw(double muney) {
		System.out.println("Your money before withdraw "+getBalance());
		if(getBalance()-muney>0) {
			setBalance(getBalance()-muney);
			System.out.println("Your money after withdraw "+getBalance());
		}else {
			System.out.println("You can't withdraw more money than you have !");
		}
	}
	@Override
	public void display() {
		System.out.println("Name is "+getName());
		System.out.println("Balance is "+getBalance());
		System.out.println("ID is "+getID());
		System.out.println("Hidden date is "+getHidden().getYear());
		System.out.println("Hidden address is "+getHidden().getAddress());
	}
	@Override
	public void deposit(double money) {
	  System.out.println("Money before deposit "+getBalance());
		setBalance(getBalance()+money);
		System.out.println("Money after deposit "+getBalance());
		
	}
	@Override
	public void menu() {
		System.out.println("Press 1 to look at your info");
		System.out.println("Press 2 to withdraw money ");
		System.out.println("Press 3 to deposit money ");
		System.out.println("Press 4 to transfer money between two accounts");
		System.out.println("Press 5 to log out");
		System.out.println("Press 6 to shut down system");
		System.out.println("So what is your choice ?");
		
	}
	
	
	}
