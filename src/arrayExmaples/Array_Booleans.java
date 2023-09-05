package arrayExmaples;

public class Array_Booleans {

	public static void main(String[] args) {
		// Create an array of booleans with size 7
		// name of the array is temp
		// then print the name of array
		// then print all of the indexes of the array
		// then assign these values to the array
		// true
		// false
		// true
		// false
		// true
		// false
		// false
		// print all of the values of the array again
		
		
		boolean[] temp = new boolean[7];
		System.out.println(temp);
		
		System.out.println(temp[0]);
		System.out.println(temp[1]);
		System.out.println(temp[2]);
		System.out.println(temp[3]);
		System.out.println(temp[4]);
		System.out.println(temp[5]);
		System.out.println(temp[6]);

		temp[0] = true;
		temp[1] = false;
		temp[2] = true;
		temp[3] = false;
		temp[4] = true;
		temp[5] = false;
		temp[6] = false;
		
		System.out.println(temp[0]);
		System.out.println(temp[1]);
		System.out.println(temp[2]);
		System.out.println(temp[3]);
		System.out.println(temp[4]);
		System.out.println(temp[5]);
		System.out.println(temp[6]);
		
		
		
		
		System.out.println("**********************************************");
		
		// Second way 
		
		int [] numbers = { 10, 30, 44, 11, 90};
		
		System.out.println("Length " + numbers.length);
		// this lenght is not a method and it is only variable .
		// array does not have length method. When it does not have ().
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		
		
		// Going through loop and print them 
		
		int index = 0; // this is gonna count the indexes 
		while (index < numbers.length) {
			System.out.println(numbers[index++]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
