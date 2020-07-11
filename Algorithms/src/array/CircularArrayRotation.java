package array;

//done

public class CircularArrayRotation 
{	
    int[] circularArrayRotation(int[] a, int k, int[] queries) 
	{
    	int temp = 0;
    	int b[] = new  int[queries.length];
    	
    	for (int j = 0; j < k; j++) 
    	{
    		temp = a[a.length - 1];
    		
    		for (int i = a.length - 1; i > 0; i--) 
        		a[i] = a[i - 1];
    		
        	a[0] = temp;
		}
     	
    	for (int i = 0; i < queries.length; i++) 
    		b[i] = a[queries[i]];	
    	
		return b;
	}
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int k = in.nextInt();
//        int q = in.nextInt();
//        int[] a = new int[n];
//        for(int a_i=0; a_i < n; a_i++){
//            a[a_i] = in.nextInt();
//        }
//        for(int a0 = 0; a0 < q; a0++){
//            int m = in.nextInt();
//            System.out.println(a[(n - (k % n)+ m) % n]);
//        }               
//    }
	public static void main(String[] args) 
	{
		int n = 3, k = 2, q = 3;
        int a[] = {1,2,3};
        int queries[] = {0,1,2};
        
        CircularArrayRotation obj = new CircularArrayRotation();
        System.out.println(obj.circularArrayRotation(a, k, queries));
     
     }
}

