package abstractConcept;

public class LoginPage extends Page{
	
	public LoginPage() {
		System.out.println("Login Page Cons.....");
	}

	@Override
	public void title() {
		System.out.println("Login Page title");
		
	}

	@Override
	public void url() {
		System.out.println("Login Page url");
		
	}

	@Override
	public void footerLinks() {
		System.out.println("Login Page footerlikns");
		
	}
	
	public void doLogin(){
		System.out.println("Login the app");
	}

}
