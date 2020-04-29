$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/uk/co/barclays/resources/featurefile/personalBanking.feature");
formatter.feature({
  "line": 1,
  "name": "Borrow \u0026 Find a branch Feature",
  "description": "\r\nAs a user I should navigate to overdraft Page and find branch close to me",
  "id": "borrow-\u0026-find-a-branch-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 29209813100,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#  Scenario: As a user I should navigate to overdraft page successfully"
    },
    {
      "line": 6,
      "value": "#    Given I am on Home page"
    },
    {
      "line": 7,
      "value": "#    When  I click on Borrow link"
    },
    {
      "line": 8,
      "value": "#    And   I click on Overdraft link"
    },
    {
      "line": 9,
      "value": "#    Then  I can see text \"Overdrafts explained\" on Overdraft page"
    }
  ],
  "line": 11,
  "name": "As a user I should be able to find a branch",
  "description": "",
  "id": "borrow-\u0026-find-a-branch-feature;as-a-user-i-should-be-able-to-find-a-branch",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on Find a branch",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter branch name \"Watford\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I see the result \"Watford WD17 2BT\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PremierBankingSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 669448400,
  "status": "passed"
});
formatter.match({
  "location": "PersonalBankingSteps.iClickOnFindABranch()"
});
formatter.result({
  "duration": 4504656800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Watford",
      "offset": 21
    }
  ],
  "location": "PersonalBankingSteps.iEnterBranchName(String)"
});
formatter.result({
  "duration": 1809575300,
  "status": "passed"
});
formatter.match({
  "location": "PersonalBankingSteps.iClickOnSearchButton()"
});
formatter.result({
  "duration": 444968100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Watford WD17 2BT",
      "offset": 18
    }
  ],
  "location": "PersonalBankingSteps.iSeeTheResult(String)"
});
formatter.result({
  "duration": 109873500,
  "status": "passed"
});
formatter.after({
  "duration": 1575901700,
  "status": "passed"
});
});