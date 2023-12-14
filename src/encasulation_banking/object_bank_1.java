package encasulation_banking;

public class object_bank_1 {

	public static void main(String[] args) {
		
		class_Customer_1 p1 = new class_Customer_1("Sohrab Safi", "817-9443581", "888 John rd", "sb.safi286@gmail.com", "1993-08-16", 300.00, 886345628, "1222");
		
		// To change or update the value you can use setMethod()
		p1.setPhoneNumber("8179337287");
		
		// To get any values use getMethode()
		System.out.println(p1.getFullName());
		
		// To print the whole list use toStrign()
		System.out.println(p1);
		
		
		// To check the balance 
		p1.checkBlance("1222");
		
		// To deposit amount 
		p1.deposit(30.00, 886345628, "1222");
		System.out.println(p1);
		
		// Withdraw an amount
		p1.withdraw(100, "1222");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
