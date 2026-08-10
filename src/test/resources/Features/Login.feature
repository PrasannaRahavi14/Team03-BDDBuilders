#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Page - UI Verification


Background:


@validURL
Scenario:
Given Admin is on the browser
When Admin enters the Valid LMS app URL
Then Admin should land on the login page


@invalidURL
Scenario:
Given Admin is on the browser
When Admin enters the invalid LMS app URL
Then Admin should receive application error

@verifyBrokenLink
Scenario:
Given Admin is on the browser
When Admin enters the Valid LMS app URL
Then HTTP response >= 400. Then the link is broken


@displayTitle
Scenario:
Given Admin is on the browser
When Admin enters the Valid LMS app URL
Then Admin should see  LMS - Learning Management System

@displayLogo
Scenario:
Given Admin is on the browser
When Admin enters the Valid LMS app URL
Then Admin should see Application Logo

@diplayName
Scenario:
Given Admin is on the browser
When Admin enters the Valid LMS app URL
Then Admin should see company name below the app name

@displayLogin
Scenario:
Given Admin is on the browser
When Admin enters the Valid LMS app URL
Then Admin should see "Please login to LMS application"

@diplayInput
Scenario:
Given Admin is on the browser
When Admin enters the Valid LMS app URL
Then Admin should see two text field

@displayRole
Scenario:
Given Admin is on the browser
When Admin enters the Valid LMS app URL
Then Admin should see one dropdown

@presenceText1
Scenario:
Given Admin is on the browser
When Admin enters the Valid LMS app URL
Then Admin should see "User" in the first text field


@presenceText2
Scenario:
Given Admin is on the browser
When Admin enters the Valid LMS app URL
Then Admin should  see "Password" in the second text field


@displayAsterixforUser
Scenario:
Given Admin is on the browser
When Admin enters the Valid LMS app URL
Then Admin should see asterisk mark(*) symbol next to text for user field

@displayAsterixforPassword
Scenario:
Given Admin is on the browser
When Admin enters the Valid LMS app URL
Then Admin should see asterisk mark symbol next to password text

@seeSelectRole
Scenario:
Given Admin is on the browser
When Admin enters the Valid LMS app URL
Then Admin should see "select the role " placeholder in dropdown

@diplayOptions
Scenario:
Given Admin is on the browser
When Admin enters the Valid LMS app URL
Then Admin should see "Admin", "staff" ,"student" options in dropdown


@allignLogin
Scenario:
Given Admin is on the browser
When Admin enters the Valid LMS app URL
Then Admin should see login form on the centre of the page

@alignInputField
Scenario:
Given Admin is on the browser
When Admin enters the Valid LMS app URL
Then Username , Password labels and select the role should be left-aligned above their respective input fields


@diplayLogin
Scenario:
Given Admin is on the browser
When Admin enters the Valid LMS app URL
Then Admin should see login button

@seeUserText
Scenario:
Given Admin is on the browser
When Admin enters the Valid LMS app URL
Then Admin should see user text in gray color

@seePasswordText
Scenario:
Given Admin is on the browser
When Admin enters the Valid LMS app URL
Then Admin should see password text in gray color


####### Login Page - Functional Verification #########

###Feature: Login Page - Functional Verification###

@loginWithValidCredentials
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering  a valid credential
Then Admin should land on home page

@loginwithSpecialChar
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering special character in username
Then Admin should see Error message "Invalid username and password Please try again"


@loginwithEmptyUsername
Scenario:
Given Admin is on login Page
When Admin has entered only the password and selected a role
Then Admin should see Error message "Please enter your user name"



@loginwithEmptyPassword
Scenario:
Given Admin is on login Page
When Admin has entered only the username and selected a role
Then Admin should see Error message "Please enter your password "

@loginWithInvalidPassword
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering valid username , role and wrong password
Then Admin should see Error message "Invalid username and password Please try again"

@loginWithoutRole
Scenario:
Given Admin is on login Page
When Admin has entered a valid username and password without selecting a role
Then Admin should see Error Messge "Please select your role"

@loginWithInvalidRole
Scenario:
Given Admin is on login Page
When Admin clicks login in button after selecting a invalid role and entering valid username ,password
Then Admin should see Error Messge "Please select correct role"

@loginUsingKeyboard
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering  a valid credential through keyboard
Then Admin should land on home page

@loginUsingMouse
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering  a valid credential through mouse
Then Admin should land on home page