#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Adminlogin
Feature: Validating login page functionality of the application

  @valid_Adminlogin
  Scenario: Admin Login validation -- Positive
    Given User navigating to Collegebag application
    When User enters admin credentials
    And click on login    
    Then User is navigated to Admin Homepage
   
@invalid-Adminlogin
 Scenario: Admin Login validation -- Positive
    Given User navigating to Collegebag application
    When User enters invalid admin credentials
    And click on login    
    Then Error message with invalid credentials is displayed
    
  
