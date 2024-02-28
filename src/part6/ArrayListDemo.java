package part6;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

//			--How to declare array list

		// ArrayList list = new ArrayList();

		// ArrayList <Integer> list = new ArrayList<Integer>(); //Array List of integer

		ArrayList<String> list = new ArrayList<String>(); // Array list of string

//			--how to add element /values to array list 

		list.add("Omar");// index 0
		list.add("Ahmed");// 1
		list.add("Nesrine");// 2
		list.add("Nour");// 3
		list.add("Bahae");// 4
		// list.add(100);

		// Print all the values
		System.out.println(list);

//			--Find size of array list 

		System.out.println(list.size());
		System.out.println("Before removing element : " + list);

//			--Remove element from Array List 
		list.remove(2);
		System.out.println("After removing element : " + list);

//			--Insert a new element in the middle od the Array List 
		
		list.add(2, "John");
		System.out.println("After inserting of element  "+list);
		
		
//	--Read values from Array List
for(String s : list) {
	
	System.out.println(s);
}
		
	
//Object we can store any type of value 
//for (Object s: list) {
//	
//	System.out.println(s);
//}
//		
//			}
	}
}
