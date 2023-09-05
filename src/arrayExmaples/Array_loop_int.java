package arrayExmaples;

public class Array_loop_int {

	public static void main(String[] args) {
		
		int [] numbers = {23,243,4,3,5,6,4,3,66,90};
		
		System.out.println("This is the length of the Array " + numbers.length); // printing the lenght. 
		
		int count = 0; // This is gonna count the indexes.
		while (count < numbers.length) {
			System.out.println("Index " + count + "==> " +numbers[count++]);
			
		}

	}

}
