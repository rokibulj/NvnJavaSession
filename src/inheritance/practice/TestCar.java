package inheritance.practice;

public class TestCar {

	// Inheritance: Child can INHERIT something from Parent.
	// Parent are not allow to INHERIT from child.
	// Parent can have multiple child, But Child can't have multiple parent.
	// Java does not allow multiple Inheritance because it's create diamond
	// problem.
	// Java allowed multi-level Inheritance such as G.parent-Parent-Child.
	// Inheritance is not allowed between siblings(Only Parent & Child).
	// Parent = Super class, Child = Sub class.

	// ........... METHOD OVERRIDE...........
	// When we have a method in parent/super class as well as child/sub class
	// with same name and signature is called METHOD OVERRIDING.
	// Parent can not take anything from child.

	// Top Casting
	// Child class object Refereed by parent class reference variable.
	// With help of this reference variable can access only Override &
	// Parent class method, not child class method.

	// Down casting is not allow in java at the Runtime which is
	// gives you ClassCastException.

	// Method Overriding & Overloading both are called Polymorphism in Java
	// Poly=Many, Morphism=forms.

	// Final method is used to prevent Inherit method.
	// If we declare Final keyword before class than this class can't become
	// parent.
	// Object cannot hold any static property, bcz it's common for all.

	// We can Overloading Static method but can't Override.

	public static void main(String[] args) {

		// Child can take take Parent Property.
		BMW b = new BMW();
		b.start(); // Override-Car
		b.fillFuel(); // Car
		b.autoParking();// BMW
		b.stop();// Car
		b.engine();// Vehicle

		// Parent can't take child properties.
		Car c = new Car();
		c.start();
		c.fillFuel();
		c.stop();
		c.engine();

		// Child class object Refereed by parent class reference variable.
		// IT'S CALL TOP CASTING.
		Car c1 = new BMW();
		c1.start(); // Override method will call.
		c1.fillFuel();
		c1.stop();

		Vehicle v1 = new BMW();

		// c1.autoParking(); Can't access. because there has security layer for
		// checking
		// reference variable.

		// Parent class object don't allow to use Child class reference
		// variable.
		// I have to do casting for convert.
		// IT'S CALL DOWN CASTING.
		BMW b1 = (BMW) new Car();
		b1.autoParking();

		// Down casting is not allow in java at the Runtime which is
		// gives you ClassCastException.

	}

}
