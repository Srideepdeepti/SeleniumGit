package packageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProgramTest1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		   driver = new ChromeDriver();
		   driver.get("https://amazon.in/");
		   driver.manage().window().maximize();
		
	}
	
	@Test
	public void verifyTitle()
	{
      String expectedTitle ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	  String actualTitle = driver.getTitle();
	   System.out.println(" The current title is ::"+actualTitle);
	  
	  Assert.assertEquals(actualTitle, expectedTitle);
	  
	  //one more assertion is addedit jjkkk
	  Assert.assertEquals(false, false);
		
	}
	
	
	@Test
	public void verifyLogoDisplayingStatus()
	{
       
		
		WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        
	    Assert.assertTrue(logo.isDisplayed());
	    // Added New Code
	    //Assert.assertTrue(logo.isEnabled());
		
	}
	@AfterMethod
	public void teardown()
	{   
		driver.close();
	    driver.quit();
		
	}
	

}
