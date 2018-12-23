$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Makemy trip Login functionality",
  "description": "",
  "id": "makemy-trip-login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Login to Makemy trip with valid functionality",
  "description": "",
  "id": "makemy-trip-login-functionality;login-to-makemy-trip-with-valid-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I enter user name \"\u003cusername\u003e\"and password \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click on logout button",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "makemy-trip-login-functionality;login-to-makemy-trip-with-valid-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "makemy-trip-login-functionality;login-to-makemy-trip-with-valid-functionality;;1"
    },
    {
      "cells": [
        "bsiva.kumar070@gmail.com",
        "siva@123B"
      ],
      "line": 15,
      "id": "makemy-trip-login-functionality;login-to-makemy-trip-with-valid-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7516935900,
  "status": "passed"
});
formatter.before({
  "duration": 159073,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Verify home page title",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.launch_the_application()"
});
formatter.result({
  "duration": 12832595787,
  "status": "passed"
});
formatter.match({
  "location": "Login.verify_home_page_title()"
});
formatter.result({
  "duration": 9520240,
  "status": "passed"
});
formatter.match({
  "location": "Login.click_on_login_button()"
});
formatter.result({
  "duration": 1377031307,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login to Makemy trip with valid functionality",
  "description": "",
  "id": "makemy-trip-login-functionality;login-to-makemy-trip-with-valid-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I enter user name \"bsiva.kumar070@gmail.com\"and password \"siva@123B\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click on logout button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "bsiva.kumar070@gmail.com",
      "offset": 19
    },
    {
      "val": "siva@123B",
      "offset": 58
    }
  ],
  "location": "Login.i_enter_user_name_and_password(String,String)"
});
formatter.result({
  "duration": 17864111179,
  "status": "passed"
});
formatter.match({
  "location": "Login.click_on_logout_button()"
});
formatter.result({
  "duration": 366071528,
  "status": "passed"
});
formatter.after({
  "duration": 2973063859,
  "status": "passed"
});
formatter.uri("SignUp.feature");
formatter.feature({
  "line": 1,
  "name": "Creating Make my trip account",
  "description": "",
  "id": "creating-make-my-trip-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "SignUp into Make my trip account",
  "description": "",
  "id": "creating-make-my-trip-account;signup-into-make-my-trip-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on signup link",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User enter email into Email text filed \"\u003cEmail\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User enter phone number into Mobile number text field \"\u003cMobile\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enter password into Password text field \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on signUp button",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "creating-make-my-trip-account;signup-into-make-my-trip-account;",
  "rows": [
    {
      "cells": [
        "Email",
        "Mobile",
        "Password"
      ],
      "line": 12,
      "id": "creating-make-my-trip-account;signup-into-make-my-trip-account;;1"
    },
    {
      "cells": [
        "sivakumarb070@gmail.com",
        "9606653856",
        "Siva@123"
      ],
      "line": 13,
      "id": "creating-make-my-trip-account;signup-into-make-my-trip-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4114548976,
  "status": "passed"
});
formatter.before({
  "duration": 44058,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "SignUp into Make my trip account",
  "description": "",
  "id": "creating-make-my-trip-account;signup-into-make-my-trip-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on signup link",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User enter email into Email text filed \"sivakumarb070@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User enter phone number into Mobile number text field \"9606653856\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enter password into Password text field \"Siva@123\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on signUp button",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.launch_the_application()"
});
formatter.result({
  "duration": 7008226790,
  "status": "passed"
});
formatter.match({
  "location": "SignUp.click_on_signup_link()"
});
formatter.result({
  "duration": 246685910,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sivakumarb070@gmail.com",
      "offset": 40
    }
  ],
  "location": "SignUp.user_enter_email_into_Email_text_filed(String)"
});
formatter.result({
  "duration": 1207217352,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9606653856",
      "offset": 55
    }
  ],
  "location": "SignUp.user_enter_phone_number_into_Mobile_number_text_field(String)"
});
formatter.result({
  "duration": 385551198,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Siva@123",
      "offset": 46
    }
  ],
  "location": "SignUp.user_enter_password_into_Password_text_field(String)"
});
formatter.result({
  "duration": 337915212,
  "status": "passed"
});
formatter.match({
  "location": "SignUp.click_on_signUp_button()"
});
formatter.result({
  "duration": 185401216,
  "status": "passed"
});
formatter.after({
  "duration": 2851967863,
  "status": "passed"
});
});