package pakage2;

public class This {
	
	int a=10;
	
	public void get() {
		int a=5;
		int b=20;
		int c=a+b;
		this.a=9;
		System.out.println(c);
	}
	
	public static void main() {
		
		This obj=new This();
		System.out.println("The value of a is: "+obj.a);
	}

}
