package day3.java;

public class Machine {
	
	int engineSize;
	
	public Machine() {
		
		engineSize = 7000;
		System.out.println("I am a constructor of Machine class");
	}
	

	void start(){
		System.out.println("I am a start method in Machine class");
	}
	
	void stop(){
		System.out.println("I am a stop method in Machine class");
	}
}
