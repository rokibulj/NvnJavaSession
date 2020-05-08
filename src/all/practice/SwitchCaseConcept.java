package all.practice;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		
//		int i = 9;
//		int j = 9/0;// 0/0
//		System.out.println(j);
		
		//There is no infiniti in JAVA. 
		//So its will give you ArithmeticException
		
		
		int num = 40; 
		
		// In switch case we need to pass a KEY. 
		// Than pass multiple cases with a BREAK keyword.
		// Switch case work as like IF-ELSE. 
		// Case  work like IF.
		// If case is not satisfied than it will move to next case.
		// When the CASE will satisfied it will break the loop.
		// In a IF statement we cannot use BREAK keyword.
		
		 	
		switch (num) {
		case 10:
			System.out.println(10);
			break;
			
			case 20:
			System.out.println(20);
			break;
			
			case 30:
			System.out.println(30);
			break;

		default:
			System.out.println("Case is not found.");
			break;
		}

	}

}
