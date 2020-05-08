package interfaceConcept;

public class ApolloHospital implements USMedical, UKMedical, IndiaMedical {

	@Override
	public void physioService() {
		System.out.println("AP------ physioService");

	}

	@Override
	public void oncologyService() {
		System.out.println("AP --------- oncologyService");

	}

	@Override
	public void orthopedicService() {
		System.out.println("AP ---------- orthopedicService");

	}

	@Override
	public void ENTService() {
		System.out.println("AP -------- ENTService");

	}

	@Override
	public void ambulanceService() {
		System.out.println("AP ------------ ambulanceService");

	}

	@Override
	public void emergencyService() {
		System.out.println("AP ------------ emergencyService ");

	}

	@Override
	public void neoroService() {
		System.out.println("AP ----------- neoroService");

	}

	@Override
	public void pediatricService() {
		System.out.println("AP ---------- pediatricService");

	}

	// Non-Override Method
	
	public void OPTService(){
		System.out.println("AP -------- OPTService");
	}
	
	public void medicalInsurance(){
		System.out.println("AP ------- medicalInsurance");
	}
	
	public void pathologyService(){
		System.out.println("AP -------- pathologyService");
	}

}
