package all.practice;

public class DataType {
	
public static void main(String[] args) {
		
		//primitive data types: short, byte, int, long, float, double, char, boolean

		//data types:
		//integer family:
		//1. byte:
		//size: 1 byte = 8 bits
		//range: -128 to 127
		byte b = 10;
		 System.out.println(b);
		 b = 20;
		 System.out.println(b);
		byte b1 = -1;
		byte b2 = 120;
		System.out.println(b1+b);
		System.out.println(b2-b);
		
		//2. short: 
		//size: 2 bytes = 16 bits
		//range: -32768 to 32767
		short s = 1000;
		short s1 = 90;
		
		//3. int:
		//size: 4 bytes = 32 bits
		//range: -2147483648 to 2147483647
		int i = 120;
		int i1 = -10;
		int i2 = 0;
		
		//4. long: 
		//size: 8 bytes = 64 bits
		//range: 
		long l1 = 120000;
		long l2 = 12222220;
		
		//double family:
		//5. float:
		//size: 4 bytes : 32 bits
		float f1 = 12.33f;
		float f2 = (float)34.44;
		float f3 = 100;//100.00
		
		//6. double:
		//size: 8 bytes: 64 bits
		double d1 = 12.33333;
		double d2 = -19.3222;
		
		System.out.println(d2-d1);
		
		//7. char:
		//size: 2 bytes: 16 bits
		char c1 = 'a';
		char c2 = '1';
		char gender = 'f';
		char c3 = '$';
		
		//8. boolean: 
		//size: ~1 bit
		boolean t1 = true;
		boolean t2 = false;
		
		//9. String: is not a data type...its a class
		String str = "hello world";
		String str1 = "Testing";
		String name = "Naveen";
		String dis = "12.33";
		
		System.out.println(str);
		System.out.println(str1);
		
		System.out.println(10000);
		System.out.println(dis);
		
		System.out.println("Hello Naveen");
		
		
		
		
		
}

}
