@Login
Feature: validate the login feature


@validLogin @admin
Scenario: validate the login feature with valid credential

Given check Browser as "Chrome"
When enter the url as "https://djangovinoth.pythonanywhere.com/labhome"
And click the login button
Then verify login page successfully opened
When enter the username as "keerthi"
Then  enter the password as "122345"
And Click the login button
And validate the homepage loaded successfully

@validLogin
Scenario: validate the login feature with invalid credential

Given check Browser as "Chrome"
When enter the url as "http://djangovinoth.com"
And click the login button 
Then verify login page successfully opened
When enter the username as "keerthi1"
Then  enter the password as "1223456"
And Click the login button
And validate the homepage loaded successfully


@invalidusername
Scenario: validate the login feature with invalid credential

Given check Browser as "Chrome"
When enter the url as "http://djangovinoth.com"
And click the login button 
Then verify login page successfully opened
When enter the username as "keerthi1"
Then  enter the password as "1223456"
And Click the login button
And validate the homepage loaded successfully

@invalidpassword
Scenario: validate the login feature with invalid credential

Given check Browser as "Chrome"
When enter the url as "http://djangovinoth.com"
And click the login button 
Then verify login page successfully opened
When enter the username as "keerthi1"
Then  enter the password as "1223456"
And Click the login button
And validate the homepage loaded successfully


@invaliduserandpassword
Scenario: validate the login feature with invalid credential

Given check Browser as "Chrome"
When enter the url as "http://djangovinoth.com"
And click the login button 
Then verify login page successfully opened
When enter the username as "keerthi1"
Then  enter the password as "1223456"
And Click the login button
And validate the homepage loaded successfully