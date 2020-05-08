package accessModifier;

public class StartUp {

	public static void main(String[] args) {
		
		Company co = new Company();
		
		// Except Private all access available.
		co.getEmpCount();
		co.getLocation();
		co.getVPname();

	}

}
