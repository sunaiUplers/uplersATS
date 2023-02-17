$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 89700,
  "status": "passed"
});
formatter.before({
  "duration": 734900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Enter Username and Password",
  "description": "",
  "id": "login-functionality;enter-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@profile"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I want to go on Uplers",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I verify the Email id and Password are displayed",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter the Email id and Password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify HomePage Header Text",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Profile Link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify \"Personal Details\" section",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on Personal Details link",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.i_want_to_go_on_Uplers()"
});
formatter.result({
  "duration": 8716811400,
  "status": "passed"
});
formatter.match({
  "location": "Login_Steps.i_verify_the_Email_id_and_Password_are_displayed()"
});
formatter.result({
  "duration": 116942300,
  "status": "passed"
});
formatter.match({
  "location": "Login_Steps.i_enter_the_Email_id_and_Password()"
});
formatter.result({
  "duration": 281334000,
  "status": "passed"
});
formatter.match({
  "location": "Login_Steps.i_click_on_Login_Button()"
});
formatter.result({
  "duration": 9721566600,
  "status": "passed"
});
formatter.match({
  "location": "HomePage_Steps.i_verify_HomePage_Header_Text()"
});
formatter.result({
  "duration": 178248900,
  "status": "passed"
});
formatter.match({
  "location": "Profile_Steps.i_click_on_Profile_Link()"
});
formatter.result({
  "duration": 5269987300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Personal Details",
      "offset": 10
    }
  ],
  "location": "Profile_Steps.i_verify_section(String)"
});
formatter.result({
  "duration": 147337400,
  "status": "passed"
});
formatter.match({
  "location": "Profile_Steps.i_click_on_Personal_Details_link()"
});
formatter.result({
  "duration": 180208200,
  "status": "passed"
});
formatter.after({
  "duration": 192800,
  "status": "passed"
});
});