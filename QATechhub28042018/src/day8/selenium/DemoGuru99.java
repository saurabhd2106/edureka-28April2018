package day8.selenium;

public class DemoGuru99 {

	public static void main(String[] args) {
		Guru99Project guru = new Guru99Project();
		
		try {
			guru.invokeBrowser("safari");
			
			guru.login("mngr132098", "mErejYm");
			
			guru.addCustomer();
			
			guru.closeBrowser();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
