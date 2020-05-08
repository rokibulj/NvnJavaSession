package all.practice;

public class OverloadingLogin {
	
	// We can not create duplicate method within the class.
	// But We can  create duplicate method with different parameter within the class.
	
	// METHOD OVERLOADING: Within a class have multiple method having same
	// name with different parameter data types/sequence. Its call method OverLoading.
	
	

	public static void main(String[] args) {
		OverloadingLogin lp = new OverloadingLogin();
		lp.login();
		lp.login("hjkl", "kak");

	}
	
	public void login(){
		System.out.println("Login with 0 parameter");
	}
	
	public void login(String username){
		System.out.println("Login with 1 parameter");
	}
	
	public void login(String username, String password){
		System.out.println("Login with 2 parameter");
	}
	
	public void login(int number, String password){
		System.out.println("Login with 2 parameter");
	}
	
	public void login(String username, int number){
		System.out.println("Login with 2 parameter");
	}
	
	

}
