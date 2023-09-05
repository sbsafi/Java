package randomPractice;

public class Practice {
	public static void main(String[] args) {

		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		// Creat a nested loop for this
		int setCount = 15;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= setCount; j++) {
				System.out.print(j + " ");
			}
			System.out.println(i);
		}

	}
}
