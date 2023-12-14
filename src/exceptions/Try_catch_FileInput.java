package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Try_catch_FileInput {

	public static void main(String[] args) {
		
		
		
		// trying to read a file and see how exceprion is handiling it 
		try {
		FileInputStream file = new FileInputStream(new File("c/somewhere/123.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println("This line of code takes care of all Exception no matter what.");
		}
		

	}

}
