package starpatternproblems;

/*
 *  if n=4, print below pattern
 *  	*
 *  	* *
 *  	* * *
 *  	* * * *
 *  
 */
public class Pattern2 {

	public static void main(String[] args) {
		printPattern(5);
	}

	public static void printPattern(int n) {

		for (int i = 0; i < n; i++) {
			String row="";
			for (int j = 0; j <= i; j++) {
				row=row+"* ";
			}
			System.out.println(row.trim());
		}
	}

}
