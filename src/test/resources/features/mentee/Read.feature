@Read
  Feature: Read data mentee
    This test case is everything about read mentee

  Scenario: Read added new mentee
    Given User already in landing page
    When User input "admin@alta.com" as email and "admin" as password
    And User already mentee page
    Then New user is already added