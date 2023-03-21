@Update @Automate
  Feature: Update mentee
    This test case is everything about update mentee

  Scenario: Update mentee
    Given User already in landing page
    When User input "admin@alta.com" as email and "admin" as password
    And User already mentee page
    And User click pencil icon
    Then Update "Syntia" as name "Placement" as status Non-informatics as category female as gender
    And Click save button
    Then User already add in mentee list