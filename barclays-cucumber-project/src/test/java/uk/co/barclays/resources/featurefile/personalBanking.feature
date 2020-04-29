Feature: Borrow & Find a branch Feature

  As a user I should navigate to overdraft Page and find branch close to me

  Scenario: As a user I should navigate to overdraft page successfully
    Given I am on Home page
    When  I click on Borrow link
    And   I click on Overdraft link
    Then  I can see text "Overdrafts explained" on Overdraft page

  Scenario: As a user I should be able to find a branch
    Given I am on Home page
    When  I click on Find a branch
    And   I enter branch name "Watford"
    And   I click on search button
    Then  I see the result "Watford WD17 2BT"

