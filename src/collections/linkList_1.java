package collections;

import java.util.LinkedList;

public class linkList_1 {

	public static void main(String[] args) {

		// LinkedList and ArrayList are inheriting from List class.
		// LinkedList methodes are same as ArrayList.
		// LinkedList is divided in to parts.
		// 1 - Singly ==> it has one node.
		// 2 - Doubly ==> it has two nodes.
		// The LinkedList we are using is Doubly linkedlist.

		LinkedList<String> temp = new LinkedList<String>();
		temp.add("Sohrab");
		temp.add("Milad");
		temp.add("Elham");
		temp.add("Bahar");

		for (String names : temp) {
			System.out.println(names);
		}
		
		
		
	}

}
