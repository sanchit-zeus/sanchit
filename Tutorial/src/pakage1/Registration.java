package pakage1;

public class Registration {
	
	private String usernameA;
	private static int usernamecount=0;
	
	public Registration(String A) {
		usernameA=A;
		usernamecount++;
	}
	
	public String putusernameDatabase() {
		return usernameA;
	}
	
	public static int getusernamecount() {
		return usernamecount;
	}

}
