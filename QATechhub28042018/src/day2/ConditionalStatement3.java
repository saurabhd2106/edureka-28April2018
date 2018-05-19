package day2;

import java.util.Scanner;

public class ConditionalStatement3 {
	
	public static void main(String[] args) {
		
		int firstNum, secondNum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numbers :: ");
		
		firstNum = sc.nextInt();
		
		secondNum = sc.nextInt();
		
		if(firstNum != secondNum){
			
			System.out.println("Not equal");
		} else{
			System.out.println("Equal");
		}
		
		sc.close();
	}

}
