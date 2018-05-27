package testCode;

import commonLibs.utils.ExcelDriver;

public class DemoExcelDriver2 {

	public static void main(String[] args) {
		
		try {
			String fileName = System.getProperty("user.dir")+ "/inputFile/TestData.xlsx";
			String sSheetName = "TestData";
			
			
			ExcelDriver excelDriver = new ExcelDriver();
			
			excelDriver.openExcelWorkbook(fileName);
			
			String data = excelDriver.getCellData(sSheetName, 1, 1);
			
			System.out.println(data);
			
			excelDriver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
