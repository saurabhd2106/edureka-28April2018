package day8;

public class Guru99Exceptions {
	
	public void invokeBrower(){
		System.out.println("Opening Browser...");
	}
	
	public void login() throws Exception{
		System.out.println("Login to Guru99..");
		
		int[] arr = new int[5];

		arr[0] = 78;
		arr[1] = 98;
		arr[2] = 75;
		arr[3] = 23;
		arr[4] = 12;
		
		for(int i=0; i<= arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	public void addCustomer(){
		System.out.println("Add cutstomer..");
	}
	
	public void logout(){
		System.out.println("Log out...");
	}
	
	public void closeBrowser(){
		System.out.println("Closing browser..");
	}

}
