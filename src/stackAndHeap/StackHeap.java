package stackAndHeap;

public class StackHeap {

	public static void main(String[] args) {                             
		String str1 = "test";                                               
		String str2 = "test";												
		String str3 = new String("test");
		
		System.out.println(str1 == str2);
		System.out.println();
																					/*   				    Stack											Heap
																					 * 			   	  ______________							 _____________________________
																					 * 				 |			    |							|   						  |
																					 * 	             |    		    |							|	@123			     	  |
																					 * 	             | 			    |							| 	 ___________			  |
																					 * 				 |		        |							|	|			|			  |
																					 *               |		        |							|	|			|		      |
																					 *               |_____________ |							|	| "test"    |             |
																					 *  	         |______________|			 	          	|   |___________|             |
																					 *	 			 |_____@123_____|							|_____________________________|
																					 * 
																					 * 
																					 * 
																					 * 
																					 * 
																					 * 
																					 * 
																					 * 
																					 * 
																					 * 
																					 */
	
		
		

	}

}
