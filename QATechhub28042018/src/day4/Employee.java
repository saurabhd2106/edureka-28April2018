package day4;

public class Employee {
	
	private int salary;
	private int bonus;
	
	int calculateSalary(){
		int totalSalary;
		
		totalSalary = salary + bonus;
		
		return totalSalary;
	}
	
	public void setSalary(int salary){
		
		if(salary>0){
			this.salary = salary +60000;
		} else {
			System.err.println("Invalid Salary");
		}
		
	}

	public void setBonus(int bonus) {
		if(bonus>0){
			this.bonus = bonus;
		} else {
			System.err.println("Invalid bonus");
		}
	}
	
	public int getSalary(){
		return salary;
	}

	public int getBonus() {
		return bonus;
	}
	
	
}
