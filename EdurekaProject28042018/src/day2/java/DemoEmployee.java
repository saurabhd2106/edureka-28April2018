package day2.java;

public class DemoEmployee {

	public static void main(String[] args) {
		
		Employee saurabh; //Declaring an object
		
		// new -- instantiating an object (assigning memory to an object)
		//Employee() -- constructor-- initialization
		saurabh = new Employee();
		
		saurabh.salary = 799934;
		saurabh.bonus = 4387;
		
		saurabh.calculateSalary();
		
		//----------------------------------------------------------
		
		Employee gaurav = new Employee();
		
		gaurav.salary = 835493;
		
		gaurav.bonus = 43567;
		
		int totalSalaryOfGaurav = gaurav.calculateSalary2();
		
		System.out.println("Salary of Gaurav :: "+ totalSalaryOfGaurav);
		
		
	}

}
