Feature: Adaction Smoke Testcases Automation
Scenario: To verify valid logindetails
Given User Launch the "Chrome" Browser
And user Navigate the Url "https://adactinhotelapp.com/"
Then User Verify login page
And User Enter UserName""
And User Enter Password""
And User Click the login Button
Then User Verify login Sucessfull