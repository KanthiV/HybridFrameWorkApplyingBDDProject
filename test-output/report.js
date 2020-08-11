$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login2.feature");
formatter.feature({
  "line": 2,
  "name": "As a user I want a login page so that only authentic",
  "description": "   users will be able to login",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@sprint"
    },
    {
      "line": 1,
      "name": "@database"
    }
  ]
});
formatter.before({
  "duration": 7909832100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Valid user should be able to login",
  "description": "",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-user-should-be-able-to-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Techfios website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "DashBoard Page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_am_on_Techfios_website()"
});
formatter.result({
  "duration": 121617600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_enter_username_and_password()"
});
formatter.result({
  "duration": 710620600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_SignIn_button()"
});
formatter.result({
  "duration": 1496689600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.dashboard_Page_should_display()"
});
formatter.result({
  "duration": 9060600,
  "status": "passed"
});
formatter.after({
  "duration": 704626700,
  "status": "passed"
});
});