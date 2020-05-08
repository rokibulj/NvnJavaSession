package all.practice;

public class DataConversion {
	
	// Data Conversion will be used by WRAPPER CLASS.
	// ParseInt method return a number String as integer.
	// Integer to String : String.valueOf() Method. Anything allowed.

	public static void main(String[] args) {
		 
		String a = "100";
		 System.out.println(a+20);// Its String, but my target integer.
		 
		 // ParseInt method return a number String as integer.
		 
		 int i = Integer.parseInt(a);
		 System.out.println(i+20);
		 
		 String b = "12.33";
		 double k = Double.parseDouble(b)+20;
		 System.out.println(k);
		 
		 // NumberFormatException, bcz its will not take asci value.
//		 String j = "100k";
//		 int l = Integer.parseInt(j)+10;
//		 System.out.println(l);
		 
		 // Integer to String : String.valueOf() Method.
		 
		 int t = 100;
		 String kj = String.valueOf(t);
		 System.out.println(100+kj);

	}

}
