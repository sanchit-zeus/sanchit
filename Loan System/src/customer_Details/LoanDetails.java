package customer_Details;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoanDetails extends Database{
	static Scanner scanner= new Scanner(System.in);
	protected int age;
	protected int z=0;
	protected int duration;
	protected int creditscore=0;
	protected long asset;
	protected long liability;
	protected long loanamount;
	protected String type;
	protected String education;
	
	
	void getloandetails() {
		
		    System.out.println("Enter the Type of Loan(Education/House/Car/Personal): ");
		    try {
		    type=scanner.next();
		    }
		    catch(InputMismatchException e) {
		    	System.out.println("Invalid Input");
		    	scanner.nextLine();
		    	getloandetails();
		    }
		    type=type.toLowerCase();
		    
		    System.out.println("Enter the Loan Amount(In Rupees): ");
		    try {
		    loanamount=scanner.nextLong();
		    }
		    catch(InputMismatchException e) {
		    	System.out.println("Invalid Input");
		    	scanner.nextLine();
		    	getloandetails();
		    }
		    
			System.out.println("Enter the Duration of Loan(In Years): ");
			try {
			duration=scanner.nextInt();
			}
			catch(InputMismatchException e) {
		    	System.out.println("Invalid Input");
		    	scanner.nextLine();
		    	getloandetails();
			}
			
			System.out.println("Enter the Assets(In Rupees): ");
			try {
			asset=scanner.nextLong();
			}
			catch(InputMismatchException e) {
		    	System.out.println("Invalid Input");
		    	scanner.nextLine();
		    	getloandetails();
			}
			
			System.out.println("Enter the Labilities(Expense in Rupess): ");
			try {
			liability=scanner.nextLong();
			}
			catch(InputMismatchException e) {
		    	System.out.println("Invalid Input");
		    	scanner.nextLine();
		    	getloandetails();
			}
			
			System.out.println("Enter the age(Years): ");
			try {
			age=scanner.nextInt();
			}
			catch(InputMismatchException e) {
		    	System.out.println("Invalid Input");
		    	scanner.nextLine();
		    	getloandetails();
			}
			
			System.out.println("Are you Educated: ");
			try {
			education=scanner.next();
			}
			catch(InputMismatchException e) {
		    	System.out.println("Invalid Input");
		    	scanner.nextLine();
		    	getloandetails();
			}
			education=education.toLowerCase();
	}
	
	
	void printloandetails() {
		System.out.println("Loan Type                   : "+type);
		System.out.println("Loan amount                 : "+loanamount);
		System.out.println("Loan Duration               : "+duration+" Years");
		System.out.println("Customer's Asset            : "+asset);
		System.out.println("Customer's Liability        : "+liability);
		System.out.println("Customer's Age              : "+age+" Years");
		System.out.println("If the customer is educated : "+education);
	}
	
	
	void creditscore() {
		
		if(age<18)
			System.out.println("Not Eligible for loan. Age below 18.");
		else {	
			
		if(age<35)
			creditscore=creditscore+2;
		else if(age>35)
			creditscore=creditscore+0;
						
		if(duration<=10)
			creditscore=creditscore+2;
		else if(duration>10)
			creditscore=creditscore+0;	
			
		if(asset-liability>loanamount/duration)
			creditscore=creditscore+2;
		else if(asset-liability<loanamount/duration)
		    creditscore=creditscore-5;
			
		if(education.equals("yes"))
			creditscore=creditscore+2;
		else if(education.equals("no"))
			creditscore=creditscore+0;
		
		if(type.equals("education"))	
			creditscore=creditscore+2;
		else if(type.equals("personal"))
			creditscore=creditscore+2;
		else if(type.equals("house"))
			creditscore=creditscore+1;
		else if(type.equals("car"))
			creditscore=creditscore+0;
		
		System.out.println("The credit score of customer is: "+creditscore);
		
		if(creditscore<4)
			System.out.println("You are not eligible for loan");
		else {
		if(type.equals("education")) {
			System.out.println("The loan granted is: (Rs)"+loanamount*1*creditscore*.1+" at 12% intrest");
		    System.out.println("EMI: (Rs)"+(((loanamount*1*creditscore*.1)+loanamount*1*creditscore*.1*0.12)/duration)/12+" per month");
		}
		else if(type.equals("personal")) {
			System.out.println("The loan granted is: (Rs)"+loanamount*1*creditscore*.1+" at 15% intrest");
			System.out.println("EMI: (Rs)"+((loanamount*1*creditscore*.1)/duration)/12+" per month");
		}
		else if(type.equals("house")) {
			System.out.println("The loan granted is: (Rs)"+loanamount*.85*creditscore*.1+" at 9% intrest");
			System.out.println("EMI: (Rs)"+(((loanamount*.85*creditscore*.1)+loanamount*.85*creditscore*.1*0.09)/duration)/12+" per month");	
		}
		else if(type.equals("car")) {
			System.out.println("The loan granted is: (Rs)"+loanamount*.55*creditscore*.1+" at 8% intrest");
			System.out.println("EMI: (Rs)"+(((loanamount*.55*creditscore*.1)+loanamount*.55*creditscore*.1*0.08)/duration)/12+" per month");
		}
	    }
		}
	}
}