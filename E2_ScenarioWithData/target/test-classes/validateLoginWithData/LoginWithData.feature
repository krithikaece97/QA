@Login
Feature: validate the login feature


@validLogin
Scenario: validate the login feature with valid credential

Given check Browser as "Chrome"
When enter the url as "http://djangovinoth.com"
And click the login button 
Then verify login page successfully opened
When enter the username as "krithika"
Then  enter the password as "122345"
And Click the login button
And validate the homepage loaded successfully

Scenario: validate the login feature with valid credential


Scenario: validate the login feature with valid credential

