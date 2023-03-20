@CreateUserPositiveAsAdmin @Automate
Feature: [Positive Case] Create User as Admin

  Scenario: Admin Create User with Valid Parameter
    Given User already in landing page
    When User input "admin@alta.com" as email and "admin" as password
    Then User already in dashboard page
    Then Admin clicked button user page
    And Admin already in user page
    Then Admin click button add new user
    And Show Pop up Form New User
    Then Admin input "User Baru" as Nama and "sulitsekalibuatemaildoang@hotmail.com" as Email and "apaajabisa123" as Password
    And Choose team "Placement"
    And Choose status "Not-Active"
    Then Click button Save