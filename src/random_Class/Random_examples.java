package random_Class;

import java.util.Random;

public class Random_examples {

	public static void main(String[] args) {
		
		
		// Random class generates a random number for you and it comes with Java 
		// first create an object of Random Class 
		// you call the methode nextInt(maz range) on the object
		// you define the range as the parameter
		
		Random random = new Random();
		int nums = random.nextInt(10) + 1;
		System.out.println(nums);
		
		
		
	}

}
