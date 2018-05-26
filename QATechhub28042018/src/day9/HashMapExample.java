package day9;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashmap = new HashMap<>();
		
		hashmap.put(1, "one");
		System.out.println(hashmap.get(1));
		hashmap.put(2, "two");
		hashmap.put(12, "twelve");
		hashmap.put(10, "ten");
		hashmap.put(1, "ONE");
		System.out.println(hashmap.get(1));
		
		
		for(Map.Entry<Integer, String> temp : hashmap.entrySet()){
			System.out.println(temp.getKey() + " :: "+ temp.getValue());
		}
	}

}
