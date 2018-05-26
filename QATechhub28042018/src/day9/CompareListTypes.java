package day9;

import java.util.ArrayList;
import java.util.List;

public class CompareListTypes {
	
	public static void main(String[] args) {
		
		List<Integer> arraylist = new ArrayList<>();
		
		long start = System.currentTimeMillis();
		long end;
		
		for(int i =0; i< 10E5; i++){
			arraylist.add(i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("Time spent in adding at the end :: " + (end - start) + " milli seconds");
		System.out.println("------------------------------------------------");
		
		start = System.currentTimeMillis();
		
		for(int i =0; i< 10E4; i++){
			arraylist.add(0,i);
		}
		end = System.currentTimeMillis();
		
		System.out.println("Time spent in adding at the start :: " + (end - start) + " milli seconds");
	}

}
