$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Workplace/E2E/src/test/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "login",
  "description": "",
  "id": "login;login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user should login the  application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter the user name",
  "keyword": "When "
});
formatter.match({
  "location": "Code.user_should_login_the_application()"
});
formatter.result({
  "duration": 38973594600,
  "status": "passed"
});
formatter.match({
  "location": "Code.enter_the_user_name()"
});
formatter.result({
  "duration": 2032043600,
  "error_message": "java.lang.NullPointerException\r\n\tat Gluecode.Code.enter_the_user_name(Code.java:59)\r\n\tat ✽.When Enter the user name(D:/Workplace/E2E/src/test/java/Features/Login.feature:6)\r\n",
  "status": "failed"
});
});