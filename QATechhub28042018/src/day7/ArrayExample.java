package day7;

public class ArrayExample {

	public static void main(String[] args) {
		
		//Static way of creating an array
		int[] sArr = {12, 13, 45, 78, 98};
		
		//Dynamic way of creating an array
		int[] arr = new int[10];
		
		arr[0] = 89;
		arr[1] = 98;
		
		for(int i=0; i<arr.length; i++){
			arr[i] = i * 5 + 10;
		}
		
		System.out.println(sArr[4]);
		System.out.println("----------------------------------");
		for(int i=0; i<sArr.length; i++){
			System.out.println(sArr[i]);
		}

	}

}
