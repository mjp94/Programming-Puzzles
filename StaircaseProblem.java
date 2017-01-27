import java.util.Set;
import java.util.HashSet;

public class StaircaseProblem {
	public static void main(String[] args) {
		/*StringBuilder sequence = new StringBuilder(args[0]);
		Set<String> set = new HashSet<>();

		uniquePermutations(sequence, 0, args[0].length() - 1, set);
		System.out.println(set.size());*/

		/*int count = 1;

		while (add)
		boolean added = addTwo(sequence);

		System.out.println(sequence.toString() + " " + added);*/


		System.out.println(waysToClimb(Integer.parseInt(args[0])));

	}

//	handle carefully, recursion is being performed here
	private static void uniquePermutations(StringBuilder sequence, int a, int b, Set<String> set) {

		if (sequence.charAt(a) == sequence.charAt(b)) {
			set.add(sequence.toString());
			return;
		}

		for (int i = a; i <= b; i++) {
			if (sequence.charAt(a) != sequence.charAt(i)) {
				swap(sequence, i, a);
				uniquePermutations(sequence, a + 1, b, set);
				swap(sequence, i, a);
			} else {
				uniquePermutations(sequence, a + 1, b, set);
			}
		}

	}

	private static void swap(StringBuilder sequence, int a, int b) {
		char temp = sequence.charAt(a);
		sequence.setCharAt(a, sequence.charAt(b));
		sequence.setCharAt(b, temp);
	}

	private static boolean addTwo(StringBuilder sequence) {
		int indexOfTwoConsecutiveOnes = sequence.indexOf("11");
		if (indexOfTwoConsecutiveOnes > -1) {
			sequence.replace(indexOfTwoConsecutiveOnes, indexOfTwoConsecutiveOnes + 2, "2");
			return true;
		}

		return false;
	}

	public static int waysToClimb(int n) {
		// validation here

		int count = 0;

		StringBuilder sequence = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sequence.append("1");
		}

		count = 1;

		boolean twoAdded = addTwo(sequence);

		while (twoAdded) {
			Set<String> set = new HashSet<>();
			uniquePermutations(sequence, 0, sequence.length() - 1, set);
			count = count + set.size();
			twoAdded = addTwo(sequence);
		}

		return count;
	}
}
