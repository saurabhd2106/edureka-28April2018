package day3.java;

public class Car extends Machine{
	
	int hoursePower;
	
	int engineSize;
	
	public Car() {
		super.engineSize = 43734;
		hoursePower = 2342;
		System.out.println("I am a constructor from Car class");
	}
	
	void restart(){
		
		engineSize = 3454839;
		
		start();
		
		stop();
		System.out.println("Restart method from car class");
	}
	
	@Override
	void start(){
		System.out.println("Start method from Car class");
	}

}
