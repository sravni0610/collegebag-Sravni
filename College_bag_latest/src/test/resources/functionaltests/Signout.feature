
@SignOut
Feature: Signout From the Application

  @SignOut1
  Scenario: User should Signout from the College Bag Application
    Given  User Navigating to "chrome" browser
    When  User navigating to "http://localhost:4200/"
    Then  User enter "admin@gmail.com" and "admin123"
    And  User click on Sign in Button
    And verify the title of the page "Portal | College Bag"
    And User click on Sign Out from navigation Panel
    And Close the driver
  