$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Page",
  "description": "As a user I want a login page so that only authentic user can have access",
  "id": "login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Valid users should be able to login",
  "description": "",
  "id": "login-page;valid-users-should-be-able-to-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "a valid user",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user goes to techfios website",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "techfios website should display",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user logs in with valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Dashboard page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.a_valid_user()"
});
formatter.result({
  "duration": 305803366,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_goes_to_techfios_website()"
});
formatter.result({
  "duration": 6482238377,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.techfios_website_should_display()"
});
formatter.result({
  "duration": 18802896,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_logs_in_with_valid_credentials()"
});
formatter.result({
  "duration": 2060638518,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.dashboard_page_should_be_displayed()"
});
formatter.result({
  "duration": 59490060,
  "status": "passed"
});
});