Feature: Login functionality

Scenario: Valid login
Given user navigate to url "http://localhost:100" on chrome
Then Login page should be appear
When user enters valid userid and password
And click on Login button
Then user should be landed on homepage
And Logout link should be appear
Then close the browser

