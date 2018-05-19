package day7;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][4];
		
		arr[0][0] = 23;
		arr[0][1] = 12;
		arr[0][2] = 25;
		arr[0][3] = 28;
		
		
		arr[1][0] = 27;
		arr[1][1] = 17;
		arr[1][2] = 28;
		arr[1][3] = 22;
		
		
		arr[2][0] = 24;
		arr[2][1] = 14;
		arr[2][2] = 27;
		arr[2][3] = 29;
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j< arr[i].length; j++){
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		

	}

}
