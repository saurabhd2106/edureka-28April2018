package day9;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetExample {

	public static void main(String[] args) {
		
		Set<String> linkedSet = new LinkedHashSet<>();
		
		linkedSet.add("Saurabh");
		linkedSet.add("Anurag");
		linkedSet.add("Abha");
		linkedSet.add("Swati");
		linkedSet.add("Saurabh");
		linkedSet.add("Renu");
		linkedSet.add("Yogesh");
		
		System.out.println(linkedSet);
		
		for(String temp : linkedSet){
			System.out.println(temp);
		}

	}

}
