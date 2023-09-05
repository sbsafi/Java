package selections;

public class VendingMachine {
	public static void main(String[] args) {

		String a1Name = "popcorn";
		String a2Name = "KitKat";
		String a3Name = "Gum";
		String a4Name = "Lays";
		int a1Qnty = 19;
		int a2Qnty = 10;
		int a3Qnty = 4;
		int a4Qnty = 13;

		String b1Name = "RedBull";
		String b2Name = "Monster";
		String b3Name = "Tea";
		String b4Name = "Coffee";
		int b1Qnty = 6;
		int b2Qnty = 8;
		int b3Qnty = 2;
		int b4Qnty = 7;

		if (a2Qnty > 0) {
			System.out.println("Drop " + a2Name);
			--a2Qnty;
			System.out.println("we have " + a2Qnty + " of " + a2Name + " in stock .");

		} else {
			System.out.println("Sorry for inconvinence!");

		}

		if (b4Qnty > 0) {
			System.out.println("Drop : "  + a4Name);
			--b4Qnty;
			System.out.println("We have " + b4Qnty + " of " + b4Name + " in stock.");

		} else {
			System.out.println(" Sorry we are short for the item. ");

		}

		if (b1Qnty > 0) {
			System.out.println("Droped : " + b1Name);
			--b1Qnty;
			System.out.println("we have " + b1Qnty + " of " + b1Name + " in Stock.");
		} else {
			System.out.println("Sorry we are short in this item : " + b1Name);
		}

	}

}
