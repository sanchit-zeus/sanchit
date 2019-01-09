package customer_Details;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerDetails extends LoanDetails {
	static Scanner scanner= new Scanner(System.in);
	protected long accountnumber=221000;
	protected long phone;
	protected long adhar;
	protected String name;
	protected String user;
	protected String dob;
	protected String address;
	protected String email;
	
	
	void getcustomerdetails() {
		
		System.out.println("Enter the name: ");
		try {
		name=scanner.nextLine();
		}
		catch(InputMismatchException e) {
	    	System.out.println("Invalid Input");
	    	scanner.nextLine();
	    	getcustomerdetails();
		}
		name=name.toLowerCase();
		
		System.out.println("Enter the dob (dd/mm/yyyy): ");
		try {
		dob=scanner.next();
		}
		catch(InputMismatchException e) {
	    	System.out.println("Invalid Input");
	    	scanner.next();
	    	getcustomerdetails();
		}
		
		System.out.println("Enter the address: ");
		try {
		address=scanner.next();
		}
		catch(InputMismatchException e) {
	    	System.out.println("Invalid Input");
	    	scanner.nextLine();
	    	getcustomerdetails();
		}
		address=address.toLowerCase();
		
		System.out.println("Enter the Phone Number: ");
		try {
		phone=scanner.nextLong();
		}
		catch(InputMismatchException e) {
	    	System.out.println("Invalid Input");
	    	scanner.nextLine();
	    	getcustomerdetails();
		}
		
		System.out.println("Enter the AdharCard Number: ");
		try {
		adhar=scanner.nextLong();
		}
		catch(InputMismatchException e) {
	    	System.out.println("Invalid Input");
	    	scanner.nextLine();
	    	getcustomerdetails();
		}
		
		System.out.println("Enter the email: ");
		try {
		email=scanner.next();
		}
		catch(InputMismatchException e) {
	    	System.out.println("Invalid Input");
	    	scanner.nextLine();
	    	getcustomerdetails();
		}
		email=email.toLowerCase();
	}
	
	
	void printcustomerdetails() {
		System.out.println("Customer Name               : "+name);
		System.out.println("Customer Date of Birth      : "+dob);
		System.out.println("Customer Address            : "+address);
		System.out.println("Customer Email              : "+email);
		System.out.println("Customer AdharCard Number   : "+adhar);
		System.out.println("Customer Phone              : "+phone);
		System.out.println("Account Number              : "+accountnumber);
	}

	
	void checkuser() {
		System.out.println("Are you a existing user(yes/no): ");
		user=scanner.nextLine();
		user=user.toLowerCase();
		
		if(user.equals("yes")) {
			System.out.println("Enter Account Number: ");
			try {
			accountnumber=scanner.nextLong();
			}
			catch(InputMismatchException e) {
		    	System.out.println("Invalid Input");
		    	scanner.nextLine();
		    	checkuser();
			}
			for(int i=0;i<negativeaccount.length;i++) {
				if(accountnumber==negativeaccount[i]) 
				    z=z+1;
				else
					z=z+0;
			}
			if(z==1)
				System.out.println("Blasklisted user. Not eligible for loan.");
			else if(z==0){
			getloandetails();
			System.out.println("Account Number           : "+accountnumber);
			printloandetails();
		    creditscore();
			}
		}
		else if(user.equals("no")) {
			getcustomerdetails();
			for(int j=0;j<negativeuser.length;j++) {
				if(name.equals(negativeuser[j]))
					z=z+1;
				else 
					z=z+0;
			}
			if(z==1)
				System.out.println("Blasklisted user. Not eligible for loan.");
			else if(z==0){
			getloandetails();
			accountnumber++;
			printcustomerdetails();
			printloandetails();
		    creditscore();
			}
		}
		else
			checkuser();
	}
}