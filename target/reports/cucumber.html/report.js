$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TechfiosLogin.feature");
formatter.feature({
  "name": "Techfios billing login page functionality validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Usershould be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_username_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter passward as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enter_passward_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_click_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_land_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on bank and cash",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_click_on_bank_and_cash()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on newAccount",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_click_on_newAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on accounts page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_should_land_on_accounts_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters accountTitle as \"checking\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_accountTitle_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters describtion as \"new account\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_describtion(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters initialbalance as \"4,000,000\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_initial_balance(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Users enters accountnumbers as \"23005674987\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.users_enters_accountnumbers(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters contactperson as \"hillina\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_contactperson(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters phone as \"469-786-9087\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_phone(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters internetBankingURL as \"www.bank of America\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.User_enters_internetBankingURL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on submit",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_click_on_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});