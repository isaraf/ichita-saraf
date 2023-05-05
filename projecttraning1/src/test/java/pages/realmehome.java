package pages;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import basefile.realme;


	public class  realmehome extends realme {
	      public realmehome ()
	      {
	    	  PageFactory.initElements(driver, this);
	      }
	      
	      // login in realme
	      @FindBy(xpath="//*[@id=\"plus-accountLogin\"]")
	      WebElement Login ;
	      @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div/div/div/div/div/div[6]/div[2]/div/div[1]/img")
          WebElement Email ;
	      @FindBy(xpath="/html/body/div/div/div/div/div[2]/div/div/div/div/div/div[2]/form/div[5]/button[2]")
	      WebElement Createaccount ;
	      @FindBy(xpath="//input[@placeholder='Email']")
	      WebElement Emailaddress ;
	      @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div/div/div/div/div/div[3]/form/div[2]/span/a")
	      WebElement Getcode ;
	      @FindBy(xpath="")
	      WebElement Passwordrequired;
//	      @FindBy(xpath="")
//	      WebElement ;
	
	
	// return for login
	public WebElement Login() {
  	  return Login;
    }
	public WebElement Email() {
	  	  return Email;
	    }
	public WebElement Createaccount() {
	  	  return Createaccount;
	    }
	public WebElement Emailaddres() {
	  	  return Emailaddress;
	    }
	public WebElement Getcode() {
	  	  return Getcode;
	    }
	public WebElement Passwordrequired() {
	  	  return Passwordrequired;
	    }
	}

