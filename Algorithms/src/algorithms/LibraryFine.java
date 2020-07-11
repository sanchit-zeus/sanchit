package algorithms;

//Done

public class LibraryFine
{
	static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) 
	{
		int fine = 0;
		
		if(d1 == d2 && m1 == m2 && y1 == y2)
			fine = 0;
		
		else if(d1 < d2 && m1 == m2 && y1 == y2)
			fine = 0;
		
		else if(d1 != d2 && m1 == m2 && y1 == y2)
			fine = (d1 - d2) * 15;
		
		else if(m1 < m2 && y1 == y2)
			fine = 0;
		
		else if(m1 != m2 && y1 == y2)
			fine = (m1 - m2) * 500;
		
		else if(y1 < y2)
			fine = 0;
		
		else if(y1 != y2)
			fine =  10000;
		
		return fine;
    }

	public static void main(String[] args) 
	{
		int d1 = 6,m1 = 12,y1 = 2015;
		int d2 = 6,m2 = 6,y2 = 2015;
		
		System.out.println(libraryFine(d1, m1, y1, d2, m2, y2));
	}
}
