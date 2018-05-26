package day8;

public class ExceptionalHandling {

	public static void main(String[] args) {
		
		try {
			
			int[] arr = new int[5];

			arr[0] = 78;
			arr[1] = 98;
			arr[2] = 75;
			arr[3] = 23;
			arr[4] = 12;
			
			for(int i=0; i<= arr.length; i++){
				System.out.println(arr[i]);
			}
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("An Exception occured");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("An Array out of bound exception occured");
		} catch (Exception e) {
			System.out.println("An Exception occured");
		} finally {
			System.out.println("I always execute..");
		}
		
		System.out.println("I am after exception");
	}

}
