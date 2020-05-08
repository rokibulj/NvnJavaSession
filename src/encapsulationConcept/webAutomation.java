package encapsulationConcept;

public class webAutomation {
	
	// Internal logic are private, but access with public method.
	
	public void launchBrowser(){
		interactwithBrowser();
	}
	
	private void interactwithBrowser(){
		browsercompatibility();
	}
	
	private void browsercompatibility(){
		chechBrowserVersion();
	}
	
	private void chechBrowserVersion(){
		checkBrowserWithOS();
	}
	
	private void checkBrowserWithOS(){
		System.out.println("Launching browser ..........");
	}

}
