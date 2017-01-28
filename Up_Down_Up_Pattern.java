public class Demo {
	public static void main(String[] args) {
		int startWith = 1;
		// print(startWith, 1, startWith < 10);
		printPattern(Integer.parseInt(args[0]));
	}

	

	public static void printPattern(int n) {

		int half = ((n % 2) == 0) ? (n / 2) : (n / 2) + 1;
		// System.out.println(half);
		int a = 1;
		int b = ((n % 2) == 0) ? (n * n) - n + 1 : (n * n) - (2 * n) + 1;

		for (int i = 1; i <= n; i++) {

			if (i <= half) {
				for (int j = 1; j <= n; j++) {
					if (a <= 9) {
						System.out.print("0" + a + ", ");
					} else {
						System.out.print(a + ", ");
					}
					
					a++;
				}
				a = (a + n);

			} else {
				for (int j = 1; j <= n; j++) {
					if (b <= 9) {
						System.out.print("0" + b + ", ");
					} else {
						System.out.print(b + ", ");
					}
					b++;
				}
				b = (b - (3 * n));
			}

			System.out.println();
		}
	}
}
