public class StaircaseProblem {
	public static void main(String[] args) {
		int[] array = {1, 1, 2, 2};

		System.out.println(combination(array, 0, 3, 0));
	}

	private static int combination(int[] array, int a, int b, int count) {

		if (a == b) {
			return count;
		}

		for (int i = a; i <= b; i++) {
			if (array[a] != array[i]) {
				swap(array, i, a);
				count++;	
				combination(array, a + 1, b, count);
				swap(array, i, a);
			} else {
				combination(array, a + 1, b, count);
			}
		}

		return count;

	}

	private static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}