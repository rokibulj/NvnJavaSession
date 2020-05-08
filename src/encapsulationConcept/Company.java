package encapsulationConcept;

public class Company {
	
	
	// Encapsulation means data hiding and access with public method.
	// Encapsulation means Hide something. Which declared as Private.
	// Access private property use getter & setter method.
	// First set than get.
	// Right click, select source, select getter & setter.
	// Create clean method.
	
	
	
	
	String name;
	String logo;
	int empCount;
	private String engine;
	private int revenue;
	
	//setter & getter
	
	public void setEngine(String engine){
		this.engine=engine;
	}
	
	public String getEngine(){
		return engine;
	}
	
	

}
