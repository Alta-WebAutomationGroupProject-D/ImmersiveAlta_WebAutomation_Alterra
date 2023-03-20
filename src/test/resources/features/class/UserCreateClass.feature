@Automate @UserCreate @Admin
Feature: Create Class


  Scenario Outline: User create new class
    Given User already in landing page
    When User input "admin@alta.com" as email and "admin" as password
    Then User already in dashboard page
    Then User click button of class page
    Then User click add new button
    Then User input "<nama kelas>"
    And User choose mentor "<mentor>"
    And User choose mulai "<tanggal mulai>"
    And User choose akhir "<tanggal berakhir>"
    Then User click save button

    Examples:
      | nama kelas | mentor         | tanggal mulai | tanggal berakhir |
      | QE Batch 5 | Naruto Uzumaki | 03/01/2023    | 03/31/2023       |
      | ######     | Naruto Uzumaki | 03/01/2023    | 03/31/2023       |
      |            | Naruto Uzumaki | 03/01/2023    | 03/31/2023       |

