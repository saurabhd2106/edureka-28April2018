package day9;

public class ArrayCountExample {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		
		arr[0][0] = 1;
		arr[0][1] = 9;
		arr[0][2] = 5;
		arr[0][3] = 6;
		arr[0][4] = 4;
		
		arr[1][0] = 1;
		arr[1][1] = 7;
		arr[1][2] = 5;
		arr[1][3] = 9;
		arr[1][4] = 3;
		
		arr[2][0] = 7;
		arr[2][1] = 3;
		arr[2][2] = 5;
		arr[2][3] = 8;
		arr[2][4] = 4;
		
		arr[3][0] = 1;
		arr[3][1] = 7;
		arr[3][2] = 6;
		arr[3][3] = 6;
		arr[3][4] = 4;
		
		arr[4][0] = 0;
		arr[4][1] = 0;
		arr[4][2] = 7;
		arr[4][3] = 6;
		arr[4][4] = 4;
		
		int[] count = new int[10];
		
		for(int i=0; i< arr.length; i++){
			
			for(int j=0; j< arr[0].length; j++){
				
				count[arr[i][j]]++;
			}
			
		}
		for(int i = 0; i< count.length; i++){
			System.out.println("count of "+ i + " digit is :: "+ count[i]);
		}
		
	}

}
