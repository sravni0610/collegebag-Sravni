package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;


public class CB_Homepage {

	public WebDriver wd;
	
	@FindBy(id ="nav-dashboard")
	public WebElement Dashboard;
	
	@FindBy(id ="nav-courses")
	public WebElement Courses;
	
	@FindBy(id ="nav-students")
	public WebElement Students;
	
	@FindBy(id ="nav-signout")
	public WebElement Signout;
	
	 public CB_Homepage(WebDriver wd){
	        this.wd=wd;
	        PageFactory.initElements(wd,this);
	        
	    }
	 
	 public void Click_on_ListPage(String Listname) throws InterruptedException {
		 
		 if (Listname.equalsIgnoreCase("Dashboard")){
	            Dashboard.click();
	            System.out.println("The DashBoard page is::"+wd.getTitle());
	            Assert.assertEquals(wd.getTitle(),"Portal | College Bag");
	        }
		 else if (Listname.equalsIgnoreCase("Courses")) {
	            Courses.click();
	            System.out.println("The Course page is::"+wd.getTitle());
	            Assert.assertEquals(wd.getTitle(), "Portal | College Bag");
	        }

		 else if (Listname.equalsIgnoreCase("Students")){
	            Students.click();
	            System.out.println("The Students page is::"+wd.getTitle());
	            Assert.assertEquals(wd.getTitle(),"Portal | College Bag");
	        }
		 
	       
		 else   if(Listname.equalsIgnoreCase("Sign Out")){
	            Thread.sleep(3000);
	          Signout.click();
	            System.out.println("The sign out page is::"+wd.getTitle());
	            Assert.assertEquals(wd.getTitle(),"Portal | College Bag");

	        }
	        



	    }

	 

	
	}
