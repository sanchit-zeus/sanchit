//package algorithms;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//
////Done
//
//public class PickingNumbers 
//{
//	 public static int pickingNumbers(ArrayList<Integer> a) 
//	 {
//		 int[] arr = new int[a.size()];
//		 int count;
//		 int max = -1;
//		 
//		 for (int i = 0; i < a.size(); i++) 
//			 arr[i] = a.get(i);
//		 
//		 Arrays.sort(arr);
//		 
//		 for (int i = arr.length - 1; i >= 0; i--) 
//		 {
//			 count = 1;
//			 for (int j = i - 1; j >= 0; j--) 
//			 {
////				 System.out.println(arr[i]+"-"+arr[j]);
//				 if(Math.abs(arr[i] - arr[j]) == 0 ||
//				    Math.abs(arr[i] - arr[j]) == 1)
//					 count++;
//			 }
//			 if(count > max)
//				 max = count;
//		 }
//		 
//		 
////		 System.out.println(max);
//		 return max;
//	 }
//	 
//	public static void main(String[] args) 
//	{
//		ArrayList<Integer> a = new ArrayList<Integer>();
//		a.add(4);
//		a.add(6);
//		a.add(5);
//		a.add(3);
//		a.add(3);
//		a.add(1);
//		Collections.sort(a);
//		
//		
//		pickingNumbers(a);
//	}
//}
