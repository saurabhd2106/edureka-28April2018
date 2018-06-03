package day8;

public class DemoGuru99Project {

	public static void main(String[] args) {
		Guru99Project gg = new Guru99Project();
		
		try {
			gg.invokeBrowser("phantom");
			
			gg.login("mngr129839", "dEqejen");
			
			gg.addCustomer();
			
			String customerId = gg.getCustomerId();
			
			System.out.println("Customer Id :: "+ customerId);
			
			gg.addNewAccount(customerId, "Current");
		} catch (Exception e) {
			System.out.println("An Exception occured");
		} finally {
			gg.closeBrowser();
		}
		
		

	}

}
