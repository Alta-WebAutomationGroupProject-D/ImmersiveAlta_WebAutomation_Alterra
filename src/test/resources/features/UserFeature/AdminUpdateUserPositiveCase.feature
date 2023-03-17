@AdminUpdateProfileUserPos @Automate
Feature: [Positive Case] Update User as Admin

  Scenario: Admin Update User with Valid Parameter
    Given User already in landing page
    When User input "admin@alta.com" as email and "admin" as password
    Then User already in dashboard page
    Then Admin clicked button user page
    And Admin already in user page
    Then Admin click button edit profile
    And Show Pop up Form Edit User
    Then Admin input new "Uchiha Itachi" as Nama and "saringan@alta.com" as Email
    And Choose team "People Skill"
    And Choose status "Not-Active"
    Then Click button Cancel
