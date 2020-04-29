$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/xcart/demostore/resources/featurefile/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login and Logout Feature",
  "description": "\r\nAs a user I want to Login and Logout of my account",
  "id": "login-and-logout-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 24566311200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "As a user I should be able to login successfully",
  "description": "",
  "id": "login-and-logout-feature;as-a-user-i-should-be-able-to-login-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Sign in tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter \"abcd@gmail.com\" id in the email field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter \"abcd1234\"in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should see the text \"My account\" on my account page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 858599999,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnSignInTab()"
});
formatter.result({
  "duration": 539941500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd@gmail.com",
      "offset": 9
    }
  ],
  "location": "LoginSteps.iEnterIdInTheEmailField(String)"
});
formatter.result({
  "duration": 871733900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd1234",
      "offset": 9
    }
  ],
  "location": "LoginSteps.iEnterInThePasswordField(String)"
});
formatter.result({
  "duration": 180923001,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnSignInButton()"
});
formatter.result({
  "duration": 245965801,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My account",
      "offset": 23
    }
  ],
  "location": "LoginSteps.iShouldSeeTheTextOnMyAccountPage(String)"
});
formatter.result({
  "duration": 3568253801,
  "status": "passed"
});
formatter.after({
  "duration": 1484719300,
  "status": "passed"
});
formatter.before({
  "duration": 17622470601,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "As a User I should log out successfully",
  "description": "",
  "id": "login-and-logout-feature;as-a-user-i-should-log-out-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on Sign in tab",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I enter \"abcd@gmail.com\" id in the email field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter \"abcd1234\"in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on my account button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on log out button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should see text \"Sign in / sign up\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 886700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnSignInTab()"
});
formatter.result({
  "duration": 681642000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd@gmail.com",
      "offset": 9
    }
  ],
  "location": "LoginSteps.iEnterIdInTheEmailField(String)"
});
formatter.result({
  "duration": 963996901,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd1234",
      "offset": 9
    }
  ],
  "location": "LoginSteps.iEnterInThePasswordField(String)"
});
formatter.result({
  "duration": 268510300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnSignInButton()"
});
formatter.result({
  "duration": 242735400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnMyAccountButton()"
});
formatter.result({
  "duration": 3100279300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLogOutButton()"
});
formatter.result({
  "duration": 12681810800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign in / sign up",
      "offset": 19
    }
  ],
  "location": "LoginSteps.iShouldSeeText(String)"
});
formatter.result({
  "duration": 82228200,
  "status": "passed"
});
formatter.after({
  "duration": 1144655599,
  "status": "passed"
});
formatter.uri("src/test/java/com/xcart/demostore/resources/featurefile/NewAccount.feature");
formatter.feature({
  "line": 1,
  "name": "New Account Feature",
  "description": "\r\nAs a user I want to create a new account",
  "id": "new-account-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16786778199,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to Sign up page successfully",
  "description": "",
  "id": "new-account-feature;user-should-navigate-to-sign-up-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Sign in tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on create new account",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter random email \"\" in the email field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter password \"abcd1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter confirm password \"abcd1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on create account",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should see the text \"My account\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 565700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnSignInTab()"
});
formatter.result({
  "duration": 626681901,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewAccountSteps.iClickOnCreateNewAccount()"
});
formatter.result({
  "duration": 11386563401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 22
    }
  ],
  "location": "CreateNewAccountSteps.iEnterRandomEmailInTheEmailField(String)"
});
formatter.result({
  "duration": 336640500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd1234",
      "offset": 18
    }
  ],
  "location": "CreateNewAccountSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 331957499,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd1234",
      "offset": 26
    }
  ],
  "location": "CreateNewAccountSteps.iEnterConfirmPassword(String)"
});
formatter.result({
  "duration": 164644700,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewAccountSteps.iClickOnCreateAccount()"
});
formatter.result({
  "duration": 181301600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My account",
      "offset": 23
    }
  ],
  "location": "CreateNewAccountSteps.iShouldSeeTheText(String)"
});
formatter.result({
  "duration": 2091087000,
  "status": "passed"
});
formatter.after({
  "duration": 1484973500,
  "status": "passed"
});
formatter.before({
  "duration": 17303217700,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User should be able to navigate to Sale page in Hot deals",
  "description": "",
  "id": "new-account-feature;user-should-be-able-to-navigate-to-sale-page-in-hot-deals",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I click on Sign in tab",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I enter \"abcd@gmail.com\" id in the email field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter \"abcd1234\"in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on Hot Deals",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on Sale",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I should see the text \"Sale\" on Sale page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 350800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnSignInTab()"
});
formatter.result({
  "duration": 490554900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd@gmail.com",
      "offset": 9
    }
  ],
  "location": "LoginSteps.iEnterIdInTheEmailField(String)"
});
formatter.result({
  "duration": 901590500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd1234",
      "offset": 9
    }
  ],
  "location": "LoginSteps.iEnterInThePasswordField(String)"
});
formatter.result({
  "duration": 181235400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnSignInButton()"
});
formatter.result({
  "duration": 200030301,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewAccountSteps.iClickOnHotDeals()"
});
formatter.result({
  "duration": 3417491900,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewAccountSteps.iClickOnSale()"
});
formatter.result({
  "duration": 2691477800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sale",
      "offset": 23
    }
  ],
  "location": "CreateNewAccountSteps.iShouldSeeTheTextOnSalePage(String)"
});
formatter.result({
  "duration": 89256101,
  "status": "passed"
});
formatter.after({
  "duration": 1375291500,
  "status": "passed"
});
});