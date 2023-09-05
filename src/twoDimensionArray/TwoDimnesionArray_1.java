package twoDimensionArray;

public class TwoDimnesionArray_1 {

	public static void main(String[] args) {

		// Creating an 2D array of int
		// Size is 3 rows and 4 cols
		int[][] num2d = new int[3][4];
		// Assigning the valuse to the first row
		num2d[0][0] = 10;
		num2d[0][1] = 22;
		num2d[0][2] = 43;
		num2d[0][3] = 33;
		// Assigning to the second row
		num2d[1][0] = 11;
		num2d[1][1] = 32;
		num2d[1][2] = 20;
		num2d[1][3] = 77;
		// Assigning to the third row
		num2d[2][0] = 99;
		num2d[2][1] = 65;
		num2d[2][2] = 91;
		num2d[2][3] = 50;

		System.out.println("num2d.length  "+num2d.length);
		System.out.println("num2d[0].length "+num2d[0].length);

		for (int row = 0; row < num2d.length; row++) { // This goes through rowa
			for (int col = 0; col < num2d[row].length; col++) // This goes through all cols
				System.out.print(num2d[row][col]+ ", ");
		}
		System.out.println();

	}

}
