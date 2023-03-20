@Automate @UserDelete @Admin
Feature: Delete Class


  Scenario Outline: User delete class
    Given User already in landing page
    When User input "admin@alta.com" as email and "admin" as password
    Then User already in dashboard page
    Then User click button of class page
    Then User click delete button