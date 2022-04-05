package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;




public class Students {
	
	public WebDriver wd;
	
	@FindBy(id = "nav-students")
	public WebElement Students;
	
	@FindBy(id="input-filter")
	public WebElement Filter;
	
	@FindBy(id = "select-courses")
	public WebElement SelCourse;
	
	@FindBy(id="button-search")
	public WebElement SearchButton;
	
	@FindBy(id = "button-add")
	public WebElement Add;
	
	@FindBy(xpath="//th[contains(text(),'First Name')]")
	public WebElement Firstname;
	
	@FindBy(xpath="//th[contains(text(),'Last Name')]")
	public WebElement Lastname;
	
	
	@FindBy(xpath="//th[contains(text(),'Gender')]")
	public WebElement Gender;
	
	@FindBy(xpath="//th[contains(text(),'actions')]")
	public WebElement Actions;
	
	@FindBy(xpath="//div[contains(text(),'Edit Student')]")
	public WebElement Edit;
	
	@FindBy(xpath="//body/app-root[1]/app-route[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-student-edit[1]/main[1]/div[2]/div[1]/section[1]/div[2]/div[4]/div[1]/input[1]")
	public WebElement Male;
	
	@FindBy(xpath="//body/app-root[1]/app-route[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-student-edit[1]/main[1]/div[2]/div[1]/section[1]/div[2]/div[4]/div[2]/input[1]")
	public WebElement Female;
	
	
	@FindBy(xpath="//button[@id='button-save']")
	public WebElement Save;
	
	@FindBy(xpath="//button[@id='button-cancel']")
	public WebElement Cancel;
	
	  public Students(WebDriver wd){
	        this.wd=wd;
	        
	    }
	  
	  public void setName(String firstNm,String lastNm){
	        Firstname.sendKeys(firstNm);
	        Lastname.sendKeys(lastNm);
	    }
	  public void selectGender(String NameoftheGender) throws InterruptedException {

	        if(NameoftheGender.equalsIgnoreCase("Male")){
	            Male.click();
	            Thread.sleep(3000);
	        }
	        else if(NameoftheGender.equalsIgnoreCase("Female")){
	            Female.click();
	            Thread.sleep(3000);
	        }
	  }
	  public void selctCourse(String CName){
	        Add.click();
	      //  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        Select course = new Select(wd.findElement(By.id("select-courses")));
	        course.selectByVisibleText(CName);
	    }
}
	
	
	
	
	
	


