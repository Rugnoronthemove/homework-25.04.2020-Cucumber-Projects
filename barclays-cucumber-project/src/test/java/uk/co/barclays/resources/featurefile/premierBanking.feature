Feature: PremierBanking feature

  As a user I want To navigate to Premier Banking Page

  Scenario: User should navigate to Premier Banking Page
    Given   I am on Home page
    When    I click on Premier link
    Then    I see the text "Premier Banking" on Premier banking page

  Scenario: User can Navigate to Spring Budget Page successfully
    Given   I am on Home page
    When    I click on Premier link
    And     I click on Spring budget link
    Then    I see the text "Spring Budget 2020" on Spring Budget page

