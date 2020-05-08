package all.practice;

public class IncrementDecrement {
	
	public static void main(String[] args) {

		//++ and --
		int a = 1;
		a = a+1;
		System.out.println(a);
		
		int i = 1;
		int j = ++i; //pre increment
		System.out.println(i);//2
		System.out.println(j);//2
		
		int p =1;
		int q =p++; //post increment
		System.out.println(p);//2
		System.out.println(q);//1
		
		int m = 2;
		int n = --m; //pre decrement
		System.out.println(m);//1
		System.out.println(n);//1
		
		int c = 0;
		int d = c--;//post decrement
		System.out.println(c);//-1
		System.out.println(d);//0
		
		int f = -1;
		int g = --f;
		System.out.println(f);//-2
		System.out.println(g);//-2
		
		
		
	
	
}



}
