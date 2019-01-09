package pakage1;

public class Addition {

	int FirstNumber;
	int SecondNumber;
	
	public int getNumber() {
		return(FirstNumber+SecondNumber);
	}
	
	Addition() {
		FirstNumber=10;
		SecondNumber=20;
	}
	
	Addition (int L, int B){
		FirstNumber=L;
		SecondNumber=B;
	}
}
