package day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(12);
		
		arrayList.add(0,13);
		
		arrayList.add(1,56);
		
		arrayList.add(89);
		
		arrayList.remove(1);
		
		System.out.println(arrayList.get(2));
		
		for(Integer temp: arrayList){
			System.out.println(temp);
		}
	}

}
