@Automate @AdminDelete @Admin
Feature: Delete Class


  Scenario: Admin delete class
    Given User already in landing page
    When User input "admin@alta.com" as email and "admin" as password
    Then User already in dashboard page
    Then Super Admin click button of class page
    Then Super Admin click delete button