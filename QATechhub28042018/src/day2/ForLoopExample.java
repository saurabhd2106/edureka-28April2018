package day2;

import java.util.Scanner;

public class ForLoopExample {

	public static void main(String[] args) {
		
		int i;
		for(i=0;i<40; i+=4){
			
			System.out.println(i);
		}
		System.out.println(i);
		
		while(i<40){
			System.out.println(i);
			i+=5;
		}
		
		//-------------------------------------
		//Find sum of digit
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :: ");
		number = sc.nextInt();
		
		int sum = 0;
		
		// 2153 = 2+1+5+3 =11
		while(number!=0){
			
			sum  += (number % 10);
			number /= 10;
		}
		System.out.println("Sum of digits :: "+sum);
		
		sc.close();
	}

}
