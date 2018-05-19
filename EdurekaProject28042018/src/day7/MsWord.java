package day7;

public class MsWord implements MsOffice {

	@Override
	public void saveFile() {
		
		System.out.println("I am a save method is Ms Word");
		
	}

	@Override
	public void openFile() {
		System.out.println("I am a open method is Ms Word");
		
	}

	@Override
	public void saveAs() {
		System.out.println("I am a Save as method is Ms Word");
		
	}

}
