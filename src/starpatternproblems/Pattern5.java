package starpatternproblems;

/*
 *  if n=5, print below pattern
 *  	1 2 3 4 5
 *  	1 2 3 4
 *  	1 2 3
 *  	1 2
 *  	1
 *  
 */
public class Pattern5 {

	public static void main(String[] args) {

		int n = 5;
		printPattern(n);
	}

	public static void printPattern(int n) {
		if (n <= 0) {
			System.out.println("Please provide n greater than 0");
		}
		for (int i = 0; i < n; i++) {
			int number = 1;
			String row = "";
			for (int j = 0; j < n - i; j++) {
				row = row + number + " ";
				number++;
			}
			System.out.println(row.trim());
		}

	}

}
