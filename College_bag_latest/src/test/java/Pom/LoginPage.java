package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class LoginPage {

	public WebDriver wd;
	
	@FindBy(id="input-userName")
	public WebElement Username;
	
	@FindBy(id="input-password")
	public WebElement Password;
	
	@FindBy(id="button-submit")
	public WebElement SignIn;
	
	
	
	  public LoginPage(WebDriver wd){
	        this.wd = wd;
	        PageFactory.initElements(wd,this);
	    }
	
	public void  User_enters_admin_login_credentials(String Usrname,String Passwrd) {
		
		Username.sendKeys(Usrname);
		Password.sendKeys(Passwrd);

	}
	
	public void clickOnLogin(){
		SignIn.click();
    }
	 public void titleofthepage(String title){

	        if (wd.getPageSource().contains("Invalid Credentials") ){
	           wd.close();
	            Assert.assertTrue(false);
	        }
	        else
	        {
	            Assert.assertEquals(title,wd.getTitle());
	        }
	    }
	
	
}
	


