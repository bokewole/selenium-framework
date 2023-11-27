@AccountManagement
Feature: Account Management

  @CreateAccount
  Scenario Outline: Create an using a Valid Email address
    Given I am on create an account page
    When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<Confirmpassword>"
    And I click on create an account
    Then My account page is displayed

    Examples:
      | Firstname | Lastname | Email                  | Password | Confirmpassword |
      | John      | Frinado  | johnfrinado088@aol.com | Powjj23@ | Powjj23@        |


  @LoginAccount
  Scenario Outline: Login using  Email and Password
    Given I am on login page
    When I enter "<Email>" "<Password>"
    And I click on sign in
    Then My Account home is displayed

    Examples:
      | Email                  | Password |
      | johnfrinado008@aol.com | Powjj23@ |