package testCode;

import java.util.Properties;

import commonLibs.utils.ReadConfigFileUtils;

public class DemoConfigFileReader {

	public static void main(String[] args) {
		try {
			Properties property;

			String fileName = System.getProperty("user.dir") + "/config/config.properties";
			property = ReadConfigFileUtils.readProperties(fileName);

			String browserType = property.getProperty("browserType");
			System.out.println(browserType);
			
			System.out.println(property.getProperty("reportFileName"));

		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
