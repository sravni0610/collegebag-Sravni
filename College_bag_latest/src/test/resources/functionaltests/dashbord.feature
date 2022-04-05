
@Dashbord
Feature: Checking the Dashbord page
@dashboard1
Scenario:  User Checking  Dashboard page 
Given  User Navigating to "chrome" browser
    When  User navigating to "http://localhost:4200/"
    Then  User enter "admin@gmail.com" and "admin123"
    And  User click on Sign in Button
    And verify the title of the page "Portal | College Bag"
    And User click on "Dashboard" from navigation Panel
    And Close the driver
 