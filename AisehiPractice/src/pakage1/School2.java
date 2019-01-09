package pakage1;

public class School2 extends School1 {
	
	public void SchoolInfo() {
		super.SchoolInfo();
		System.out.println("The bus count is: "+buscount);
		System.out.println("The student count is: "+studentcount);
	}
	
	public static void main(String args[]) {
		
        School1 vbps=new School1();
		
		vbps.name="VBPS";
		vbps.id=001;
		vbps.assets=250000;
		vbps.staffcount=1000;
		vbps.buscount=25;
		vbps.staffcount=4500;
		
		vbps.SchoolInfo();
		
		System.out.println();
		
		School2 ppc=new School2();
		
		ppc.name="Prince Public";
		ppc.id=002;
		ppc.assets=400000;
		ppc.staffcount=200;
		ppc.buscount=20;
		ppc.studentcount=2000;
		
		ppc.SchoolInfo();
	}
	
	

}
