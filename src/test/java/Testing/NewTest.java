package Testing;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeMethod
	  public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		
	  }
	
  @Test
  public void f() {
	  
	  
	  
	  
  }
  

  @AfterMethod
  public void afterMethod() {
  }

}
