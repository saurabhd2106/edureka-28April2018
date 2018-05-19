package day3;

public class Machine {
	
	int horsePower;
	
	int numberOfRev;
	
	public Machine() {
		System.out.println("I am in Machine constructor");
		
		horsePower = 900;
		
		numberOfRev = 8800;
	}
	
	protected void run(){
		System.out.println("I am rum method");
	}
}
