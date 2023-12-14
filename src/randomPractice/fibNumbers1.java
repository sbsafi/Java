package randomPractice;

import java.util.ArrayList;

public class fibNumbers1 {

	public static void main(String[] args) {
		int count = 10;

		ArrayList<Integer> fibNums = new ArrayList<Integer>();
		fibNums.add(0);
		fibNums.add(1);
		for (int i = 0; i < count - 2; i++) {

			int sum = fibNums.get(i) + fibNums.get(i + 1);
			fibNums.add(sum);
		}

		System.out.println(fibNums);

	}

}
