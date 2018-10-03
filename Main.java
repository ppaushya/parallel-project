import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the number of customers");
		int size=scan.nextInt();
		
		Customer[] customer= new Customer[size];
		
		Address address= new Address();
		
		
		//Getting and setting customer details
		for(int i=0; i<size; i++)
		{
			
			System.out.println("----------Enter the details of customers----------");
			
			System.out.println("Enter the customer id");
			int id=scan.nextInt();
			
			System.out.println("Enter the name");
			String fullname= scan.next();
			
			System.out.println("---Enter the address details---");
			System.out.println("Enter the Street name");
			String st= scan.next();
			System.out.println("Enter the address");
			String add= scan.next();

			System.out.println("Enter the city");
			String cit= scan.next();

			System.out.println("Enter the state");
			String stat= scan.next();


/*			System.out.println("---Enter the account details---");
			System.out.println("Enter the account number");
			long acc=scan.nextLong();
			*/

			System.out.println("Enter the mobile number");
			String mobile=scan.next();

			System.out.println("Enter the email id");
			String email = scan.next();
			
			customer[i]=new Customer();
			customer[i].setCustomerId(id);
			customer[i].setName(fullname);

			address.setStName(st);
			address.setAddress(add);
			address.setCity(cit);
			address.setState(stat);
			//account[i]= new Account();
			//account[i].setAccountNo(acc);
			
			customer[i].setMobileNo(mobile);
			customer[i].setEmailId(email);


		}
		
		  
		
		
		
	
		
		scan.close();

	}

}
