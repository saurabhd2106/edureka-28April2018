package day3;


//extends --- to inherit
public class Car extends Machine {
	
	String colour;
	
	int numOfCylinderInEngine;
	int numberOfRev;
	
	public Car() {
		System.out.println("I am in car constructor");
		
		colour = "Red";
		numOfCylinderInEngine = 9;
		
		horsePower = 1900;
	}
	
	void blowHorn(){
		System.out.println("Blow horn");
		
		super.numberOfRev =90;
		run();
	}
	
	@Override
	protected void run(){
		System.out.println("I am rum method from Car class");
	}

}
