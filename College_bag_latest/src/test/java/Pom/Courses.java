package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




import java.util.List;
import java.util.concurrent.TimeUnit;
//import src.test.java.PageObjects.List;


public class Courses {
	
	public WebDriver wd;
	
	@FindBy(id="nav-courses")
	public WebElement Courses;
	
	@FindBy(id="input-filter")
	public WebElement Filter;
	
	
	@FindBy(xpath="//th[contains(text(),'Course Name')]")
	public WebElement CourseName;
	
	@FindBy(xpath="//th[contains(text(),'Acronym')]")
	public WebElement Acronmy;
	
	@FindBy(xpath="//th[contains(text(),'actions')]")
	public WebElement Actions;
	
	@FindBy(id="button-add")
	public WebElement Add;
	
	@FindBy(xpath ="//td[contains(text(),'Master of Computer Applications')]")
	public WebElement 	Master_of_Computer_Applications;
	
	
	@FindBy(xpath ="//td[contains(text(),'Master of Science (Computer Science)')]")
	public WebElement Master_of_Science_Computer_Science;
	
	@FindBy(xpath ="//td[contains(text(),'Master of Business Administration')]")
	public WebElement Master_of_Business_Administration;
	
	@FindBy(xpath="//div[contains(text(),'Edit Course')]")
	public WebElement Edit;
	
	@FindBy(xpath="//button[@id='button-save']")
	public WebElement Save;
	
	@FindBy(xpath="//button[@id='button-cancel']")
	public WebElement Cancel;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/a[2]/span[1]")
	public WebElement Delete;

	 public Courses(WebDriver wd)
	    {
	        this.wd = wd;
	        PageFactory.initElements(wd,this);
	        wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	       
	    }
	 public void new_course_name(String Cname, String Acrname) {
		 Add.click();
	        CourseName.sendKeys(Cname);
	        Acronmy.sendKeys(Acrname);
	        Save.click();
	    }
	 
	 
	 public void getListofCourses(){

		 List<WebElement> myElements = wd.findElements(By.xpath(".//td[@id='course-courseName']"));
	        for(WebElement e:myElements){
	           System.out.println(e.getText());
	        }
	 }
	 
	 
	
	}