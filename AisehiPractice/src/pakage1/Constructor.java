package pakage1;

public class Constructor {
	int a;
	int b;
	
	Constructor(){
		a=10;
		b=20;
	}
	
	Constructor(int x, int y){
		a=x;
		b=y;
	}
	
	public int intGetNumber() {
		return(a+b);
	}

}
