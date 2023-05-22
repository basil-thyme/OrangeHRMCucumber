$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test",
  "description": "",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3601122200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "As a user, I should be able to login successfully",
  "description": "",
  "id": "login-test;as-a-user,-i-should-be-able-to-login-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I enter username for login",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter password for login",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify \"Dashboard\" message",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I verify logo is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.i_enter_username_for_login()"
});
formatter.result({
  "duration": 298932600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_enter_password_for_login()"
});
formatter.result({
  "duration": 89510400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_click_on_login_button()"
});
formatter.result({
  "duration": 918011200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard",
      "offset": 10
    }
  ],
  "location": "LoginStepDef.i_verify_message(String)"
});
formatter.result({
  "duration": 256304000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.iVerifyLogoIsDisplayed()"
});
formatter.result({
  "duration": 2079887100,
  "status": "passed"
});
formatter.after({
  "duration": 130300,
  "status": "passed"
});
formatter.uri("logout.feature");
formatter.feature({
  "line": 1,
  "name": "Logout Test",
  "description": "",
  "id": "logout-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1989487300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "As a user, I should be able to verify that I should be able to logout successfully",
  "description": "",
  "id": "logout-test;as-a-user,-i-should-be-able-to-verify-that-i-should-be-able-to-logout-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I enter username for login",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter password for login",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on user profile logo",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I mouse hover on logout and click",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify the text login panel is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.i_enter_username_for_login()"
});
formatter.result({
  "duration": 335150700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_enter_password_for_login()"
});
formatter.result({
  "duration": 77974000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_click_on_login_button()"
});
formatter.result({
  "duration": 896289500,
  "status": "passed"
});
formatter.match({
  "location": "LogoutStepDef.iClickOnUserProfileLogo()"
});
formatter.result({
  "duration": 2070541600,
  "status": "passed"
});
formatter.match({
  "location": "LogoutStepDef.i_mouse_hover_on_logout_and_click()"
});
formatter.result({
  "duration": 2552343000,
  "status": "passed"
});
formatter.match({
  "location": "LogoutStepDef.i_verify_the_text_login_panel_is_displayed()"
});
formatter.result({
  "duration": 201741100,
  "status": "passed"
});
formatter.after({
  "duration": 39000,
  "status": "passed"
});
});