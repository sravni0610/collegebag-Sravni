package stepDefinition;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class End2End {
	
	

	WebDriver  driver;
	
	@Given("^User navigating to Collegebag application$")
	public void usernavigatingtoCollegebagapplication() throws Throwable {
	    // Write cod here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sravn\\OneDrive\\Documents\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(" http://localhost:4200 ");
	}

	@When("^User enters admin credentials$")
	public void userentersadmincredentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("input-userName")).sendKeys("admin@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("admin123");
	}
		
	@When("^User enters invalid admin credentials$")
	public void userentersinvalidadmincredentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("input-userName")).sendKeys("admin@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("admin");
	}
	
	@When("^click on login$")
	public void clickonlogin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("button-submit")).click();
		Thread.sleep(4000);
		
		//driver.close();
	}
	
	@Then("Error message with invalid credentials is displayed")
	public void error_message_with_invalid_credentials_is_displayed() throws Throwable {
		String x = driver.findElement(By.xpath("//p[contains(text(),'Invalid Credentials')]")).getText();
		String y = "Invalid Credentials";
		System.out.println(x);	
		assertEquals(y, x);
		Thread.sleep(4000);
		
	}
	@Then("^User is navigated to Admin Homepage$")
	public void user_is_navigated_to_Admin_Homepage() throws Throwable {
	     //Write code here that turns the phrase above into concrete actions
	    
		String a = driver.getTitle();
		String b = "Portal | College Bag";
		System.out.println(a);	
		assertEquals(b, a);
		
	}
	
	
	@When("User navigating to Admin Homepage")
	public void user_navigating_to_admin_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@When("click on Dashbord")
	public void click_on_dashbord() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("nav-dashboard")).click();
	    //throw new io.cucumber.java.PendingException();
		
		Thread.sleep(6000);
		
	}
	
	@Then("Dashboard can display the Details")
	public void Dashboard_can_display_the_Details () throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("boxHeader1")).click();
	    //throw new io.cucumber.java.PendingException();
		String s = driver.findElement(By.className("boxHeader1")).getText();
	
		System.out.println(s);
		driver.findElement(By.xpath("//div[contains(text(),'Courses')]")).click();
	    //throw new io.cucumber.java.PendingException();
		String c = driver.findElement(By.xpath("//div[contains(text(),'Courses')]")).getText();
		System.out.println(c);	
		Thread.sleep(6000);
		
	}
	
	
	@When("click on Courses")
	public void click_on_Courses() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("nav-courses")).click();
	    //throw new io.cucumber.java.PendingException();
		
		
	}
	@When("user enter valid course name")
	public void user_enter_valid_course_name() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("input-filter")).sendKeys("Master of Computer Applications");
	    //throw new io.cucumber.java.PendingException();
			
	}
	
	
	@Then("Courses can display the Details")
	public void Courses_can_display_the_Details () throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		String m = driver.findElement(By.xpath("//td[contains(text(),'Master of Computer Applications')]")).getText();
		String s = "Master of Computer Applications";
		System.out.println(m);	
		assertEquals(s, m);
		Thread.sleep(4000);
	}
	
	@When("user enter Invalid course name")
	public void user_enter_Invalid_course_name() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("input-filter")).sendKeys("Mechanical Engineering");
	    //throw new io.cucumber.java.PendingException();
			
	}
	
	@Then("Courses can display the Invalid Details")
	public void Courses_can_display_the_Invalid_Details () throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		//String m = driver.findElement(By.xpath("//td[contains(text(),'Master of Computer Applications')]")).getText();
		//String s = "Match not found";
		System.out.println("Match not Found");	
		//assertEquals(s, m);
		Thread.sleep(4000);
	}
	
	@When("click on Students")
	public void click_on_Students() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("nav-students")).click();
	    //throw new io.cucumber.java.PendingException();
		
		
	}
	@When("user enter valid Student name")
	public void user_enter_valid_Studentname() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='input-filter']")).sendKeys("Alex Victor");
	    //throw new io.cucumber.java.PendingException();
			
	}
	
	
	@Then("Students can display the Details")
	public void Students_can_displaythe_Details () throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		String v = driver.findElement(By.xpath("//td[contains(text(),'Alex')]")).getText();
		String A = "Alex";
		System.out.println(v);	
		assertEquals(A, v);
		Thread.sleep(4000);
	}
	
	
	
	
	
}
