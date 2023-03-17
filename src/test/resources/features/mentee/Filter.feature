@Filter
  Feature: Use filter feature in mentee page
    This test case is everything about feature filter

  Scenario Outline:
    Given User already in landing page
    When User input "admin@alta.com" as email and "admin" as password
    And User already mentee page
    Then User choose "<allClass>" as class
    And User choose "<allStatus>" as status
    Then User choose "<allCategory>" as category
    Examples:
      | allClass | allStatus | allCategory     |
      | sanjaya  | Unit 3    | Informatics     |
      |          | Placement | Non-Informatics |
      |          | Interview |                 |