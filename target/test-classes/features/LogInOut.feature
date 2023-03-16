@LogInOut
  Feature: Login and logout
    This test case is everything about login and logout

  Scenario: Normal login
    Given User already in landing page
    When User input "admin@alta.com" as email and "admin" as password
    Then User already in dashboard page

  Scenario Outline: Invalid login
    Given User already in landing page
    When User input "<email>" as email and "<pass>" as password
    Then Error message should appear "Please enter a valid username or password.."
    Examples:
      | email          | pass    |
      | asdads         | dasdasd |
      | dsdd@gmail.com | asdasda |
      | admin@alta.com |         |
      |                | admin   |