package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Duration;




import Pom.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class E2E {

	public WebDriver wd;
	
	LoginPage lp;
    
    Browser bp;
    CB_Homepage hp;
    Courses cp;
    Students sp;
    Dashbord dp;
    
    @Given("User Navigating to {string} browser")
    public void user_Navigating_to(String browserName) {
        bp = new Browser();
        bp.Browsername(browserName);
        wd = new ChromeDriver();
       // wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("User Navigating to{string}")
    public void user_Navigatingto(String url) {
        wd.get(url);
        wd.manage().window().maximize();

    }
    @Then("User_enters admin login credentials {string} and {string}")
    public void User_enters_admin_login_credentials(String usrname, String passwrd) {
        lp = new LoginPage(wd);
        lp.User_enters_admin_login_credentials(usrname,passwrd);
    }
    @Then("User click on Sign in Button")
    public void user_click_on_sign_in_button() {
        lp.clickOnLogin();
    }

    @Then("verify the title of the page")
    public void verify_the_title_of_the_page() {

        /*String HomepageTitle= driver.getTitle();
        System.out.println("The title of the homepage is ::"+HomepageTitle);
        Assert.assertEquals(HomepageTitle,"Portal | College Bag");*/
            }

    @Then("verify the title of the page {string}")
    public void verify_the_title_of_the_page(String titleofthepage) {
        lp.titleofthepage(titleofthepage);
    }

    @Then("Close the driver")
    public void tearDown() {
        wd.close();
    }
    

    @Then("User click on Sign Out from navigation Panel")
    public void user_click_on_sign_out_from_navigation_panel() throws InterruptedException {
        hp = new CB_Homepage(wd);
        hp.Click_on_ListPage("Sign Out");

    }
    @Then("User verify the title of the page")
    public void user_verify_the_title_of_the_page() {

    }

    @Then("User click on {string} from navigation Panel")
    public void user_click_on_from_navigation_panel(String NavigationName) throws InterruptedException {
        Thread.sleep(3000);
        hp =new CB_Homepage(wd);
        hp.Click_on_ListPage(NavigationName);

    }

    @Then("User should add a new course {string} with acroynm {string}")
    public void user_should_add_a_new_course_with_acroynm(String Cname, String Acrname) {
        cp = new Courses(wd);
        cp.new_course_name(Cname,Acrname);
        cp.getListofCourses();
    }
    
    @And("User click on {string} from navigation Panel")
    public void user_click_on_courses_from_navigation_panel(String Cname) throws InterruptedException {
    	Thread.sleep(3000);
        hp =new CB_Homepage(wd);
        hp.Click_on_ListPage(Cname);
    	
    }

    
    @Then("user should add a new Student with  course type {string}")
    public void user_should_add_a_new_student_with_course_type(String courseName) throws InterruptedException {
        Thread.sleep(3000);
        sp = new Students(wd);
        sp.selctCourse(courseName);
    }
    /*@Then("FirstName as {string} LastName as {string} Gender as {string}")
    public void first_name_as_last_name_as_gender_as(String fname, String lName, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/

    @Then("FirstName as {string} LastName as {string}")
    public void first_name_as_last_name_as(String fname, String lname) {
        sp = new Students(wd);
        sp.setName(fname,lname);
    }

    @Then("click on gender as {string}")
    public void click_on_gender_as(String genName) throws InterruptedException {
        sp.selectGender(genName);
    }

    

   





	
	
}
