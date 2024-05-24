package pattern;

public class FlipRightTriangle {
	public static void main(String[] args) {
		int n = 5;
		int i, j;
		for (i = 0; i <= n; i++) {

			for (j = n; j >= i; j--) {
				if (i >= j) {
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}