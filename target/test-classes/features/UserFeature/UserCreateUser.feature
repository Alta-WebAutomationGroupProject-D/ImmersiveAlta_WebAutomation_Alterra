@UserCreateNewUser @Automate @UserFeature
Feature: [Positive Case] Create User as User

  Scenario: User Create New User
    Given User already in landing page
    When User input "masihhangat666@gmail.com" as email and "asdasd123" as password
    Then User already in dashboard page
    Then User clicked button user page
    And User already in user page
    And Button doesnt exist