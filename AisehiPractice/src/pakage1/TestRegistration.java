package pakage1;

public class TestRegistration {
	public static void main(String args[]) {
		Registration user1=new Registration("Ram");
		
		System.out.println(user1.putUsernameDatabase()+" is logged in.");
		System.out.println(user1.getusernameCount()+" users logged in");
		
Registration user2=new Registration("Sanchit");
		
		System.out.println(user2.putUsernameDatabase()+" is logged in.");
		System.out.println(user2.getusernameCount()+" users are logged in");
	}
	
	Registration user3=new Registration("Sanchit");
	
	

}
