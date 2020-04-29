$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/letskodeit/learn/resources/featurefile/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "\r\nAs a user I want to Login and Logout",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 29311330000,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should login to their account successfully",
  "description": "",
  "id": "login-feature;user-should-login-to-their-account-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Login link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter email \"xyz13@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter password \"abc123\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on log in button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should see my courses text \"My Courses\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 3227352000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 482725000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz13@gmail.com",
      "offset": 15
    }
  ],
  "location": "LoginSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 8391022400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 192875400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLogInButton()"
});
formatter.result({
  "duration": 2209540900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Courses",
      "offset": 30
    }
  ],
  "location": "LoginSteps.iShouldSeeMyCoursesText(String)"
});
formatter.result({
  "duration": 20962646500,
  "status": "passed"
});
formatter.after({
  "duration": 1847279900,
  "status": "passed"
});
formatter.before({
  "duration": 18468960100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User should logout of their account successfully",
  "description": "",
  "id": "login-feature;user-should-logout-of-their-account-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on Login link",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I enter email \"xyz13@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter password \"abc123\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on log in button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on the avatar link",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on log out button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should see login text \"Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 745400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 228007600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz13@gmail.com",
      "offset": 15
    }
  ],
  "location": "LoginSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 4849791200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 337212400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLogInButton()"
});
formatter.result({
  "duration": 17873456300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnTheAvatarLink()"
});
formatter.result({
  "duration": 231858100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLogOutButton()"
});
formatter.result({
  "duration": 13471534500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 25
    }
  ],
  "location": "LoginSteps.iShouldSeeLoginText(String)"
});
formatter.result({
  "duration": 161634200,
  "status": "passed"
});
formatter.after({
  "duration": 1369232300,
  "status": "passed"
});
formatter.uri("src/test/java/com/letskodeit/learn/resources/featurefile/signup.feature");
formatter.feature({
  "line": 1,
  "name": "Sign Up Feature",
  "description": "\r\nAs a user I want to register an account on Lets Kode It website",
  "id": "sign-up-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16096612700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to sign up page successfully",
  "description": "",
  "id": "sign-up-feature;user-should-navigate-to-sign-up-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Sign up link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see sign up to lets kode it text \"Sign Up to Let\u0027s Kode It\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 627700,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.iClickOnSignUpLink()"
});
formatter.result({
  "duration": 245192300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign Up to Let\u0027s Kode It",
      "offset": 43
    }
  ],
  "location": "SignUpSteps.iShouldSeeSignUpToLetsKodeItText(String)"
});
formatter.result({
  "duration": 4375865200,
  "status": "passed"
});
formatter.after({
  "duration": 1382282500,
  "status": "passed"
});
formatter.before({
  "duration": 15269923300,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify text when I register a account successfully",
  "description": "",
  "id": "sign-up-feature;verify-text-when-i-register-a-account-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on Sign up link",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I enter full name \"Prime Testing\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter a random email address",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter password \"abc123\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter confirm password \"abc123\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select the check box for terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on Sign up button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I should see my courses text \"My Courses\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 728100,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.iClickOnSignUpLink()"
});
formatter.result({
  "duration": 338507800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prime Testing",
      "offset": 19
    }
  ],
  "location": "SignUpSteps.iEnterFullName(String)"
});
formatter.result({
  "duration": 3793847200,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.iEnterARandomEmailAddress()"
});
formatter.result({
  "duration": 1115760600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 205804600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 26
    }
  ],
  "location": "SignUpSteps.iEnterConfirmPassword(String)"
});
formatter.result({
  "duration": 219413200,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.iSelectTheCheckBoxForTermsAndConditions()"
});
formatter.result({
  "duration": 164580300,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.iClickOnSignUpButton()"
});
formatter.result({
  "duration": 16861735600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Courses",
      "offset": 30
    }
  ],
  "location": "LoginSteps.iShouldSeeMyCoursesText(String)"
});
formatter.result({
  "duration": 125130400,
  "status": "passed"
});
formatter.after({
  "duration": 1397020300,
  "status": "passed"
});
});