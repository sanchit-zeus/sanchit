package pakage1;

public class Mobile extends Mobile2 {
	
	int amount,id;
	
	Mobile(int x,int y){
		super(2,16);
		id=x;
		amount=y;
	}
	
	public static void main(String args[]) {
		
		Mobile nokia=new Mobile(810,20000);
		System.out.println("The cost of phone is: "+nokia.amount);
		System.out.println("The phone ID is: "+nokia.id);
		System.out.println("It's camera is "+nokia.camera+" megapixel");
		System.out.println("The phone has "+nokia.sim+" Simslots");
	}

}
