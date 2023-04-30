package loginTrail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import dev.failsafe.internal.util.Assert;

public class Loginr {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		//System.getProperty("webdriver.edge.driver", "C://Users//Tenzing Lhadon//eclipse//driver//msedgedriver.exe");
	    driver.findElement(By.name("user-name")).sendKeys("standard_user");
	    driver.findElement(By.name("password")).sendKeys("secret_sauce");
	    driver.findElement(By.id("login-button")).click();
	    String s=driver.findElement(By.className("app_logo")).getText();
	    

	}

}
