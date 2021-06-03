$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "OrangeHRM website Login functionality",
  "description": "",
  "id": "orangehrm-website-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Testing Login with Valid credentials",
  "description": "",
  "id": "orangehrm-website-login-functionality;testing-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User opens URL \"https://opensource-demo.orangehrmlive.com/\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter username as \"Admin\" and password as \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Page title should be \"OrangeHRM\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click on \"Welcome Paul\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user click on log out link",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "https://opensource-demo.orangehrmlive.com/",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_URL()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 24
    },
    {
      "val": "admin123",
      "offset": 48
    }
  ],
  "location": "Steps.user_enter_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "OrangeHRM",
      "offset": 22
    }
  ],
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome Paul",
      "offset": 15
    }
  ],
  "location": "Steps.user_click_on(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.user_click_on_log_out_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Login Data Driven",
  "description": "",
  "id": "orangehrm-website-login-functionality;login-data-driven",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User opens URL \"https://opensource-demo.orangehrmlive.com/\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enter username as \"\u003cusername\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Login page opens",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Page title should be \"OrangeHRM\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User click on \"Welcome Paul\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user click on log out link",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "orangehrm-website-login-functionality;login-data-driven;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "",
        "Admin",
        "admin123",
        "",
        "admin",
        "Admin123"
      ],
      "line": 25,
      "id": "orangehrm-website-login-functionality;login-data-driven;;1"
    }
  ],
  "keyword": "Examples"
});
});