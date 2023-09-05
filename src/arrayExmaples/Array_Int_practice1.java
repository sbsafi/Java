package arrayExmaples;

public class Array_Int_practice1 {
	public static void main(String[] args) {

		// create an int of array

		int[] numbers = new int[4];

		numbers[0] = 20;
		numbers[1] = 30;
		numbers[2] = 4;
		numbers[3] = 33;

		System.out.println(numbers[3]);

		System.out.println("The length of the array : " + numbers.length);
		int sum = 0;

		int count = 0;
		while (count < numbers.length) {
			sum = sum + numbers[count];

			System.out.println("Printing all of the integers through while loop :" + numbers[count++]);
			System.out.println("The sum is : " + sum);

		}

	}
}
