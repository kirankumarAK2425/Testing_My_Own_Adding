package Testing;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeMethod
	  public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver.get("");
		driver.findElement(By.xpath(null));	  }
	
  @Test
  public void f() {
	  
	  driver.get("");
	  
	  driver.findElement(By.xpath(null));
	  driver.findElement(By.xpath(null));
	  driver.findElement(By.xpath(null));
	  
	  driver.findElement(By.xpath(null));
  }
  

  @AfterMethod
  public void afterMethod() {
  }

}
