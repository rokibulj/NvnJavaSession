package all.practice;

public class StaticAndNonStaticConcept {

	// 1. How to call static data members(variables, functions) inside a static
	// function?
	// For static members no need create object.
	// Call static way directly by name/ class name.
	// 2. How to call non static data members(variables, functions) inside a
	// static function?
	// Create class Object than can call.
	// Q. Can I static members by Object ? Yes. But do on static way.

	// Java Memory is divided by two parts: Heap and Stack.
	// Heap: Here stored all objects. Non static members.
	// Stack: Here stored Reference variable(obj).
	// Inside Stack memory has COMMON MEMORY ALLOCATION Static Area for Static members.
	
	// Q. Can I create object without reference name? Yes.
	// Such as (new ClassName).
	// But there has a problem with memory management.
	// Garbage collector activated by JVM. Programmer can call(System.gc();) too.
	// GC get in Heap Memory and collect those object which dont have any rf name for release some memory.
	// Exception: NullPointerException.

	String name;
	static int age = 25;

	public static void main(String[] args) {

		getStart();
		System.out.println(age);

		StaticAndNonStaticConcept.getStart();
		System.out.println(StaticAndNonStaticConcept.age);

		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.getName();
		System.out.println(obj.name);

		obj.getStart();
		System.out.println(obj.age);
	}

	public void getName() {
		System.out.println("get name: ");
	}

	public static void getStart() {
		System.out.println("get start: ");
	}

}
