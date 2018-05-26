package day9;

import java.util.HashSet;
import java.util.Set;

public class HashSetsExample {

	public static void main(String[] args) {
		
		Set<String> hashset = new HashSet<>();
		
		hashset.add("Saurabh");
		hashset.add("Anurag");
		hashset.add("Abha");
		hashset.add("Swati");
		hashset.add("Saurabh");
		hashset.add("Renu");
		hashset.add("Yogesh");
		
		System.out.println(hashset);
		
		for(String temp : hashset){
			System.out.println(temp);
		}

	}

}
