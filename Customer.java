
public class Customer {
	
	private int customerId;
	private String name;
	private Address address;
	private Account account[];
	private String mobileNo;
	public String getMobileNo() {
		return mobileNo;
	}



	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	private String emailId;

	
	
	public Customer() {
		super();
	}



	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public Account[] getAccount() {
		return account;
	}



	public void setAccount(Account[] account) {
		this.account = account;
	}



	public static void main(String[] args) {
		
		

	}

}
