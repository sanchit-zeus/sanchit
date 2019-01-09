package pakage1;

public class ChildClass extends MiddleClass{
	
	private int x;
	
	public ChildClass() {
		x=50;
	}
	
	public int methodChildClass() {
		return x;
	}
	
	public static void main(String args[]) {
		
		ChildClass testobj=new ChildClass();
		System.out.println(testobj.methodChildClass());
	}

}
