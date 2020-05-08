package exceptionHandling;

public class ThrowsKeyword {
	
	// Inside non-static method we can directly call another non-static
	// method.
	// But Inside a static method we need to create object for calling
	// non-static method.
	// If we use THROWS keyword than JVM will handle/catching that
	// exception, but its not a good practice. Because nobody catching.
	// Best practice to use try-catch block.
	// With thrown we are passing exception.

	public static void main(String[] args) {
		

		ThrowsKeyword tk = new ThrowsKeyword();
		
		// But this way we are not handling flow properly.
		try {
			tk.launchBrowser();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void launchBrowser() throws Exception {
		System.out.println("launchBrowser..........");
		launchUrl();
	}

	public void launchUrl() throws Exception {
		System.out.println("launchUrl..........");
		login();
	}

	public void login() throws Exception{
		System.out.println("login........");
		
		int j = 9 / 0;
		System.out.println("ABC");
	}

}
