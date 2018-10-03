import java.util.Arrays;

public class Customer {
	
	private int customerId;
	private String name;
	private Address address;
	private Account[] account;
	private String mobileNo;
	private String emailId;
	
	
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



	

	
	
	public Customer() {
		super();
	}



	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", address=" + address + ", account="
				+ Arrays.toString(account) + ", mobileNo=" + mobileNo + ", emailId=" + emailId + "]";
	}



	public Customer(int customerId, String name, Address address, Account[] account, String mobileNo, String emailId) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.account = account;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
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
