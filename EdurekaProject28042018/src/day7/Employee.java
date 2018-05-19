package day7;

public class Employee {
	
	private int salary;
	
	private int bonus;
	
	public void calculateSalary(){
		int totalSalary = salary + bonus;
		
		System.out.println(totalSalary);
	}
	
	public void setSalary(int salary){
		
		if(salary > 0){
			this.salary = salary;
		} else {
			System.err.println("Invalid Salary");
		}
		
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public int getSalary(){
		return salary;
	}

	public int getBonus() {
		return bonus;
	}
	
	
}
