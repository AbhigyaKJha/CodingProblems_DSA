package starpatternproblems;

/*
 *  if n=5, print below pattern
 *  	* * * * *
 *  	* * * *
 *  	* * *
 *  	* *
 *  	*
 *  
 */
public class Pattern6 {

	public static void main(String[] args) {

		int n = 5;
		printPattern(n);
	}

	public static void printPattern(int n) {
		if (n <= 0) {
			System.out.println("Please provide n greater than 0");
		}
		for (int i = 0; i < n; i++) {

			String row = "";
			for (int j = 0; j < n - i; j++) {
				row = row + "* ";

			}
			System.out.println(row.trim());
		}

	}
}
