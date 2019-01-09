package pakage1;

public class LiteralValue {
	
	private int x;
	
	public LiteralValue() {
		x=50;
	}
	
	public int methodLiteraValue() {
		x=15;
		return x;
	}
	
	public int methodLiteralValue1(int xx) {
		x=xx;
		return x;
	}
	
	public static void main(String args[]) {
		
		LiteralValue testobj=new LiteralValue();
		System.out.println(testobj.x);
		System.out.println(testobj.methodLiteraValue());
		System.out.println(testobj.methodLiteralValue1(45));
		
	}
	
	

}
