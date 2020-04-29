Feature: New Account Feature

  As a user I want to create a new account

  Scenario: User should navigate to Sign up page successfully
    Given   I am on Home Page
    When    I click on Sign in tab
    And     I click on create new account
    And     I enter random email "" in the email field
    And     I enter password "abcd1234"
    And     I enter confirm password "abcd1234"
    And     I click on create account
    Then    I should see the text "My account"

  Scenario: User should be able to navigate to Sale page in Hot deals
    Given   I am on Home Page
    When    I click on Sign in tab
    And     I enter "abcd@gmail.com" id in the email field
    And     I enter "abcd1234"in the password field
    And     I click on Sign in button
    And     I click on Hot Deals
    And     I click on Sale
    Then    I should see the text "Sale" on Sale page
