package all.practice;

public class StringConcat {
	
	public static void main(String[] args) {

		String x = "Test";
		String y = "Selenium";
		
		int a = 100;
		int b = 200;
		
		double d1 = 12.33;
		double d2 = 10.33;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(d1+d2);
		
		System.out.println(a+d1);
		
		System.out.println(x+a);
		
		System.out.println(a+x);
		
		System.out.println(a+b+x);
		
		System.out.println(a+b+x+y);
		
		System.out.println(x+y+a);
		System.out.println(x+y+a+b);//TestSelenium100200
		
		System.out.println(x+y+(a+b));

		System.out.println(x+y+a+b+d1+d2);
		
		System.out.println(a+b+x+y+d1+d2);
		
		System.out.println("the value of a is: "+ a);
		System.out.println("the value of b is: "+ b);
		System.out.println("the sum of a and b is: "+ a+b);
		System.out.println("the sum of a and b is: "+ (a+b));


		char c1 = '9';//57
		char c2 = 'b';//98
		System.out.println(c1+c2);//195
		
		//a-z: 97 to 122
		//A-Z : 65 to 90
		//0-9: 48 to 57

		
		
		
		
	}

}
