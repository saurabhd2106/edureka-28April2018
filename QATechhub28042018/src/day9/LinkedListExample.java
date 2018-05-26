package day9;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

	LinkedList<Integer> linkedList = new LinkedList<>();
	
	linkedList.add(12);
	
	linkedList.add(0,13);
	
	linkedList.add(1,56);
	
	linkedList.add(89);
	
	linkedList.remove(1);
	
	System.out.println(linkedList.get(2));
	
	for(Integer temp: linkedList){
		System.out.println(temp);
	}

	}

}
