package all.practice;

public class MainMethodOverloading {

	// Java is not allow overloading main method.
	// But we can write which is does not throw any error.
	// But execution time it will look for main method with original signature.
	// We can overload static method too.
	
	// Within a package we can call static members without creation object.
	// Call A -- B, B -- A. Exception: stackOverFlowError

	public static void main(String[] args) {
		main(2, "er");
		main(3);

	}

	public static void main(int ab) {
		System.out.println("Main metod 2");

	}

	public static void main(int ab, String bc) {
		System.out.println("Main method 3");

	}

}
