Feature: Login to Application

Scenario Outline: Validation of login
Given Initialize browser
And Navigate to "https://www.rahulshettyacademy.com/#/index" site
And click on to Login
When user enter <username> and <password>
Then close browser


Examples:
|username		|password	|
|test@xyz.com	|1234		|
|abc@xyz.com	|2345		|