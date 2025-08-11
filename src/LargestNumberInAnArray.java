import java.util.Arrays;

public class LargestNumberInAnArray {

	public static void main(String[] args) {
		
		int[] array= {1,4,-1,9,11,18};
		
		int result= getLargestNumber(array);
		System.out.println("Input Array:"+Arrays.toString(array));
		System.out.println("Largest Element in Array: "+result);
		
		
	}
	/*
	 * In this method, we are first checking if the array is null, then return -1.
	 * If the array length is 1, then simply return  the only element available in array
	 * Else, assume the first element {0 index element} to be largest and start comparing with 
	 * the other elements and iterate till last element
	 * 
	 * Time Complexity-> O(n)
	 * 
	 */

	public static int getLargestNumber(int[] arr) {
		if (arr.length < 1) {
			return -1;
		} else if (arr.length == 1) {
			return arr[0];
		} else {
			int largest = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if(arr[i]>largest)
				{
					largest=arr[i];
				}
			}
			return largest;
		}

	}
}
