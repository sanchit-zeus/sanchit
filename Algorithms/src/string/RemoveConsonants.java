package string;

//Done

public class RemoveConsonants {
	
	boolean isVowel(char s) 
	{
		if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||
		   s=='A'||s=='E'||s=='I'||s=='O'||s=='U')
			return true;
		else
			return false;
	}
	
	void consonantsRemoval(String str, int n) 
	{
		for (int i = 0; i < n; i++) 
		{
			if(isVowel(str.charAt(i)) == true) 
				System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "tewyinofhkvsnewcmofaghvnepCRWMEFNAERIHeadcvboidsertyio";
		int n = str.length();
		
		RemoveConsonants obj = new RemoveConsonants();
		obj.consonantsRemoval(str,n);
	}
}
