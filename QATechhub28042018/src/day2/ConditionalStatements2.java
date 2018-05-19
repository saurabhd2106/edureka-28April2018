package day2;

public class ConditionalStatements2 {

	public static void main(String[] args) {
		
		// Greatest number out of two
		
		int firstNumber, secondNumber;
		firstNumber = 60;
		secondNumber = 40;
		
		if(firstNumber > secondNumber){
			System.out.println("First number is greatest");
		}
		
		if(secondNumber > firstNumber){
			System.out.println("Second number is greatest");	
		}
		
		if(secondNumber == firstNumber){
			System.out.println("Both are equal");	
		}

	}

}
