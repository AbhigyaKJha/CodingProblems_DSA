package starpatternproblems;

/* print below star pattern
 *     
 *     * * * *
 *     * * * *
 *     * * * *
 *     * * * *
 *     
 *     Or print as per n
 */
public class Pattern1 {

	public static void main(String[] args) {

		printPattern(4);
	}

	public static void printPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
