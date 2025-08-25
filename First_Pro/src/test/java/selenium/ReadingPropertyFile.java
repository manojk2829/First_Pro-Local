package selenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadingPropertyFile {
	public Properties pr;	
	public String readPropertiesFile_Value_by_Key(String input_key) {
		String project_location=System.getProperty("user.dir");
		String propertiesFile_Location=project_location+"\\src\\test\\java\\config\\or.properties";
		//System.out.println(propertiesFile_Location);
		pr=new Properties();		
		try {
			FileInputStream fis=new FileInputStream(propertiesFile_Location);
			pr.load(fis);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		String value=pr.getProperty(input_key);
		System.out.println(pr.get("url1"));
		return value;
    }
}
