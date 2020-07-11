package algorithms;

//done

public class DayProgrammer 
{	
	 static String dayOfProgrammer(int year) 
	 {
		 String originalString = ".09."; 
		 StringBuffer newString = new StringBuffer(originalString);
		 
		 newString.insert(4,year);
		 
		 if (year == 1918)
			 return "26.09.1918";
		 
		 else if((year < 1918 && year % 4 == 0) ||
				 (year > 1918 && (year % 4 == 0 && 
				  year % 100 != 0 || 
				  year % 400 == 0)))
		 {
			 newString.insert(0,256 - 244);
		 }
		 else
			 newString.insert(0,256 - 243);
		 
		return newString.toString();
	 }
	 
	public static void main(String[] args) 
	{
		int year = 1800;
		
		System.out.println(dayOfProgrammer(year));
	}
}
