package day9;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		Set<String> treeSet = new TreeSet<>(Collections.reverseOrder());
		
		treeSet.add("Saurabh");
		treeSet.add("Anurag");
		treeSet.add("Abha");
		treeSet.add("Swati");
		treeSet.add("Saurabh");
		treeSet.add("Renu");
		treeSet.add("Yogesh");
		
		System.out.println(treeSet);
		
		for(String temp : treeSet){
			System.out.println(temp);
		}

	}

}
