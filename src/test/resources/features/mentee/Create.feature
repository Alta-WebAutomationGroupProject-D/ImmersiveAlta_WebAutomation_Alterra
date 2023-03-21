@Create @Automate
  Feature: Create new mentee
    This test case is everything about create new mentee

  Scenario: Create valid new mentee
    Given User already in landing page
    When User input "admin@alta.com" as email and "admin" as password
    And User already mentee page
    Then Add new mentee
    And Input "AldanM" as name "Ngajuk" as address "Nganjuk" "aldan75@gmail.com" as email "082334131788" as telegram
    And Input "082334131787" as phone "XingWilling" as discord "Unit 3" as status "p" as class
    And In emergency data input "Aldanmf" as name "082334131786" as phone "Saudara dari Orang Tua" as status
    And In education data input "Sarjana" as major "UNS" as institution
    Then Click save button

  Scenario: Create blank new mentee
    Given User already in landing page
    When User input "admin@alta.com" as email and "admin" as password
    And User already mentee page
    Then Add new mentee
    And Input "" as name "Ngajuk" as address "Nganjuk" "aldan756@gmail.com" as email "082334131783" as telegram
    And Input "082334131787" as phone "XingWilling" as discord "Unit 3" as status "p" as class
    And In emergency data input "Aldanmf" as name "082334131786" as phone "Saudara dari Orang Tua" as status
    And In education data input "Sarjana" as major "UNS" as institution
    Then Click save button