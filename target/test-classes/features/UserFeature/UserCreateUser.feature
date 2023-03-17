@UserAddUserPos @Automate
Feature: [Positive Case] Create User as User

  Scenario: User Create New User
    Given User already in landing page
    When User input "admin@alta.com" as email and "admin" as password
    Then User already in dashboard page
    Then User clicked button user page
    And User already in user page
    Then User click button add new user
    And Show Pop up Akses Ditolak