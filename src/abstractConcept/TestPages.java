package abstractConcept;

public class TestPages {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		
		lp.title();
		lp.url();
		lp.footerLinks();
		lp.doLogin();
		
		Page p = new LoginPage();
		// p.doLogin(); its can access, bcz reference type check.
		

	}

}
