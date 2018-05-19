package day2;

import java.util.Scanner;

public class LeapYearExample {

	public static void main(String[] args) {
		
		// if a year is a non centuary year then if divisible by 4 --> Leap year
		// if a year is a centuary year then it should be divisible by 400
		
		int year;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year :: ");
		year = sc.nextInt();
		
		
		boolean divisibleBy400Cond = (year % 400 == 0);
		boolean divisibleBy4Cond = (year % 100 !=0 && year%4==0);
		
		if(divisibleBy400Cond || divisibleBy4Cond ){
			
				System.out.println("It is a leap year");
		} 
			else {
				System.out.println("Not a leap year");
			}
			
		
		
		sc.close();

	}

}
