package encapsulationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PagesClasses {
	public WebDriver dr;
	public PagesClasses(WebDriver dr) {
		this.dr=dr;
	}

	private By userName=By.id("name");
	private By email=By.id("email");
	private By phone=By.id("phone");
	
	public void setUserName(By userName) {
		this.userName=userName;
	}
	public void setEmail(By email) {
		this.email=email;
	}
	public void setPhone(By phone) {
		this.phone=phone;
	}
	
	public WebElement getUserName() {
		return dr.findElement(userName);
	}
	public WebElement getEmail() {
		return dr.findElement(email);
	}
	public WebElement getPhone() {
		return dr.findElement(phone);
	}

	
}
