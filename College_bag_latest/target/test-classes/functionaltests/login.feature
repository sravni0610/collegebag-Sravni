
@Adminlogin
Feature: Validating login page functionality of the application

  @valid_Adminlogin
  Scenario: CollegeBag page is successfully login
    Given User navigating to "Chrome" Browser
     When  User Navigating to  "http://localhost:4200/"
    Then  User enter "admin@gmail.com" and "admin123"
    And  User click on Sign in Button
    And verify the title of the page "Portal | College Bag"
    And Close the driver
   
@invalid-Adminlogin
 Scenario: CollegeBag page  login Using Invalid Crendentials
  Given User Navigating to "chrome" browser
    When  User Navigating to "http://localhost:4200/"
    Then  User enter "<Username>" and "<Password>"
    And  User click on Sign in Button
    And verify the title of the page "Portal | College Bag"
    And Close the driver
    Examples:
      |Username          | Password    |
      |                  |
  	  |admin@gmail.com   |admin@123     |
      |            
      |         |
    