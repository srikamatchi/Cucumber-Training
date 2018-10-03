$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumberReport/cucumberReport.feature");
formatter.feature({
  "line": 1,
  "name": "Cucumber Report",
  "description": "",
  "id": "cucumber-report",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#This is to check test result for Pass test case"
    }
  ],
  "line": 5,
  "name": "Login functionality exists",
  "description": "",
  "id": "cucumber-report;login-functionality-exists",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have opened the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I open Facebook website",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Login button should exist",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberReport.openBrowser()"
});
formatter.result({
  "duration": 8623491181,
  "status": "passed"
});
formatter.match({
  "location": "cucumberReport.openFacebook()"
});
formatter.result({
  "duration": 9685730309,
  "status": "passed"
});
formatter.match({
  "location": "cucumberReport.loginButtonCheck()"
});
formatter.result({
  "duration": 55383339,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 13,
      "value": "#This is to check test result for Failed test case"
    }
  ],
  "line": 15,
  "name": "Forgot password exists",
  "description": "",
  "id": "cucumber-report;forgot-password-exists",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I have open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I open Facebook website",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Forgot password link should exist",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "cucumberReport.openFacebook()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "cucumberReport.forgotPass()"
});
formatter.result({
  "status": "skipped"
});
});