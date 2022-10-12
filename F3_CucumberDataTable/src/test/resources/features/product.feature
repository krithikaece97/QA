
Feature: verify the product purchase
@product
Scenario Outline: validating the list of product

Given check Browser as "Chrome"
When enter the url as "https://djangovinoth.pythonanywhere.com/labhome"
And click the login link
Then verify login page successfully opened
When enter the username as "Krithika"
Then  enter the password as "Keerthi@15"
And Click the login button
And click the Framework forms
And click the simple form
When add product list
# 0            1        2           3                 4       5
|productname|mobile|email      |productcategory|quantity|purchaser|   
|product a  |111111|1@gmail.com|Electrical     |5       |person a |
|product b  |222222|2@gmail.com|Electrical     |10      |person b |
|product c  |333333|3@gmail.com|Electrical     |15      |person c |
|product d  |444444|4@gmail.com|Electrical     |20      |person d |


