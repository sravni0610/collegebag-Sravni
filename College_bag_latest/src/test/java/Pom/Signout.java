package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signout {

	public WebDriver wd;
	
	@FindBy(xpath = "//a[@id='nav-signout']")
	public WebElement SignOut;
	
	public Signout(WebDriver wd)
    {
        this.wd = wd;
        PageFactory.initElements(wd,this);
       
    }
	public void clickOnSignout(){
		SignOut.click();
    }
	
	
	
}
