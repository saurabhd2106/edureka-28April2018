package day8;

public class DemoGuru99Exception {

	public static void main(String[] args) {
		Guru99Exceptions gg = new Guru99Exceptions();
		try {
			
			
			gg.invokeBrower();
			
			gg.login();
			
			gg.addCustomer();
			
			gg.logout();
			
			
			
		} catch (Exception e) {
			System.out.println("An Exception ocured..");
		} finally {
			gg.closeBrowser();
		}
	}

}
