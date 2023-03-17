@AdminUpdateProfileUserNeg @Automate
Feature: [Positive Case] Update User as Admin

  Scenario Outline: Admin Update User with Invalid Parameter
    Given User already in landing page
    When User input "admin@alta.com" as email and "admin" as password
    Then User already in dashboard page
    Then Admin clicked button user page
    And Admin already in user page
    Then Admin click button edit profile
    And Show Pop up Form Edit User
    Then Admin input new "<name>" as Nama and "<newemail>" as Email
    And Choose team "People Skill"
    And Choose status "Not-Active"
    Then Click button Save

    Examples:
      | name       | newemail        |
      | Suzume     | asikasik        |
      | Siapa ajah | 123123          |
      | $%$^$^%$   | sulit@gmail.com |

  Scenario : Admin Update User with blank Parameter
    Given User already in landing page
    When User input "admin@alta.com" as email and "admin" as password
    Then User already in dashboard page
    Then Admin clicked button user page
    And Admin already in user page
    Then Admin click button edit profile
    And Show Pop up Form Edit User
    Then Admin input new "Slowpoke" as Nama and blank as Blank Email
    And Choose team "People Skill"
    And Choose status "Not-Active"
    Then Click button Cancel