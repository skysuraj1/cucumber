$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/LoginDataFromDB.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios other login functionality validation driving the data from mysql database",
  "description": "",
  "id": "techfios-other-login-functionality-validation-driving-the-data-from-mysql-database",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DbLogin"
    }
  ]
});
formatter.before({
  "duration": 3583310900,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User in on Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefination.user_in_on_Techfios_login_page()"
});
formatter.result({
  "duration": 87103300,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User should be able to login with valid credentials",
  "description": "",
  "id": "techfios-other-login-functionality-validation-driving-the-data-from-mysql-database;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@DbScenario"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters \"username\" from mysql database",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters \"password\" from mysql database",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "USer clicks on SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    }
  ],
  "location": "LoginStepDefination.user_enters_from_mysql_database(String)"
});
formatter.result({
  "duration": 3138460600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 13
    }
  ],
  "location": "LoginStepDefination.user_enters_from_mysql_database(String)"
});
formatter.result({
  "duration": 3093138500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_clicks_on_SignIn_button()"
});
formatter.result({
  "duration": 12234229700,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d95.0.4638.69)\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-GEPHIER\u0027, ip: \u0027192.168.1.92\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_301\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 95.0.4638.69, chrome: {chromedriverVersion: 95.0.4638.54 (d31a821ec901f..., userDataDir: C:\\Users\\skysuraj\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:55384}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 60c55e5ede3aaa690d81b7e5708585dd\n*** Element info: {Using\u003dxpath, value\u003d/html/body/div/div/div/form/div[3]/button}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat pages.LoginPage.clickSigninButton(LoginPage.java:44)\r\n\tat steps.LoginStepDefination.user_clicks_on_SignIn_button(LoginStepDefination.java:61)\r\n\tat ???.And USer clicks on SignIn button(features/LoginDataFromDB.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefination.user_should_land_on_dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
});