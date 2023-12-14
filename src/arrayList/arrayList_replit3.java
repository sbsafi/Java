package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList_replit3 {

	public static void main(String[] args) {
		// create arrylist and add colors [Red, Green, Orange, White, Black]
		// print arrylist before shuffle
		// shuffle arraylist
		// ** Note **
		// we didn't put reuslt for after shuffle in expected output, because every time
		// after run of the code you will get different result. you can compare your
		// code with solution after due date.

		// Expected Output
		// List before shuffling:
		// [Red, Green, Orange, White, Black]

		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Orange");
		colors.add("White");
		colors.add("Black");
		System.out.println(colors);
		Collections.shuffle(colors);
		System.out.println(colors);
		

	}

}
