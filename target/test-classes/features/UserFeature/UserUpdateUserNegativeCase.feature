#@UserUpdateUserNeg @Automate
#Feature: [Positive Case] Update User as User
#
#  Scenario Outline: User Update User with Invalid Parameter
#    Given User already in landing page
#    When User input "admin@alta.com" as email and "admin" as password
#    Then User already in dashboard page
#    Then User clicked button user page
#    And User already in user page
#    Then User click button edit profile
#    And Show Pop up Form Edit User
#    Then User input "<name>" as new Nama and "<newemail>" as new Email
#    And Choose team "People Skill"
#    And Choose status "Not-Active"
#    Then Click button Cancel
#
#    Examples:
#      | name       | newemail        |
#      | Suzume     | asikasik        |
#      | Siapa ajah | 123123          |
#      | $%$^$^%$   | sulit@gmail.com |
#
#  Scenario : User Update User with blank Parameter
#    Given User already in landing page
#    When User input "admin@alta.com" as email and "admin" as password
#    Then User already in dashboard page
#    Then User clicked button user page
#    And User already in user page
#    Then User click button edit profile
#    And Show Pop up Form Edit User
#    Then User input new "Slowpoke" as Nama and blank as Blank Email
#    And Choose team "People Skill"
#    And Choose status "Not-Active"
#    Then Click button Cancel