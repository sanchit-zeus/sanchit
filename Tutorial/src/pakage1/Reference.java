package pakage1;

public class Reference {
	
	void play(int toyNumber) {
		System.out.println("Toy Number in play "+toyNumber);
	}
	
	public static void main(String args[]) {
		int toyNumber=5;
		
		Reference temp=new Reference();
		temp.play(toyNumber);
	}
}
