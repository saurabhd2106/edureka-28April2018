package day2.java;

public class Employee {
	
	int salary;
	int bonus;
	
	public Employee() {
		
		System.out.println("I am a constructor");
		salary = 70000;
		bonus = 30000;
	}
	
	public Employee(int salary, int bonus) {
		this.salary = salary;
		
		this.bonus = bonus;
		
	}
	
	void calculateSalary(){
		int totalSalary = salary + bonus;
		
		System.out.println("Total salary :: "+ totalSalary);
	}
	
	int calculateSalary2(){
		int totalSalary = salary + bonus;
		
		return totalSalary;
	}
	
	int calculateSalary3(int sal, int bon){
		int totalSalary = sal + bon;
		
		return totalSalary;
	}
	
	int calculateSalary4(int salary, int bonus){
		int totalSalary = this.salary + this.bonus;
		
		return totalSalary;
	}

}
