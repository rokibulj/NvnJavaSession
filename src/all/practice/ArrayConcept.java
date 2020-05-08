package all.practice;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// STATIC ARRAY:---------------
		// In a Array we can store similar type of multiple value.
		// In Array we need to pass length when create an Array.
		// int i[] = new i[5];
		// Lowest Index LI=0, Length L=5,Highest Index HI=L-1;
		// i[0]=10, i[1]=20, i[2]=30, i[3]=40, i[4]=50;
		// Exceptions- ArrayIndexOutOfBoundsException;

		// To print all value of Array use: FOR LOOP
		// NEW keyword used to create object. And non-primitive Object allocation.
		// Static Arrays problem/limitation is -Size fixed, not support dynamic data.
		// To Overcome this limitations We use Dynamic Array(ArrayList).
		// Limitation- Homogeneous(similar) types of data.
		// To Overcome this limitations We use Dynamic Array(ArrayList)/Object Static Array.
		// Arrays and Collection are not same.
		
		
		//Where data is fixed or predefined we use static Array.
		
		//------------------------------------------------------------
		//OBJECT STATIC ARRAY:
		// Using object array we can store different types value.
		
		

		int numArray[] = new int[5];
		numArray[0] = 10;
		numArray[1] = 20;
		numArray[2] = 30;
		numArray[3] = 40;
		numArray[4] = 50;

		System.out.println(numArray[1]);
		System.out.println(numArray[0] + numArray[3]);
		System.out.println(numArray.length);

		for (int k = 0; k < numArray.length; k++) {
			System.out.println(numArray[k]);
		}

		String student[] = new String[3];
		student[0] = "MD";
		student[1] = "Rokibul";
		student[2] = "Hassan";

		System.out.println(Arrays.toString(student));

		for (int j = 0; j < student.length; j++) {
			System.out.println(student[j]);
			if (student[j].equals("Rokibul")) {
				System.out.println("Rokibul is there");
			}
			// System.out.println(student[j]);
		}
		
		
		String browser[] = new String[4];
		browser[0]= "Chrome";
		browser[1]= "FireFox";
		browser[2]= "Safari";
		browser[3]= "IE";
		
		for(int b=0; b<browser.length; b++){
			System.out.println(browser[b]);
			if (browser[b].equals("Chrome")) {
				System.out.println("Chrome browser will launch");
			}
			else if (browser[b].equals("FireFox")) {
				System.out.println("FireFox browser will launch");
			}
			else if (browser[b].equals("Safari")) {
				System.out.println("Safari browser will launch");
			}
			else if (browser[b].equals("IE")) {
				System.out.println("IE browser will launch");
			}
			else {
				System.out.println("Browser not found.");
			}
			
			//System.out.println(browser[b]);
		}
		
		Object emp[] = new Object[5];
		emp[0]= "Rokibul";
		emp[1]= 20;
		emp[2]= 100.12;
		emp[3]= 'F';
		emp[4]= true;
		
		for(int i=0; i<emp.length; i++){
			System.out.println(emp[i]);
		}

	}

}
