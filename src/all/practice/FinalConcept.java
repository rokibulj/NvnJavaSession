package all.practice;

public class FinalConcept {
	
	// Final Finally is keyword, Finalize a method for garbage collection.
	// Final is always use to provide constant value.
	// If a variable declared with final value will not change.
	// Ex: 7 days a week, 12 months in a year, 24 hours in days.
	
	// Inside a class we can create another class. But those can't be public.
	// If any class declared as final that cannot have child class.
	// Final keyword is to prevent Inheritance & Override.
	
	// If a method declared as final we can not override that.
	

	public static void main(String[] args) {
		
		int i = 10;
		i=14;
		System.out.println(i); // result: 14
		
		final int k = 10;
		// k=14; it's not allow.
		System.out.println(k);
		
		String loginPageTitle = "Login";
		System.out.println(loginPageTitle);
		
		

	}

}
