import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BootClass {
	
	static Scanner scan=new Scanner(System.in);
	
	public static Customer[] LoadCustomer()
	{
		
		Customer[] customer=new Customer[5];
		
		
			
			for(int i=0;i<5;i++)
			{
				Long customerId;
				int accountNo,mobileNo;
				String customerName,emailId;
				customer[i]=new Customer();
				customerId=scan.nextLong();
				
				Pattern pattern= Pattern.compile("^\\d{6,10}");
				
				boolean x= true;
				while(x)
				{
					Matcher matcher= pattern.matcher(Long.toString(customerId));
					if(matcher.matches())
					{
						System.out.println("Enter Customer Name");
						x=false;
					}
					else
					{
						System.out.println("Enter a valid customer id");
						customerId=scan.nextLong();
					}
				}
				x=true;
				customerName= scan.nextLine();
				
				Pattern pattern1= Pattern.compile("^[A-Z][A-Za-z\\s]+$");
				
				while(x)
				{
					Matcher matcher= pattern1.matcher(customerName);
					if(matcher.matches())
					{
						System.out.println("Enter Customer Name");
						x=false;
					}
					else
					{
						System.out.println("Enter a valid customer name");
						customerName= scan.nextLine();
					}
				}
				x=true;
				
				
				
				
				
					
				 
				
			}
			
		
		/*Address address=new Address("north avenue","dashmesh nagar","ludhiana","punjab");
		customers[0] = new Customer(1100,"poonam",address,new Account[5],"9915155124","poonamojha96@gmail.com");
		Account account=new Account(1234, AccountType.SAVINGS, LocalDate.now(), 45000);
		customers[0].getAccount()[0]=account;
		
		Address address1=new Address("South Avennue", "Cross St", "Hyderabad", "AP");
		customers[1]=new Customer(1002, "Jerry",address1 ,new Account[5],   "43454354", "jerry@gmail.com");
		
		Address address2=new Address("West car st", "Cross St", "Chennai", "TN");
		customers[2]=new Customer(21321, "Jack",address2 , new Account[5],  "435435543", "jack@gmail.com");
		
		Address address4=new Address("West Avennue", "Cross St", "Pune", "MH");
		customers[3]=new Customer(87868, "Kamal",address4 ,new Account[5],   "43543543", "kamal@gmail.com");
		
		Address address3=new Address("East Avennue", "Cross St", "Delhi", "UP");
		customers[4]=new Customer(657657, "Jasmine",address3 , new Account[5], "352325", "jas@gmail.com");
		*/
		
		return customer;
	}
	
	public static void printCustomers()
	{
		Customer[] customers=LoadCustomer();
		
		for(Customer customer:customers)
		{
			System.out.println(customer.getCustomerId()+"\t"+customer.getName()+"\t"+customer.getAddress()+"\t"+customer.getMobileNo()+"\t"+customer.getEmailId());
		}
	}
	
	public static Customer findId(int id)
	{
		for(Customer customer:LoadCustomer())
		{
			if(customer.getCustomerId()==id)
				return customer;
		}
		return null;
	}
	
	

	public static void main(String[] args) {
		
		printCustomers();
		
		int id=0;
		int choice=0;
		System.out.println("Choose the customer id:");
		id= scan.nextInt();
		Customer customer=findId(id);
		char c=0;
		c=scan.next().charAt(0);
		
		do {
				if(customer!=null)
				{
					System.out.println("1.Generate account\n2.Perform Transactions.");
					System.out.println("Choose 1 or 2");
					choice=scan.nextInt();
					if(choice==1)
					{
						
					}
					else if(choice==2)
					{
						
					}
					else
						System.out.println("Enter a valid option");
	
				}
				else
					System.out.println("Print valid customer id");
		}while(c=='y'||c=='Y');

		

	}

}
