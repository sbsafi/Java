package twoDimensionArray;

public class twoDimensionalArrayOf_int_3 {

	public static void main(String[] args) {

		// Create a 2D array of int
		// 3 x 5
		// Create a for loop that goes through the array
		// Create int x and assign the value 1
		// on every iteration, assign x++ to that iteration

		// We can write this way too.
		int[][] nums = new int[3][5];

		int x = 1;

		for (int row = 0; row < nums.length; row++) {
			for (int col = 0; col < nums[row].length; col++) {
				nums[row][col] = x++;
			}
		}
		// We want to print the valuse of this array
		for (int row = 0; row < nums.length; row++) {
			for (int col = 0; col < nums[row].length; col++) {
				System.out.print(nums[row][col] + ", ");
			}
			System.out.println();

		}
		// Create an int sum and assign value 0
		// go through the array temp and add all of the values to sum
		int sum = 0 ;
		for (int row = 0; row<nums.length;row++) {
			for(int col = 0; col<nums[row].length;col++) {
				 sum += nums[row][col]; 
			}
		}
		System.out.println("Sum " + sum);
		
	}

}
