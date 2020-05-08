package exceptionHandling;

public class ThrowKeyword {
	
	// We use THROW keyword to create/generate own exception.
	// When we create object constructor will be called.
	
	// final keyword, finally block, finalize method.
	
	
	public static void main(String[] args) {
		
		try {
			throw new Exception("Own Exception.");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		String uname = "abc@gmail.com";
		
		if (uname.equals(" ") || uname.equals(null)) {
			try {
				throw new Exception("Blank cell value Exception.");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		else {
			System.out.println("login with..." + uname);
		}
		
	}

}
