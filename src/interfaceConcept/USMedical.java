package interfaceConcept;

public interface USMedical {
	
	int min_fee = 100;
	
	public void physioService();
	
	public void oncologyService();
	
	public void orthopedicService();
	
	
	// From JDK 1.8 we can have static method in interface but with body.
	// static method with method body.
	// default method can declare with body. Can't be Override &  Static.
	
	public static void service_1(){
		System.out.println("USMedical -------- 911");
	}
	
	default void internship(){
		System.out.println("USMedical -------- internship.");
	}
	

}
