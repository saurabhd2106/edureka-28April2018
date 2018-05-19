package day4;

public class Machine {
	
	public int horsePower;
	
	public int numberOfRev;
	
	public Machine() {
		System.out.println("I am in Machine constructor");
		
		horsePower = 900;
		
		numberOfRev = 8800;
	}
	
	void run(){
		System.out.println("I am rum method");
	}
}
