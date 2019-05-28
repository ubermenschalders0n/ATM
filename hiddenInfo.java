package proje;

public class hiddenInfo {
	private String address;
	private int dateYear;
	public void setAddress(String _address) {
		address=_address;
	}
	public String getAddress() {
		return address;
	}
	public void setYear(int _dateYear) {
		dateYear=_dateYear;
	}
	public int getYear() {
		return dateYear;
	}
	public hiddenInfo() {
		setAddress("hatay");
		setYear(9999);
	}
	public hiddenInfo(String address,int dateYear) {
		setAddress(address);
		setYear(dateYear);
	}

}
