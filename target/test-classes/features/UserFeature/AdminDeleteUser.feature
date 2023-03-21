@AdminDeleteUserPos @Automate @UserFeature
Feature: [Positive Case] Delete User as Admin

  Scenario: Admin Delete User
    Given User already in landing page
    When User input "admin@alta.com" as email and "admin" as password
    Then User already in dashboard page
    Then Admin clicked button user page
    And Admin already in user page
    Then Click button delete user