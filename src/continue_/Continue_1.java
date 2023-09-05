package continue_;

public class Continue_1 {

	public static void main(String[] args) {

		// Continue ==> skipping the rest of the current iteration

		for (int i = 0; i < 10; i++) {
			
			if (i == 5) {
				// When is i == to 5, it skipp number 5 and continue the loop <it wont print 5>
				// Check the console to undrestand.
				continue;
			}
			System.out.println(i);
		}

	}

}
