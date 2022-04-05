
@Courses 
 Feature: Checking  and Adding the new Course details 

@ValidCoursesname

Scenario: User Checking  Valid Course Details-
Given  User Navigating to "chrome" browser
    When  User Navigating to "http://localhost:4200/"
    Then  User enter "admin@gmail.com" and "admin123"
    And  User click on Sign in Button
    And verify the title of the page "Portal | College Bag"
    And User click on "Courses" from navigation Panel
    And User should add a new course "Master of Science" with acroynm "MSC"
    And Close the driver
    
      