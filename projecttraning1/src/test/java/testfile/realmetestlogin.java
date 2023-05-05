package testfile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basefile.realme;
import pages.realmehome;


public class realmetestlogin extends realme {
		
		realmehome sp;
		String actualTitle;
		@BeforeSuite
		public void Launch()throws InterruptedException
		{
			initialization();
			sp=new realmehome(); 
}
		 @Test(priority = 1)
			public void clicklogin()throws InterruptedException
			{
			 sp.Login().click();
				//boolean jklm = sp.Login().isEnabled();
				//Assert.assertEquals(jklm, true);
		}
		 @Test(priority = 2)
			public void Email()throws InterruptedException
			{
			 sp.Email().click();
				boolean jklm = sp.Email().isEnabled();
				Assert.assertEquals(jklm, true);
		}
		 @Test(priority = 3)
			public void Createaccount()throws InterruptedException
			{
			 Thread.sleep(1000);
			 sp.Createaccount().click();
				boolean jklm = sp.Createaccount().isEnabled();
				Assert.assertEquals(jklm, true);
		}
		 @Test(priority = 4)
			public void Emailaddress()throws InterruptedException
			{
			 sp.Emailaddres().click();
			 Thread.sleep(4000);
			 sp.Emailaddres().sendKeys("isaraf677@gmail.com");
				boolean jklm = sp.Emailaddres().isEnabled();
				Assert.assertEquals(jklm, true);

		}
		 @Test(priority = 4)
			public void Getcode()throws InterruptedException
			{
			 sp.Getcode().click();
			 Thread.sleep(4000);
			 
				boolean jklm = sp.Getcode().isEnabled();
				Assert.assertEquals(jklm, true);

}
		 @Test(priority = 5)
			public void Passwordrequired()throws InterruptedException
			{
			 sp.Passwordrequired().click();
			 sp.Passwordrequired().sendKeys("Ishita@123");
			 Thread.sleep(4000);
			 
				boolean jklm = sp.Passwordrequired().isEnabled();
				Assert.assertEquals(jklm, true);

}
}


