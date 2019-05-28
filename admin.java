package proje;

public abstract class admin implements print {
	private String Name;
	private String Password;
	private double Balance;
	private int ID;
	private hiddenInfo hidden;
	public void setHidden(hiddenInfo _hidden) {
		hidden=_hidden;
	}
	public hiddenInfo getHidden() {
		return hidden;
	}
	public void setID(int _ID) {
		ID=_ID;
	}
	public int getID() {
		return ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public double getBalance() {
		return Balance;
	}
	public abstract void display(); 
	public void setBalance(double balanceValue) {
		Balance = balanceValue;
	}
	
	abstract void withdraw(double muney);
	abstract void deposit(double money);
	public abstract void menu();
	
	public admin() {
		setName("null");
		setPassword("null");
		setBalance(0);
		this.hidden=new hiddenInfo();
	}
	public admin(String name,String password,double balance,hiddenInfo hidden) {
		setName(name);
		setPassword(password);
		setBalance(balance);
		this.hidden=new hiddenInfo();
	}

}
