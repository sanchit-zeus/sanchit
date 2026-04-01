package searching;

public class BinarySearch 
{	
	public int binarySearch(int arr[], int f ,int l,int x)
	{
		if(l >= f) {
			int mid = (f + l - 1)/2;
			
			if(arr[mid] == x) {
				return mid;
			}
			
			if(arr[mid] > x)
				return binarySearch(arr, f, mid - 1, x);
			else
				return binarySearch(arr, mid + 1, l, x);
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		BinarySearch obj = new BinarySearch();
		int arr[] = {};
		int x = 110;
		
		System.out.println(obj.binarySearch(arr, 0, arr.length - 1, x));
	}
}
