package day8;

public class MsExcel implements MsOffice{

	@Override
	public void save() {

		System.out.println("I am save method from Ms Excel");
		
	}

	@Override
	public void saveAs() {
		System.out.println("I am save as method from Ms Excel");
		
	}

	@Override
	public void open() {
		System.out.println("I am open method from Ms Excel");
		
	}
	
	public void restart(){
		System.out.println("I am restart method from Ms Excel");
	}
}
