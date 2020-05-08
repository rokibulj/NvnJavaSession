package all.practice;

import java.util.Arrays;

public class StringManipulation {
	
	// String is collection of multiple characters.
	// string maintain character Array internally.
	// Trim method remove before & after spaces from a string, not inside spaces.
	// Replace method used to remove some char
	
	

	public static void main(String[] args) {
		
		String stg = "This is my first java code and love coding.";
		
		System.out.println(stg.length());// String length.
		
		// Pass index number get the character.
		System.out.println(stg.charAt(9));
		
		// Pass character get index number.
		System.out.println(stg.indexOf('i'));
		
		// Get following same character index number.
		System.out.println(stg.indexOf('i', stg.indexOf("i")+1));
		
		// If there is no value exist its will return -1.
		System.out.println(stg.indexOf("jony"));
		
		String userName = "Rokibul Hassan";
		
		if(userName.indexOf("Hasan")>=0){
			System.out.println("Correct userName.");
		}
		else{
			System.out.println("Wrong UserName.");
		}
		
		// Its gives you start position.
		System.out.println(userName.indexOf("Hassan"));
		
		System.out.println(stg.toLowerCase());
		System.out.println(stg.toUpperCase());
		
		// Trim remove space from corner
		String t = "    Hello world       ";
		System.out.println(t.trim());
		
		// Replace
		String b = "12-12-1990";
		System.out.println(b.replace('-', '/'));
		
		System.out.println(t.trim().replace(" ", ""));
		
		// Comparison
		String s1 = "test selenium";
		String s2 = "test Selenium";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		// Contains
		System.out.println(s1.contains("test"));
		
		// Character Array
		String name = "Hassan";
		char c[] = name.toCharArray();
		System.out.println(Arrays.toString(c));
		
		for(int i=0; i<c.length; i++){
			System.out.println(c[i]);
		}
		
		// Reverse
		for(int k=c.length-1; k>=0; k--){
			System.out.print(c[k]);
		}
		
		// Split
		String sp = "adv-ghh-ytn-jjh";
		String s[] = sp.split("-");
		
		System.out.println(s.length);
		System.out.println(Arrays.toString(s));
		for(int i=0; i<s.length; i++){
			System.out.println(s[i]);
		}
		
		// String Reverse
		String st = "Whats man";
		String h[] = st.split(" ");
		System.out.println(h[1]+ " " +h[0]);
		
		for(int j=h.length-1; j>=0; j--){
			System.out.println(h[j]);
		}
		
		String empData = "Md;Hassan;34;abc@yahoo.com;123456;TestAddress";
		String ed[] = empData.split(";");
		System.out.println(Arrays.toString(ed));
		for(int p=0; p>ed.length; p++){
			System.out.println(ed[p]);
		}

	}

}
