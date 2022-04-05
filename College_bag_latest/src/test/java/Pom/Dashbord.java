package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashbord {

	
	public WebDriver wd;
	
	@FindBy(className ="boxHeader1")
	public WebElement Student;
	
	@FindBy(xpath = "//div[contains(text(),'Courses')]")
	public WebElement Courses;
		
	 public Dashbord(WebDriver wd){
	        this.wd=wd;
	        PageFactory.initElements(wd,this);
	    }
	 
	 public void click_students() {
		 Student.click();
	 }
	
	
	

}
