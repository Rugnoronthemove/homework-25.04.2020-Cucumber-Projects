Feature: Login and Logout Feature

  As a user I want to Login and Logout of my account

  Scenario: As a user I should be able to login successfully
    Given   I am on Home Page
    When    I click on Sign in tab
    And     I enter "abcd@gmail.com" id in the email field
    And     I enter "abcd1234"in the password field
    And     I click on Sign in button
    Then    I should see the text "My account" on my account page

  Scenario: As a User I should log out successfully
    Given   I am on Home Page
    When    I click on Sign in tab
    And     I enter "abcd@gmail.com" id in the email field
    And     I enter "abcd1234"in the password field
    And     I click on Sign in button
    And     I click on my account button
    And     I click on log out button
    Then    I should see text "Sign in / sign up"
