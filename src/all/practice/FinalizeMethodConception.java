package all.practice;

public class FinalizeMethodConception {

	// Whenever Garbage collector coming inside Heap to destroy the object
	// before destro/deletion call Finalize method. The moment Finalize method
	// is completed than garbage collector will destroy the object.
	// Which object has no name Garbage collector destroy those object.

	// finalize method is available inside object class, we just override it.
	// OBJECT is the super class for all classes.

	// finalize automatically called by JVM before destroying object.

	// When FinalizeMethodConception class object will be null only that time
	// finalize method will call.

	public static void main(String[] args) {

		FinalizeMethodConception obj = new FinalizeMethodConception();
		obj = null;

		System.gc(); // Will call Garbage collector.
		System.out.println("GC is done.......");
	}

	@Override
	public void finalize() {
		System.out.println("This is Finalize method........");

	}

}
