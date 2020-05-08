package interfaceConcept;

public class TestHospital {
	
	// Interface don't have body, Only prototype. It's call abstract method.
	// We are not able create a object for Interface.
	// We can use Interface to create Object Reference variable.
	// We can't create static prototype method in Interface, 
	// Because we can't override static method.
	// Interface variables are by default static and final.
	// Down casting  is not allowed for Interface.
	// ApolloHospital class is child for Interfaces.
	// For inherit use implements keyword.
	// Java allow multiple inheritance for Interface with comma separated.

	public static void main(String[] args) {
		
		// Create Object
		ApolloHospital ap = new ApolloHospital();
		ap.ambulanceService();
		ap.emergencyService();
		ap.ENTService();
		ap.medicalInsurance();
		
		USMedical.service_1();// Static way.
		ap.internship();
		
		System.out.println(ap.min_fee);// Gotta warning
		System.out.println(USMedical.min_fee); // called by static way. No warning.
		
		// Create Object using Interface reference.
		USMedical us = new ApolloHospital();
		us.oncologyService();
		us.orthopedicService();
		us.physioService();
		

	}

}
