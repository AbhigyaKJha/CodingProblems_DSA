package starpatternproblems;

/*
 *  if n=4, print below pattern
 *  	1
 *  	2 2
 *  	3 3 3
 *  	4 4 4 4
 *  
 */
public class Pattern4 {

	public static void main(String[] args) {
		int n = 10;
		printPattern(n);
	}

	public static void printPattern(int n) {
		if (n == 0) {
			System.out.println("Please provide n greater than 0");
		}
		int number = 1;
		for (int i = 0; i < n; i++) {
			String row = "";

			for (int j = 0; j <= i; j++) {
				row = row + number + " ";

			}
			System.out.println(row.trim());
			number++;
		}
	}

}
