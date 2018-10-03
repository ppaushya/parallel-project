
public class Address {
	
	private String StName;
	private String address;
	private String city;
	private String state;
	
	

	@Override
	public String toString() {
		return "Address [StName=" + StName + ", address=" + address + ", city=" + city + ", state=" + state + "]";
	}



	public Address(String stName, String address, String city, String state) {
		super();
		StName = stName;
		this.address = address;
		this.city = city;
		this.state = state;
	}



	public Address() {
		super();
	}



	public String getStName() {
		return StName;
	}



	public void setStName(String stName) {
		StName = stName;
	}



	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public String getState() {
		return state;
	}




	public void setState(String state) {
		this.state = state;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
