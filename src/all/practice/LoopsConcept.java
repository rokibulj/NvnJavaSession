package all.practice;

public class LoopsConcept {
	public static void main(String[] args) {

		// Loop means to do avoid repeatative task, we can save number of line code.
		// Loop is two types: 1. While/For/DoWhile,
		// 2. Infinite Loop/Storage of memory loop.- pitfalls loop in Java.
		// Importance of loop concept we can avoid Repeatative Task, 
		// For pattern sequence.
		// When we see index based solution/Pattern from an Array/List, we use forloop.
		//
		//---------------------------------------------------------------------

		// WHILE LOOP: First do initialization than #1. Pass boolean condition in while statement, 
		// #2. Print Statement.
		// #3. Increment/Decrement, #4. Use BREAK keyword.
		//-----------------------------------------------------------------------
		
		// FOR LOOP: #1.Pass initialization, condition, Increment/Decrement in FOR Statement.
		// #2. Print Statement. 
		// Inside for loop with some condition(if-else) we can BREAK the Loop.
		//-----------------------------------------------------------------------
		
		// DO-WHILE LOOP: First do initialization than #1. Pass Print Statement and Increment in DO body.
		// #2. After Do body write WHILE statement and pass condition.
		// Its will run at least one time before checking condition.
		//
		//-----------------------------------------------------------------------

		int in = 10;
		for (int i = 0; i <= in; i++) {
			System.out.println(i);
		}

		System.out.println("While Loop practice");

		int i = 2;
		while (i <= 10) {
			System.out.println(i);

			if (i == 3) {
				System.out.println("Three is there");
				break;
			}
			i++;
		}

		boolean bl = false;
		while (!bl) {
			System.out.println("Hello Hassan");

			bl = true;

		}

		System.out.println("Do While Loop");

		int j = 21;

		do {
			System.out.println(j);
			j = j + 2;
		} while (j <= 20);
	}

}
