public class StaircaseProblem_Recursive {
	public static void main(String[] args) {
		System.out.println(ways(Integer.parseInt(args[0])));
	}

	public static int ways(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("negative values are not allowed..");
		}

		if (n == 0 || n == 1) {
			return 1;
		}

		return (ways(n - 1) + ways(n - 2)); 
	}
}
