package day8;

public class DemoGuru99Exception {
	
	public static void main(String[] args) {
		
		Guru99ExceptionHandling gg = new Guru99ExceptionHandling();
		
		try {
			gg.invokeBrowser();
			
			gg.login();
			
			gg.addCustomer();
			
			gg.logout();
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of bound exception occured...");
		} catch (Exception e) {
			System.out.println("Some exception occured...");
		} finally {
			gg.closeBrowser();
		}
		
	}
	
	

}
