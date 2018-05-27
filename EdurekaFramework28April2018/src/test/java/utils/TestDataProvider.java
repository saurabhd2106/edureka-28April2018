package utils;

import java.util.Properties;

import org.testng.annotations.DataProvider;

import commonLibs.utils.ExcelDriver;
import commonLibs.utils.ReadConfigFileUtils;

public class TestDataProvider {
	private ExcelDriver excelDriver;
	private String inputFilename;
	private String sheetName;
	private Properties configProperty;
	private String configFileName;
	
	public TestDataProvider() throws Exception{
		String currentProjectDirectory = System.getProperty("user.dir");
		configFileName = currentProjectDirectory +"/config/config.properties";
		configProperty = ReadConfigFileUtils.readProperties(configFileName);
		
		
		inputFilename = currentProjectDirectory + "/inputFile/" +configProperty.getProperty("inputFileName");
		sheetName = configProperty.getProperty("inputSheetName");
	}
	
	@DataProvider
	public Object[][] getData() throws Exception{
		
		Object[][] data;
		
		excelDriver = new ExcelDriver();
		
		excelDriver.openExcelWorkbook(inputFilename);
		
		int numberOfRows = excelDriver.getRowCountoFSheet(sheetName);
		
		int numberOfCellInARow = excelDriver.getCellCount(sheetName, 1);
		
		
		data = new Object[numberOfRows+1][numberOfCellInARow];
		
		for(int iRow=1; iRow <= numberOfRows+1; iRow++){
			
			for(int iCell=1; iCell <= numberOfCellInARow; iCell++){
				
				data[iRow-1][iCell-1] = excelDriver.getCellData(sheetName, iRow, iCell);
				
			}
		}
		
		return data;
		
	}

}
