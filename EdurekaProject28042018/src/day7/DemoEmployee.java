package day7;

public class DemoEmployee {

	public static void main(String[] args) {
		
		Employee saurabh = new Employee();
		
		saurabh.setSalary(-3458934);
		
		saurabh.setBonus(34543);

		saurabh.calculateSalary();
		
		int salary = saurabh.getSalary();
	}

}
