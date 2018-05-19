package day3;

public class Employee {
	
	protected int salary;
	int bonus;
	
	void calculateSalary(){
		int totalSalary;
		
		totalSalary = salary + bonus;
		
		System.out.println("Total Salary "+ totalSalary);
	}
	
	//---------------------------------------------------
	
	int calculateSalary1(){
		int totalSalary;
		
		totalSalary = salary + bonus;
		
		return totalSalary;
	}
	
	//---------------------------------------------------
	
		int calculateSalary2(int sal, int bon){
			int totalSalary;
			
			totalSalary = sal + bon;
			
			return totalSalary;
		}
		//---------------------------------------------------
		
			int calculateSalary3(int salary, int bonus){
				int totalSalary;
				
				
				//this keyword is used to give preference to instance level variable
				totalSalary = this.salary + this.bonus;
				
				return totalSalary;
			}
		
	
}
