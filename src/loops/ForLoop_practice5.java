package loops;

public class ForLoop_practice5 {

	public static void main(String[] args) {

		// Based on the boolean above, i want to see one of the following results.

		// reverse = false [1,2,3,4,5]
		// reverse = true [5,4,3,2,1]

		int start = 1;
		int stop = 5;
		boolean reverse = false;

		System.out.print("[");
		if (reverse) {
			for (int i = stop; i >= start; i--) {
				if (i > start) {
					System.out.print(i + ", ");
				} else {
					System.out.print(i);
				}
			}
		} else {
			for (int i = start; i <= stop; i++) {
				if (i < stop) {
					System.out.print(i + ", ");
				} else {
					System.out.print(i);
				}
			}
		}
		System.out.println("]");

	}

}
