package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist_replit {

	public static void main(String[] args) {
		// add colors in arraylist [Red, Green, Orange, White, Black]
		// print arraylist
		// sort arraylist by Alphabet
		// print sorted arraylist
		// Expected Output
		// List before sort: [Red, Green, Orange, White, Black]
		// List after sort: [Black, Green, Orange, Red, White]

		ArrayList<String> str = new ArrayList<String>();
		str.add("Red");
		str.add("Green");
		str.add("Orange");
		str.add("White");
		str.add("Black");
		System.out.println(str);
		Collections.sort(str);
		System.out.println(str);

	}

}
