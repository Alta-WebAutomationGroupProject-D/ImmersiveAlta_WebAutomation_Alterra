@Log
  Feature: Add log in mentee
    This test case is evrything about log

  Scenario: Add new log in mentee
    Given User already in landing page
    When User input "admin@alta.com" as email and "admin" as password
    And User already mentee page
    And User click book icon