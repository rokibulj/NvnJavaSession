package all.practice;

public class LoginPage {

	public static void main(String[] args) {
		

	}
	
	public HomePage login(String un, String pd){
		System.out.println("User name is :" + un);
		System.out.println("Password is : " + pd);
		System.out.println("Click on login button.");
		
		// Yes we can return a class object(home page) from a another class method(login).
		
		return new HomePage();
	}

}
