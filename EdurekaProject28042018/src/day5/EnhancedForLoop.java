package day5;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 13;
		arr[2] = 14;
		arr[3] = 16;
		arr[4] = 18;
		
		for(int temp:arr){
			System.out.println(temp);
		}
	}

}
