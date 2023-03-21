@Search @Automate
  Feature: Search user
    This test case is everything about search feature

#  Scenario Outline: Searching name user
#    Given User already in landing page
#    When User input "admin@alta.com" as email and "admin" as password
#    And User already mentee page
#    Then User input "<name>" as name user to look for
#    Examples:
#      | name   |
#      | luffy  |
#      | SadBoy |
#      | Sholeh |

  Scenario Outline: Searching invalid user
    Given User already in landing page
    When User input "admin@alta.com" as email and "admin" as password
    And User already mentee page
    Then User input "<name>" as name user to look for
    Examples:
      | name   |
      | 213213 |
      | juklnm |
      | .;'p'' |