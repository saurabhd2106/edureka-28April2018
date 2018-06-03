package day12;

import java.util.Random;

public class ArrayExample {
	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		
		Random ran = new Random();
		
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				arr[i][j] = ran.nextInt(10);
			}
		}
		
		int[] count= new int[10];
		
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				count[arr[i][j]]++;
			}
		}
		
		for(int i=0; i<10;i++){
			System.out.println("Count of "+i+" number is "+count[i]);
		}
		
	}
}
