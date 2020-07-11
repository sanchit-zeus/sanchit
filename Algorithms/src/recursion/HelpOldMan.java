package recursion;

//Done
//Tower of hanoi

public class HelpOldMan 
{
	void sequence(int n, char from_rod, char to_rod, char aux_rod)
	{
		if(n == 1)
		{
			System.out.println("Move disk 1 from rod "+from_rod+
					           " to rod "             +to_rod);
			return;
		}
		
		sequence(n - 1, from_rod, aux_rod, to_rod);
		System.out.println("Move disk "+n+
				           " from rod "+from_rod+
				           " to rod "  +to_rod);
		sequence(n - 1, aux_rod, to_rod, from_rod);
	}
	
	public static void main(String[] args) 
	{
		int n = 4;
		HelpOldMan obj = new HelpOldMan();
		
		obj.sequence(n,'A','B','C');
	}
}
