@Login
Feature: validate the login feature


@validLogin
Scenario: validate the login feature with valid credential

Given check Browser is opened 
When enter the url
And click the login button 
Then verify login page successfully opened
When enter the username 
Then  enter the password
And Click the login button
And validate the homepage loaded successfully






