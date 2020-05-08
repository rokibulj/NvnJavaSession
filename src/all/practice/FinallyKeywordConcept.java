package all.practice;

public class FinallyKeywordConcept {

	// Finally keyword for a block.
	// Finally keyword always used with try catch block.
	// Whatever we write down inside a Finally block does not matter exception
	// is coming or not that finally block will be executed.
	// try- catch- finally depend on each other.
	// We don't return anything from finally block.
	

	public static void main(String[] args) {
		
		int i=10;
		try{
			System.out.println("div process......");
			int k=i/0;
		}
		catch (Exception e) {
			System.out.println("Some exception is coming......");
		}
		 finally {
			System.out.println("Hey here is the finally block.......");
		}
		
		System.out.println("Check this concept.");

		int k= getNumber();
		System.out.println(k);
	}
	
	public static int getNumber(){
		int a=10; 
		int b=15;
		
		try{
			int c=a/0;
			return c;
		}
		catch (Exception e) {
			return -1;
		}
		finally {
			System.out.println("Bye.......");
			int age = 35;
			//return age; // c will override this block.
		}
	}

}
