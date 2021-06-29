Feature: Login into Application

Scenario: login into application with positve scenario
Given Initialize the browser with "chrome"
And navigate to "https://www.v2kart.com/" site
And Click on login link
And Click on Login using email link
When enters <Emailid> and <password>
And Click on login Button
Then verify the "Account" is visible

Examples:
|Emailid|							|password|
|dharapatel80085@gmail.com|			|dharapatel80085@|