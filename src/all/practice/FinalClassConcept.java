package all.practice;

public class FinalClassConcept extends FinalConcept {

	// Inside a class we can create another class.
	// But those can't be public.
	//

	public static void main(String[] args) {

	}

	public void m1() {
		System.out.println("m1");
	}

}

class chidClass extends FinalClassConcept {

	
}
