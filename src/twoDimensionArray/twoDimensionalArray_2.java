package twoDimensionArray;

public class twoDimensionalArray_2 {

	public static void main(String[] args) {

		// Creating a 2D array of String and going through wach with for each.

		// We can write this way as well.
		// String[][] str = new String[3][2];

		String[][] str = { { "Java", "C" }, { "C#", "C++" }, { "API", "Selenium" } };

		// Using For each loop

		// Stracture
		// for(dara-type of each index Pointer : name of the collection){Body}
		for (String[] row : str) {
			for (String val : row) {
				System.out.print(val + ", ");
			}
			System.out.println();

		}

	}

}
