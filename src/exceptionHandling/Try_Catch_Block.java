package exceptionHandling;

public class Try_Catch_Block {
	
	
	// Try-Catch block we have flexibility to handle exception.
	// Exception is unexpected behavior. It can be at Compile/Runtime.
	// It break flow, JVM got terminated.
	// Throwable is super class for all exception.
	// Exception are 2 types - Checked(Compile), Unchecked(Runtime).
	// Checked Exception - SQLException, IOException, ClassNotFoundException
	// Unchecked Exception - NullPointerException, ArithmaticException,
	// IndexOutOfBoudException.
	// Error - StackOverflow, OutOfMemory, FatalError very few of them.

	// ----------------HANDLING-------------
	// With help of TRY CATCH
	// TRY block for exception functionality handling.
	// CATCH block for reporting of the exception.
	// With a TRY block we can write multiple CATCH block.
	// 
	
	
	String name = "Bangladesh";

	public static void main(String[] args) {

		System.out.println("MD");
		System.out.println("Rokibul");
		System.out.println("Hassan");
		
		Try_Catch_Block tc = new Try_Catch_Block();
		tc = null;

		try {
			System.out.println(9 / 0);

		} catch (Exception e) {
			e.printStackTrace();// report details for exception
			System.out.println("Some exception occured during this division.....");// Customize
		}
		
		try{
		System.out.println(tc.name);
		}
		catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("NullPointerException");
		}
		
		System.out.println("Jony");
		
		Try_Catch_Block tc1 = new Try_Catch_Block();
		
		try{
		tc1.m1();
		}
		catch(Exception e){
			System.out.println("M1-Exception");
			e.printStackTrace();
		}
	}
	
	public void m1(){
		System.out.println("m1 method");
		int result = 9/0;
	}
	
	

}
