package day3;

public class DemoEmployee {

	public static void main(String[] args) {
		
		
		//Declaring a variable
		Employee saurabh;
		
		//Instantiating and Initialization
		saurabh = new Employee();
		
		saurabh.salary = 80000;
		
		saurabh.bonus = 23322;
		
		saurabh.calculateSalary();
		
		//----------------------------------------------------------------
		
		
		//Declaring a variable
		Employee abha;
		
		//Instantiating and Initialization
		abha = new Employee();
		
		abha.salary = 900000;
		
		abha.bonus = 80000;
		
		int salaryOfAbha;
		
		salaryOfAbha = abha.calculateSalary1();
		
		System.out.println("Salary of Abha :: "+ salaryOfAbha);
		
		salaryOfAbha = abha.calculateSalary3(97000, 89000);
		
		System.out.println("Salary of Abha 2 :: "+ salaryOfAbha);
		
	//----------------------------------------------------------------
		
		
		//Declaring a variable
		Employee renu;
		
		//Instantiating and Initialization
		renu = new Employee();
		
		int salaryOfRenu= renu.calculateSalary2(258963, 85247);
		
		System.out.println("Salary of Renu :: "+ salaryOfRenu);
	}

}
