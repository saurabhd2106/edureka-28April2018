package day3.java;

public class DemoEmployee {
	
	public static void main(String[] args) {
		Employee saurabh = new Employee();
		
		saurabh.setSalary(90000);
		
		System.out.println("Salary variable "+ saurabh.getSalary());
		
		saurabh.setBonus(80000);
		
		int salary;
		
		salary  = saurabh.calculateSalary();
		
		System.out.println("Salary :: "+ salary);
	}

}
