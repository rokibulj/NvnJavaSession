package all.practice;

public class Page {

	// Common Property
	String title;
	String url;
	String header;
	static String logo = "http://www.aws3.amazon.com/images/logo.png";
	

	public void topPanel() {
		System.out.println("Top Panel.");

	}

	public void leftPanel() {
		System.out.println("Left Panel.");

	}

	public void footerLink() {
		System.out.println("Footer Link.");

	}
	
	public static void privacyPolicy(){
		System.out.println("Privaly Policy");
	}

	public static void main(String[] args) {
		// Every Object has commomn property
		Page p1 = new Page();
		Page p2 = new Page();
		Page p3 = new Page();
		Page p4 = new Page();
		
		p1.title = "Login Page";
		p1.header = " Username and Password";
		p1.url = "http://sk.com/login";
		
		p2.title = "Home Page";
		p2.header = "Welcome to homepage.";
		p2.url = "http://sk.com/homepage";
		
		System.out.println(p1.title +" "+ p1.header +" "+ p1.url);
		
		p1.topPanel();
		p1.leftPanel();
		p1.footerLink();
		
		System.out.println(p2.title +" "+ p2.header +" "+ p2.url);
		
		
		System.out.println(p3.title);

	}

}
