@Login
Feature: validate the login feature


@validLogin
Scenario Outline: validate the login feature with valid credential

Given check Browser as "<BROWSER>"
When enter the url as "<URL>"
And click the login button 
Then verify login page successfully opened
When enter the username as "<USERNAME>"
Then  enter the password as "<PASSWORD>"
And Click the login button
And validate the homepage loaded successfully

Examples: 
      | BROWSER |URL                 | USERNAME|PASSWORD|
      | chrome  |   www.django.com   | keerthi |12345   |
      | firefox |   www.django.com   | keerthi1|12345   |
