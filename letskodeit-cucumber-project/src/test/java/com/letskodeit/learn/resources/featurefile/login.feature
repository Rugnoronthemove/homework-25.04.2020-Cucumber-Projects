Feature: Login Feature

  As a user I want to Login and Logout

  Scenario: User should login to their account successfully
    Given   I am on Home page
    When    I click on Login link
    And     I enter email "xyz13@gmail.com"
    And     I enter password "abc123"
    And     I click on log in button
    Then    I should see my courses text "My Courses"

  Scenario: User should logout of their account successfully
    Given   I am on Home page
    When    I click on Login link
    And     I enter email "xyz13@gmail.com"
    And     I enter password "abc123"
    And     I click on log in button
    And     I click on the avatar link
    And     I click on log out button
    Then    I should see login text "Login"
