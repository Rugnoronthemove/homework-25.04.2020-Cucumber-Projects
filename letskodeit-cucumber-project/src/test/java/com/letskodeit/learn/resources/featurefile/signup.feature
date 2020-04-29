Feature: Sign Up Feature

  As a user I want to register an account on Lets Kode It website

  Scenario: User should navigate to sign up page successfully
    Given   I am on Home page
    When    I click on Sign up link
    Then    I should see sign up to lets kode it text "Sign Up to Let's Kode It"

    Scenario: Verify text when I register a account successfully
      Given   I am on Home page
      When    I click on Sign up link
      And     I enter full name "Prime Testing"
      And     I enter a random email address
      And     I enter password "abc123"
      And     I enter confirm password "abc123"
      And     I select the check box for terms and conditions
      And     I click on Sign up button
      Then    I should see my courses text "My Courses"
