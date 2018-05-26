package day9;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put(1, "one");
		System.out.println(linkedHashMap.get(1));
		linkedHashMap.put(2, "two");
		linkedHashMap.put(12, "twelve");
		linkedHashMap.put(10, "ten");
		linkedHashMap.put(1, "ONE");
		System.out.println(linkedHashMap.get(1));
		
		
		for(Map.Entry<Integer, String> temp : linkedHashMap.entrySet()){
			System.out.println(temp.getKey() + " :: "+ temp.getValue());
		}
	}

}
