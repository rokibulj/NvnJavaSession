package abstractConcept;

public abstract class Page {
	
	// In a Abstract class must have abstract keyword.
	// Using abstract class bcz common properties for every pages define here.
	// We can't create object for Abstract class.
	// We can create constructor for abstract class.
	// But this constructor will called when we create object of child class.
	// We can have non abstract method in abstract class,
	// It's called partial abstraction.(0-100%)
	// But in Interface is 100% abstraction.
	// Always override method will called.
	// Abstract class can't be final.
	// 
	
	
	public Page(){
		System.out.println("Abstarct class const.....");
	}
	
	public abstract void title();
	public abstract void url();
	public abstract void footerLinks();
	
	public void logo(){
		System.out.println("Logo for Page");
	}
	

}
