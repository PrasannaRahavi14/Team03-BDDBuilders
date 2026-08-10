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
Feature: Home Page


Background:
Admin gives the valid LMS portal URL


@seeTitle
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering  a valid credential
Then Admin should see LMS -Learning management system as title

@alignedTitle
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering  a valid credential
Then LMS title should be on the top left corner of page

@correctSpellingNavigationBar
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering  a valid credential
Then Admin should see correct spelling in navigation bar text

@correctSpellingTitle
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering  a valid credential
Then Admin should see correct spelling and space in LMS title



@seeNavigationBarAligned
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering  a valid credential
Then Admin should see the navigation bar text on the top right side


@seeHome1st
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering  a valid credential
Then Admin should see home in the 1st place

@seeProgram2nd
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering  a valid credential
Then Admin should see program in the 2nd place

@seeBatch3rd
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering  a valid credential
Then Admin should see batch in the  3rd place

@seeLogout4th
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering  a valid credential
Then Admin should see logout in the 4th place

@displayWelcomeMessage
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering  a valid credential
Then Admin should see welcome message with user name and role

@displayBarChart
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering  a valid credential
Then Admin should see bar chart for Active and inactive user

@diplayUserCount
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering  a valid credential
Then Admin should see user count Note : count includes Active and inactive


@displayProgramCountCard
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering  a valid credential
Then Admin should see Program count Note : count includes Active and inactive


@displayStaffCountCard
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering  a valid credential
Then Admin should see Staff count

@displayBatchCountCard
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering  a valid credential
Then Admin should see Batch count Note : count includes Active and inactive

@displayStaffTable
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering  a valid credential
Then Admin should see the Staff Data table


@displayStaffTableHeader
Scenario:
Given Admin is on login Page
When Admin clicks login in button after entering  a valid credential
Then Admin should see the headers ("#")), First Name, Last Name, Phone in the Staff Data table