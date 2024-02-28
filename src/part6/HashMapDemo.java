package part6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

//		Declare HashMap
		
		//HashMap hm = new HashMap();
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
	
		//Adding pairs into hashmap
		hm.put(101, "Omar");
		hm.put(102, "Fatima");
		hm.put(103, "Ahmed");
		hm.put(104, "Jihene");
		System.out.println(hm);
//		Remove element from HashMap
		hm.remove(102); //removing by key
		System.out.println("After removing a pairs "+hm);
		
		
//Reading pairs using enhanced for loop
		for(Map.Entry m : hm.entrySet()) {
			
			System.out.println(m.getKey()+ " "+m.getValue());
		}
		
		
		
		
	}

}
