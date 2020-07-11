package algorithms;

//Done

public class BreakingTheRecords 
{
	 static int[] breakingRecords(int[] scores) 
	 {
		 int minimum = 0, maximum = 0;
		 int minBreak = 0, maxBreak = 0;
		 
		 for (int i = 0; i < scores.length; i++) 
		 {
			 if(i == 0)
				 minimum = maximum = scores[i];
			 else
			 {
				 if(scores[i] < minimum)
				 {
					 minimum = scores[i];
					 minBreak++;
				 }
				 else if(scores[i] > maximum)
				 {
					 maximum = scores[i];
					 maxBreak++;					 
				 }
			 }
		 }
		 
		 int records[] = new int [2];
		 
		 records[0] = maxBreak;
		 records[1] = minBreak;	 
		 
		return records;
	 }


	public static void main(String[] args) 
	{
//		int n = 9;
		int scores[] = {10,5,20,20,4,5,2,25,1};
		int scores2[] = {3,4,21,36,10,28,35,5,24,42};
		
		breakingRecords(scores);
		breakingRecords(scores2);
	}
}
