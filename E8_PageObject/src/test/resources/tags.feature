@Login
Feature: validate the login feature


@validLogin
Scenario: validate the login feature with valid credential

Given check Browser as "Chrome"
When enter the url as "https://djangovinoth.pythonanywhere.com/labhome"
And click the login link
Then verify login page successfully opened
When enter the username as "Krithika"
Then  enter the password as "Keerthi@15"
And Click the login button
And validate the homepage loaded successfully

