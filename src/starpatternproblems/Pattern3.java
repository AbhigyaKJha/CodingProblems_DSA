package starpatternproblems;

/*
 *  if n=4, print below pattern
 *  	1
 *  	1 2
 *  	1 2 3
 *  	1 2 3 4
 *  
 */
public class Pattern3 {

	public static void main(String[] args) {
		int n = 2;
		printPattern(n);
	}

	public static void printPattern(int n) {

		for (int i = 0; i < n; i++) {
			String row = "";
			int number = 1;
			for (int j = 0; j <= i; j++) {
				row = row + number + " ";
				number++;
			}
			System.out.println(row.trim());
		}
	}
}
