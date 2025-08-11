package warmup;

public class Palindrome {

	/*
	 * Given an integer x, return true if x is a Palindrome , and false otherwise.
	 *
	 * To Solve this problem below will be our approach. 1. Get the last digit of
	 * the given number and append it to a new Variable 'reverse' 2. Now Remove the
	 * Last digit of the given number by dividing the given number by 10 3. Keep
	 * doing the same thing until given number >0 4. At the end compare the reverse
	 * with the original given number
	 */

	public static void main(String[] args) {
		int num=-121;
		System.out.println(checkPalindrome(num));
	}

	public static boolean checkPalindrome(int num) {
		if (num < 0)
			return false;

		int numCopy = num;
		int rem = 0;
		int rev = 0;
		while (num > 0) {
			rem = num % 10;
			rev = (10 * rev) + rem;
			num = num / 10;

		}
		return numCopy == rev;
	}

}
