package accessModifier;

public class Company {

	// Private Modifier: Within Class- Y, Within Package- N, Outside Package by
	// Subclass Only- N, Outside Package- N.
	
	// Default Modifier: Within Class- Y, Within Package- Y, Outside Package by
	// Subclass Only- N, Outside Package- N.
	
	// Protected Modifier: Within Class- Y, Within Package- Y, Outside Package
	// by Subclass Only- Y, Outside Package- N.
	
	// Public Modifier: Within Class- Y, Within Package- Y, Outside Package by
	// Subclass Only- Y, Outside Package- Y.

	public static void main(String[] args) {
		
		Company cm = new Company();
		
		cm.getEmpCount(); // Public
		cm.getRevenue(); // Private
		cm.getLocation(); // Default
		cm.getVPname(); // Protected

	}

	public String name;
	private int revenue;
	protected String ceoNmae;
	String branch;

	public void getEmpCount() {
		System.out.println(1000);
	}

	private void getRevenue() {
		System.out.println(500000);
	}
	
	protected void getVPname(){
		System.out.println("Get VP Name.");
	}
	
	void getLocation(){
		System.out.println("Office Location.");
	}

}
