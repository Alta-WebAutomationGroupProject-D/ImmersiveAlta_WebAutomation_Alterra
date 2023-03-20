@UserUpdateProfileUser @Automate
Feature: [Positive Case] Update User as User

  Scenario: User Update User with Invalid Parameter
    Given User already in landing page
    When User input "admin@alta.com" as email and "admin" as password
    Then User already in dashboard page
    Then User clicked button user page
    And User already in user page
    And Button doesnt exist