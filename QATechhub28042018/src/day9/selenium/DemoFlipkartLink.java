package day9.selenium;

public class DemoFlipkartLink {

	public static void main(String[] args) {
		FlipkartLinkProject fl = new FlipkartLinkProject();
		
		fl.invokeBrowser();
		
		fl.getLinkCount();
		
		fl.getLinkUrl();
		
		fl.getAllUrlAndLinks();
		
		fl.closeBrowser();

	}

}
