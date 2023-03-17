#@AdminAddUserNeg @Automate
#Feature: [Positive Case] Create User as Admin
#
#  Scenario Outline: Admin Create User with Invalid Parameter
#    Given User already in landing page
#    When User input "admin@alta.com" as email and "admin" as password
#    Then User already in dashboard page
#    Then Admin clicked button user page
#    And Admin already in user page
#    Then Admin click button add new user
#    And Show Pop up Form New User
#    Then Admin input "<name>" as Nama and "<email>" as Email and "<password>" as Password
#    And Choose team "Placement"
#    And Choose status "Not-Active"
#    Then Click button Save
#
#    Examples:
#      | name          | email     | password |
#      | baru banget   | contoh123 | asdasd   |
#      | baru banget 2 | 12312312  | asdasd   |
#      | Fajar Sadboy  | %&^%&%%   | asdads   |
#
#  Scenario: Admin Create User with Exiting Parameter
#    Given User already in landing page
#    When User input "admin@alta.com" as email and "admin" as password
#    Then User already in dashboard page
#    Then Admin clicked button user page
#    And Admin already in user page
#    Then Admin click button add new user
#    And Show Pop up Form New User
#    Then Admin input "User Baru Banget" as Nama and "naruto@mail.com" as Email and "affaantuh" as Password
#    And Choose team "Placement"
#    And Choose status "Not-Active"
#    Then Click button Save
#
#  Scenario: Admin Create User with Blank Parameter
#    Given User already in landing page
#    When User input "admin@alta.com" as email and "admin" as password
#    Then User already in dashboard page
#    Then Admin clicked button user page
#    And Admin already in user page
#    Then Admin click button add new user
#    And Show Pop up Form New User
#    Then Admin input "Baru Lagi" as Nama and blank as Blank Email and "baru" as Password
#    And Choose team "Placement"
#    And Choose status "Not-Active"
#    Then Click button Save