package javaPro;

import java.io.FileInputStream;
import java.util.Properties;

public class readPropertiesFile {

	public static void main(String[] args) {
		String property_filePath=System.getProperty("user.dir");
		System.out.println(property_filePath);
		Properties ps=new Properties();
		try {
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config\\or.properties");
			ps.load(fis);
			ps.getProperty("url");		
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		

	}

}
