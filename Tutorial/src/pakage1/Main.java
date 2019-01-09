package pakage1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registration newuser1=new Registration("Marry");
		System.out.println(newuser1.putusernameDatabase()+"Username created and entered into database");
		
		Registration newuser2=new Registration("Larry");
		System.out.println(newuser2.putusernameDatabase()+"Username created and entered into database");
		
		System.out.println(Registration.getusernamecount());
		
		Registration newuser3=new Registration("Sam");
		System.out.println(newuser3.putusernameDatabase()+"Username created and entered into database");
		
		System.out.println(Registration.getusernamecount());
	}

}
