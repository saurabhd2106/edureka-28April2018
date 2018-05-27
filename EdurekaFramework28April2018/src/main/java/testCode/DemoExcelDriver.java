package testCode;

import commonLibs.utils.ExcelDriver;

public class DemoExcelDriver {

	public static void main(String[] args) {
		
		try {
			String fileName = System.getProperty("user.dir")+ "/inputFile/testdatafromexcel.xlsx";
			String sSheetName = "TestData";
			
			
			ExcelDriver excelDriver = new ExcelDriver();
			
			excelDriver.createExcelWorkbook(fileName);
			
			excelDriver.openExcelWorkbook(fileName);
			
			excelDriver.createSheet(sSheetName);
			
			excelDriver.setCellData(sSheetName, 1, 1, "Saurabh");
			excelDriver.setCellData(sSheetName, 1, 2, "Dhingra");
			
			excelDriver.setCellData(sSheetName, 2, 1, "Gaurav");
			excelDriver.setCellData(sSheetName, 2, 2, "Yadav");
			
			excelDriver.save();
			
			excelDriver.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
