import java.util.Arrays;


/*
 * Assumptions:- 
 * 1. Array may be empty ?(Ask Interviewer)
 * 2. Array may contain only 1 element?(Ask Interviewer)
 * 3. Array may contain duplicate elements?(Ask Interviewer)
 * 
 * 
 */
public class SecondLargestElementInArray {
	
	
	public static void main(String[] args) {
		
		int[] array = {10,20,30,50};
		int result=getSecondLargest(array);
		System.out.println("Input Array:"+Arrays.toString(array));
		System.out.println("Second Largest Element in Array: "+result);
		
		
		
		
	}
	/*
	 * Solution is as below:ONE PASS SEARCH
	 * 1. Take 2 variables largest and SecondLargest and initialize with arr[0]
	 * 2. Start loop from index 1
	 * 3. Check if arr[i]>lagest : update SL=Largest and Largest=arr[i]
	 * 4. Check if arr[i]>SL and arr[i]!=largest: update SL=arr[i]
	 * 5. Make sure if arr.length <=1: return -1(Ask Interviewer)
	 */
	
	public static int getSecondLargest(int[] arr)
	{
		if(arr.length<=1) {
			return -1;
		}
		int largest =arr[0];//1
		int secondLargest =arr[0];//1
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) //a[1]=2>1==true
			{
				secondLargest=largest;
				largest=arr[i];//largest=2
				
			}
			else if(arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest=arr[i];
			}
			
		
		}
		
		return secondLargest;
	}
	
	

}
