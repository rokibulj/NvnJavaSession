package accessModifierNew;

import accessModifier.Company;

public class Office {

	public static void main(String[] args) {
		
		Company cp = new Company();
		
		cp.getEmpCount(); // Public only outside package.

	}

}
