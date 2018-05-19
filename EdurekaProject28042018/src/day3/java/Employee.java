package day3.java;

public class Employee {
	
	private int salary;
	private int bonus;
	
	int calculateSalary(){
		int totalSalary = salary + bonus;
		
		return totalSalary;
	}
	
	public void setSalary(int salary){
		
		if(salary <0){
			System.err.println("Invalid Salary");
		} else {
			this.salary = salary;	
		}
		
	}

	public void setBonus(int bonus) {
		
		if(bonus<0){
			System.err.println("Invalid Bonus");
		} else {
			this.bonus = bonus;
		}
		
	}
	
	public int getSalary(){
		return salary;
	}

	public int getBonus() {
		return bonus;
	}
	
	
	
}
