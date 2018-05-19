package day7;

public class MsExcel implements MsOffice, MsWorld {

	@Override
	public void saveFile() {
		
		System.out.println("I am a save method is Ms Excel");
		
	}

	@Override
	public void openFile() {
		System.out.println("I am a open method is Ms Excel");
		
	}

	@Override
	public void saveAs() {
		System.out.println("I am a Save as method is Ms Excel");
		
	}

	@Override
	public void restart() {
	System.out.println("I am a restart method in Ms Excel");
	}

	public void reShuffle(){
		System.out.println("I am a reshuffle method..");
	}
}
