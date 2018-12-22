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
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "makemy-trip-login-functionality;login-to-makemy-trip-with-valid-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "makemy-trip-login-functionality;login-to-makemy-trip-with-valid-functionality;;1"
    },
    {
      "cells": [
        "bsiva.kumar070@gmail.com",
        "siva@123B"
      ],
      "line": 14,
      "id": "makemy-trip-login-functionality;login-to-makemy-trip-with-valid-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5297370297,
  "status": "passed"
});
formatter.before({
  "duration": 178087,
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
  "duration": 149213911553,
  "status": "passed"
});
formatter.match({
  "location": "Login.verify_home_page_title()"
});
formatter.result({
  "duration": 7777388,
  "status": "passed"
});
formatter.match({
  "location": "Login.click_on_login_button()"
});
formatter.result({
  "duration": 247874204,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
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
  "duration": 20278767176,
  "status": "passed"
});
formatter.after({
  "duration": 2724135085,
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
  "duration": 4354327488,
  "status": "passed"
});
formatter.before({
  "duration": 125218,
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
  "duration": 118159744390,
  "status": "passed"
});
formatter.match({
  "location": "SignUp.click_on_signup_link()"
});
formatter.result({
  "duration": 6573582111,
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
  "duration": 993024931,
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
  "duration": 281644391,
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
  "duration": 158973607,
  "status": "passed"
});
formatter.match({
  "location": "SignUp.click_on_signUp_button()"
});
formatter.result({
  "duration": 134988459,
  "status": "passed"
});
formatter.after({
  "duration": 2702395500,
  "status": "passed"
});
});