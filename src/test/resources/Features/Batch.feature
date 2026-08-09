@11
Feature: Batch Page Functionality

Background:
Given Admin is on Homepage after successful login
When Admin clicks on Batch tab on the navigation bar

Scenario: Batch Page Navigation
Then admin should be navigated to manage batch page

Scenario: Submenu dispalyed
Then Admin should see sub menu in menu bar as "Add New Batch" under Batch module

Scenario: Batch Page Heading is Displayed
Then Admin should see the "Manage Batch" Heading

Scenario Outline: Icons are displayed on the manage batch page
Then "<Icons>" should be displayed
Examples:
| Icons |
| Delete Icon |
| Pagination Controls |

#Scenario Outline: Icons are displayed on the manage batch page in each row
#Then "<Rowicons>" should be displayed in each rom
Examples:
#| Rowicons |
#| Edit |
#| Delete |
#| Checkbox |

Scenario: Edit icon is displayed
Then "Edit icon" should be displayed in each rom


Scenario Outline: DataTable Headers are displayed on the manage batch page
Then Datatable "<headers>" should be displayed
Examples:
| headers |
|Batch Name  |
| Batch Description |
| Batch Status |
| No Of Classes |
|Program Name  |
| Edit / Delete |

Scenario: Checkbox is displayed in datatable header row
Then Checkbox should be displayed in header row

Scenario: Sort icon is present 
Then Admin should see the sort icon next to all Datatable headers

Scenario: Dialogue box is displayed
When Admin clicks on Add New batch under the Batch tab
Then Admin should see the Batch Details dialog box

Scenario Outline: field is displayed
When Admin clicks on Add New batch under the Batch tab
Then Admin should see "<field>" on the dialogue box
Examples:
| field |
| Program Name  |
| Batch Name |
| Number of Classes  |
| Status :  |
#| Description |

Scenario: Program name with dropdown is displayed
When Admin clicks on Add New batch under the Batch tab
Then Admin should see the program status field with dropdown

Scenario: radio button is displayed
When Admin clicks on Add New batch under the Batch tab
Then Admin should see the status radio button

Scenario: Program name appears as batch prefix
Given Admin is on Batch Details dialog box
When Admin selects program name present in the dropdown
Then Admin should see selected program name in the batch name prefix box
#try excel reader
#Scenario: Batch name suffix accepts only numbers
#Given Admin is on Batch Details dialog box
#When Admin enters "alphabets" in batch name suffix box
#Then Admin should get error message below the text box of respective field

#Scenario: Batch name Prefix cannot be edited
#Given Admin is on Batch Details dialog box
#When Admin enters alphabets in batch name prefix box
#Then Admin should see empty text box

#Scenario: Add new batch only with mandatory fields
#Given Admin is on Batch Details dialog box
#When Admin enters the data only to the mandatory fields "Python" "1" "Python Coding" "6" and clicks save button
#Then Admin should get a successful message "Batch Created Successfully" 

#Scenario:
#Given Admin is on Batch Details dialog box
#When Add new batch with leaving space in mandatory field "Python" " " "Python Coding" "6" and clicks save button
#Then Admin should get a error message on the respective mandatory field "Batch Name is required."

Scenario:Cancel Button functionality
Given Admin is on Batch Details dialog box
When Admin enters the data only to the mandatory fields "Python" "1" "Python Coding" "6" and clicks cancel button
Then Admin should see the batch details popup closes without creating any batch

Scenario: Close icon functionality
Given Admin is on Batch Details dialog box
When Admin clicks on the close icon
Then batch details pop up closes