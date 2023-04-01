$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("register.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Feature file consists of functional test cases in the form of cucumber feature files written in gherkin format (BDD)"
    }
  ],
  "line": 3,
  "name": "Register functionality",
  "description": "\r\nAs a user I would like to register with Ensek",
  "id": "register-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9159863100,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Verify user is able to register with Ensek",
  "description": "",
  "id": "register-functionality;verify-user-is-able-to-register-with-ensek",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I verify the text \u0027Create a new account.\u0027 on register page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I send text to email field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter text into password field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter text into confirm password field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on register button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should register successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I am getting an \u0027Error\u0027 and unable to register",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterPageSteps.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 234955800,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 511954600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.iVerifyTheTextCreateANewAccountOnRegisterPage()"
});
formatter.result({
  "duration": 92097200,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.iSendTextToEmailField()"
});
formatter.result({
  "duration": 151383900,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.iEnterTextIntoPasswordField()"
});
formatter.result({
  "duration": 136084500,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.iEnterTextIntoConfirmPasswordField()"
});
formatter.result({
  "duration": 145111500,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 44569059500,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.iShouldRegisterSuccessfully()"
});
formatter.result({
  "duration": 26800,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.iAmGettingAnErrorAndUnableToRegister()"
});
formatter.result({
  "duration": 60312400,
  "status": "passed"
});
formatter.after({
  "duration": 843297800,
  "status": "passed"
});
});