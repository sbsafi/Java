package interviewCodes;

public class EvenOrOdd {

	public static void main(String[] args) {
		isEvenOrOdd(17);
		isEvenOrOdd(18);
		isEvenOrOdd(20);

	}

	public static void isEvenOrOdd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is even number.");
		} else {
			System.out.println(num + " is odd number.");
		}
	}

}
