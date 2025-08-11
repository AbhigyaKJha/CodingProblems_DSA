package warmup;

public class ReverseInteger {
	/*
	 * Given a signed 32-bit integer x, return x with its digits reversed. If
	 * reversing x causes the value to go outside the signed 32-bit integer range
	 * [-231, 231 - 1], then return 0.
	 * 
	 * To solve this problem I am going to follow below mentioned approach:
	 * 1. Get the absolute value of the given number to handle negative number scenario
	 * 2. Now Reverse the given number
	 * 3. Now Verify that if the reversed number is going outside the signed 32-bit integer range
	 * then return 0;
	 * Else if the original number was < 0 return negative value of reverse number or else 
	 * return the reverse 
	 */ 

	public static void main(String[] args) {

		System.out.println(getReverseInteger(123456));

	}

	public static long getReverseInteger(int x) {
		int xCopy = x;
		x = Math.abs(x);

		long rev = 0;
		int rem = 0;

		while (x != 0) {
			rem = x % 10;
			rev = (10 * rev) + rem;
			x = x / 10;
		}

		int limit = (int) (Math.pow(2, 31));
		if (rev < -limit || rev > limit)
			return 0;
		if (xCopy < 0) {
			return (int) (-rev);
		} else
			return (int) (rev);
	}
}
