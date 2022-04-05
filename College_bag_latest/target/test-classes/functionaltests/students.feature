
@Students

Feature: Collegebag Students valid/invalid scenarios


@Students1

Scenario: Student Valid Details-- Positive
Given User navigating to "chrome" browser
    When  Navigating to "http://localhost:4200/"
    Then  User enter "admin@gmail.com" and "admin123"
    And  User click on Sign in Button
    And verify the title of the page "Portal | College Bag"
    And User click on "Students" from navigation Panel
    And user should add a new Student with  course type "Master of Computer Science"
    Then  FirstName as "Alex" LastName as "Victor"
    And  click on gender as "Male"
    And Close the driver
