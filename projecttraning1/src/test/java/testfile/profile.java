package testfile;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basefile.shaddi;
import pages.loginpage;
public class profile {

	public class shaddilogin extends shaddi {
		
		loginpage sp;
		String actualTitle;
		@BeforeSuite
		public void Launch()throws InterruptedException
		{
			initialization();
			sp=new loginpage(); 
		}	
		
		      @Test(priority = 1)
		public void clicklogin()throws InterruptedException
		{
			boolean jklm = sp.login().isEnabled();
			Assert.assertEquals(jklm, true);
		}

		      @Test(priority = 2)
				public void clickEmailid()throws InterruptedException
				{
					sp.login().click();
		    	  sp.Emailid().click();
					sp.Emailid().sendKeys("winnie041418@gmail.com");
					boolean jklm = sp.Emailid().isEnabled();
					Assert.assertEquals(jklm, true);
				}	
		      @Test(priority = 3)
				public void Password()throws InterruptedException
				{
					sp.Password().click();
					sp.Password().sendKeys("ishita@123");
					boolean jklm = sp.Emailid().isEnabled();
					Assert.assertEquals(jklm, true);
				}
		      @Test(priority = 4)
				public void loginnn()throws InterruptedException
				{
		    	  boolean jklm = sp.Loginn().isEnabled();
					Assert.assertEquals(jklm, true);
					sp.Loginn().click();
					
				}
}
	}
