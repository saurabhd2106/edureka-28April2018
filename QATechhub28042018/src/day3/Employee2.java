package day3;

public class Employee2 {
	
	int salary;
	int bonus;
	
	public Employee2() {
		
		System.out.println("I am a constructor..");
		salary = 50000;
		bonus = 30000;
	}
	
	public Employee2(int salary, int bonus) {
		System.out.println("I am a parameterised constructor..");
		this.salary = salary;
		
		this.bonus = bonus;
	}
	
	
	void calculateSalary(){
		int totalSalary;
		
		totalSalary = salary + bonus;
		
		System.out.println("Total Salary "+ totalSalary);
	}

	
	public static void main(String[] args) {
		
		Employee2 anurag;
		anurag = new Employee2();
		
		Employee2 swati;
		swati = new Employee2(40000, 30000);
		
		Employee2 yogesh;
		yogesh = new Employee2(80000, 50000);
		
		anurag.salary = 240000;
		anurag.bonus = 70000;
		
		
		anurag.calculateSalary();
		
		//---------------------------------------------
		
		
	}
	
}
