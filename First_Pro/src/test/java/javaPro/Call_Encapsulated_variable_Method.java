package javaPro;

import java.io.FileInputStream;
import java.util.Properties;

public class Call_Encapsulated_variable_Method {
	public static Properties pro;

	public static void main(String[] args) {
		Encapsulation_Class ec=new Encapsulation_Class();
		EncapsulationClassConcept ecConcept=new EncapsulationClassConcept();
		ecConcept.setUserName("Manoj");
		ecConcept.setUserPassword("12345");
		System.out.println(ecConcept.getUserName());
		System.out.println(ecConcept.getUserPassword());
		
		ec.setXpath("manoj");
		ec.setCount(35);
		System.out.println("Name - " + ec.getXpath());
		System.out.println("Age - " + ec.getCount());
		
		
		BankClass bc=new BankClass("1234567890", 345.234);
		System.out.println("Account -- > " + bc.getAccountNumber());
		System.out.println("Balance -- > " + bc.getBal());
		get_key_value_from_propertiesFile("url");
		get_key_value_from_propertiesFile("url1");
	
	}
	
	public static void get_key_value_from_propertiesFile(String keyToAccess) {
		String filePath = System.getProperty("user.dir")+"\\src\\test\\java\\config\\or.properties";
		pro=new Properties();
		try{			
			FileInputStream fis=new FileInputStream(filePath);
			pro.load(fis);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("This is Key >> '"+keyToAccess + "' and this is Value >> '"+ pro.getProperty(keyToAccess)+"'");
	}

}
