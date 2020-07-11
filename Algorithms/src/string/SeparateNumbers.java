package string;

//Done

public class SeparateNumbers 
{	
	static void separateNumbers(String s) 
	{       
        long shor=0;
        
        if(s.length() == 1)
        	System.out.println("NO");
                
        for(int i = 1; i <= (s.length()/2); i++)
        {
        	if(s.charAt(0) == 0)
            {
                 System.out.println("NO");
                 break;   
            }
        	
        	long sub = Long.parseLong(s.substring(0, i));
            String p = "";
            p += sub;
            shor = sub;
            long len = String.valueOf(shor).length();
            
            for(int j = 0; j < s.length(); j++)
            {
                sub++;
                p += sub;      
            }
                        
            String d = p.substring(0, s.length());
            
            if(d.equals(s.substring(0, s.length())) && 
              (d.length() % len == 0 || d.length() % len == 1))
            {
            	System.out.println("YES" +" "+shor);
            	break;
            }
            if(i == s.length()/2)
            	System.out.println("NO");    
     
          }
    }

	public static void main(String[] args) 
	{
		String s = "99910001001";
		
		separateNumbers(s);
	}
}


//static boolean find(String str, String first)
//{
//  if(str == null)
//      return true;
//  
//  if(str.length() == 0)
//      return true;
//  
//  String next = Long.toString(Long.parseLong(first) + 1);
//  
//  if(str.startsWith(next))
//      find(str.substring(next.length()), next);
//  
//  return true;
//}
//
//static void separateNumbers(String s) 
//{
//  boolean flag = false;
//  
//  for (int i = 1; i <= s.length()/2; i++)
//  {
//      String first = s.substring(0, i);
//      
//      if(find(s.substring(i),first))
//      {
//          flag = true;
//          System.out.println("YES " + first);
//          break;
//      }
//  }
//  
//  if(!flag)
//      System.out.println("NO");
//}
