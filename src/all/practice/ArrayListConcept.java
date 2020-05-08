package all.practice;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		// ArrayList---------------------------
		
		// ArrayList is a class.
		// If we need to use ArrayList must create Object of ArrayList class.
		// ArraList is Dynamic in Nature.
		// It can store any kind of data.
		// Dont need to define data type or length.
		// Default virtual size of ArrayList is 10.
		// ArrayList maintain Index/Order.
		// Exception: IndexoutOfBoundException.
		// To print ArrayList we use FOR LOOP bcz its Index based.
		
		
		
		
		ArrayList arList = new ArrayList();
		System.out.println(arList.size());
		arList.add(100);
		arList.add(200);
		arList.add(300);
		System.out.println(arList);
		System.out.println("Size of arList: " + arList.size());
		
		arList.add(400);
		arList.add(500);
		arList.add(600);
		System.out.println(arList);
		System.out.println("Size of arList: " + arList.size());
		
		// Get specific index value.
		System.out.println(arList.get(2));
		
		// Remove 
//		arList.remove(3);
//		System.out.println(arList);
//		System.out.println("Size of arList: " + arList.size());
		
		System.out.println("ArrayList Print with forloop");
		for(int i=0; i<arList.size(); i++){
			System.out.println(arList.get(i));
		}
		
		
		// Integer Arraylist.
		// As per requirement we should create Generic ArrayList.
		// Wrapper Class: String, Integer, Boolean
		ArrayList<String> studentName = new ArrayList<String>();
		studentName.add("Md Rokibul Hassan");
		
		ArrayList<Integer> studentMarks = new ArrayList<Integer>();
		studentMarks.add(100);
		
		ArrayList<Object> employeInfo = new ArrayList<Object>();
		employeInfo.add("Hassan");
		employeInfo.add(34);
		employeInfo.add('M');
		employeInfo.add(12.99);
		employeInfo.add(true);

	}

}
