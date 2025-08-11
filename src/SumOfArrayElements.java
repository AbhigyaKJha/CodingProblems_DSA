
/*
 * Write a program to take an array of integers as input and calculate
 *  the sum of all elements in the array.
 */
public class SumOfArrayElements {

	public static void main(String[] args) {

		int[] array = {1,2,3,4,5};
		System.out.println(SumOfArrayElements.sum(array, array.length));
		System.out.println(SumOfArrayElements.sum(array));
	}

	// using recursion

	public static int sum(int[] arr, int n) {

		if (n <= 0) {
			return 0;
		}
		return sum(arr, n - 1) + arr[n - 1];
	}

	// using iteration
	public static int sum(int[] arr) {

		if (arr.length <= 0) {
			return 0;
		}
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}

		return sum;
	}

}
