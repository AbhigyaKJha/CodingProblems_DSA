package warmup;

public class CountDigit {
	
	/*
	 * In order to solve this problem, we need to keep dividing the given number by 10 
	 * and keep updating the given number until the quotient remains as 0.
	 * And the number of time the division happens will be the final result.
	 * 
	 * NOTE:- Please ask your interviewer if given number is 0,00, 000... then we need to return
	 * 
	 */
	
	public static void main(String[] args) {
		
		int num=-1;
		int noOfDigit=getNumberOfDigits(num);
		System.out.println(noOfDigit);
		
		
	}
	
	public static int getNumberOfDigits(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
			
		}
		return count;
	}

}
