package day7;

public class MaxValueInAnArray {

	public static void main(String[] args) {
		
		//Static way of creating an array
		int[] sArr = {12, 13, -45, 78, -98, 45, -34};
		
		int max = sArr[0], min = sArr[0];
		
		for(int temp : sArr){
			
			if(temp>max){
				max = temp;
			}
			
			if(temp<min){
				min = temp;
			}
			
		}
		
		System.out.println("Max value :: "+ max);
		
		System.out.println("Min value :: "+ min);

	}

}
