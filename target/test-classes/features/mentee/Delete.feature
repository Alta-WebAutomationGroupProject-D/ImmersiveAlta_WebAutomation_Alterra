@Delete @Automate
  Feature: Delete user
    This test case is everything about delete

  Scenario: Delete user
    Given User already in landing page
    When User input "admin@alta.com" as email and "admin" as password
    And User already mentee page
    Then Click rubbish icon