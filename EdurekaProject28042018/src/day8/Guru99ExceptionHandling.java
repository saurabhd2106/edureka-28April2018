package day8;

public class Guru99ExceptionHandling {
	
	public void invokeBrowser(){
		System.out.println("Invoking browser");
	}
	
	public void login() throws ArrayIndexOutOfBoundsException, Exception{
		System.out.println("Login to Guru99 App");
		
		
		int[] arr = new int[5];
		
		arr[0] = 12;
		arr[1] = 15;
		arr[2] = 17;
		arr[3] = 18;
		arr[4] = 11;
		
		for(int i=0; i<=5; i++){
			System.out.println(arr[i]);
		}
		
	}
	
	public void addCustomer(){
		System.out.println("Adding customer");
	}
	
	public void logout(){
		System.out.println("Log out");
	}
	
	public void closeBrowser(){
		System.out.println("Closing browser");
	}
}
