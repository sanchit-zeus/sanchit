package pakage1;

public class TestConstructor {
	public static void main(String args[]) {
		Constructor add1=new Constructor();
		Constructor add2=new Constructor(10,20);
		
		System.out.println(add1.intGetNumber());
		System.out.println(add2.intGetNumber());
	}

}
