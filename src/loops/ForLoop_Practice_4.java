package loops;

public class ForLoop_Practice_4 {

	public static void main(String[] args) {
		// create a loop that starts from 1 and goes to 5
		// print this with the loop "[1, 2, 3, 4, 5]"

		int start = 1;
		int stop = 5;
		System.out.print("[");
		for (int i = start; i <= stop; i++) {
			if (i < stop) {
				System.out.print(i + ", ");
			} else {
				System.out.print(i);
			}
		}
		System.out.println("]");

	}

}
