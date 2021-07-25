
public class adopter {
	
	private String adopterName;
	private String emailAdress;
	private long phoneNumber;
	
	
	public String getAdopterName() {
		return adopterName;
	}
	public void setAdopterName(String adopterName) {
		this.adopterName = adopterName;
	}
	public String getEmailAdress() {
		return emailAdress;
	}
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public adopter(String adopterName, String emailAdress, long phoneNumber) {
		super();
		this.adopterName = adopterName;
		this.emailAdress = emailAdress;
		this.phoneNumber = phoneNumber;
	}
	
	public void showData() {
		System.out.println("---------ADOPTER'S INFORMATION--------- \n"
				+ "NAME: " + adopterName + "\n"
				+ "EMAIL ADDRESS: " + emailAdress + "\n"
				+ "PHONE NUMBER: " + phoneNumber);
	}
	

}
