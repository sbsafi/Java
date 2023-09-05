package arrayExmaples;

public class Int_Array_practice2 {

	public static void main(String[] args) {

		int[] nums = { 12, 22, 33, 42 };

		System.out.println("Length of the Array : " + nums.length);

		int count = 0;

		while (count < nums.length) {
			System.out.println("Printing the arrays : " + nums[count++]);
		}

	}

}
