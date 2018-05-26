package day9;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {

	public static void main(String[] args) {
		
		Map<Integer, String> treemap = new TreeMap<>(Collections.reverseOrder());
		
		treemap.put(1, "one");
		System.out.println(treemap.get(1));
		treemap.put(2, "two");
		treemap.put(12, "twelve");
		treemap.put(10, "ten");
		treemap.put(1, "ONE");
		System.out.println(treemap.get(1));
		
		
		for(Map.Entry<Integer, String> temp : treemap.entrySet()){
			System.out.println(temp.getKey() + " :: "+ temp.getValue());
		}
	}

}
