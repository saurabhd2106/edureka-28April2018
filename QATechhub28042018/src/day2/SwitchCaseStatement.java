package day2;

import java.util.Scanner;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		int day;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a day");
		
		day  = sc.nextInt();
		
		switch (day + 4) {
		case 1:
			System.out.println("Its a Monday");
			break;
		case 2:
			System.out.println("Its a Tuesday");
			break;
		case 3:
			System.out.println("Its a Wednesday");
			break;
		case 4:
			System.out.println("Its a Thusday");
			break;
		case 5:
			System.out.println("Its a Friday");
			break;
		case 6:
			System.out.println("Its a Saturday");
			break;
		case 7:
			System.out.println("Its a Sunday");
			break;
			
		default:
			System.out.println("Incorrect Day");
			break;
		}
		
		sc.close();

	}

}
