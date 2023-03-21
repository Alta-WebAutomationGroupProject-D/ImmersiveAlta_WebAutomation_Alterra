@Automate @AdminUpdate @Admin
Feature: Update Class


  Scenario Outline: Admin update class
    Given User already in landing page
    When User input "admin@alta.com" as email and "admin" as password
    Then User already in dashboard page
    Then Super Admin click button of class page
    Then Super Admin click edit button
    Then Super Admin input "<nama kelas>"
    And Super Admin choose mentor "<mentor>"
    And Super Admin choose mulai "<tanggal mulai>"
    And Super Admin choose akhir "<tanggal berakhir>"
    Then Super Admin click save button

    Examples:
      | nama kelas   | mentor       | tanggal mulai | tanggal berakhir |
      | QE Batch 100 | Fajar Sadboy | 03/01/2023    | 03/31/2023       |
      | ^&*()_+      | Fajar Sadboy | 03/01/2023    | 03/31/2023       |
      |              | Fajar Sadboy | 03/01/2023    | 03/31/2023       |