package day7;

public class ExceptionalHandling {
	
	public static void main(String[] args) {
		
		try {
			
			int[] arr = new int[5];
			
			arr[0] = 12;
			arr[1] = 15;
			arr[2] = 17;
			arr[3] = 18;
			arr[4] = 11;
			
			for(int i=0; i<=5; i++){
				System.out.println(arr[i]);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("An Array Exception occured...");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("An Exception occured in string...");
		} catch (Exception e) {
			System.out.println("Some other error..");
		}
		
	}

}
