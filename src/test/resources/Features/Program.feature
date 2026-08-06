Feature: Program Navigation validation 

Background:
Given Admin is on home page after Login
When Admin clicks Program on the navigation bar

@ProgramPageNavigation
Scenario:
Then Admin should be navigated to Program page

@SubMenuDisplay
Scenario:
Then Admin should see sub menu in menu bar as "Add New Program"

@ManageProgramHeading
Scenario:
Then Admin should see the heading "Manage Program"

@ManageProgramAlignment
Scenario:
Then Admin should see manage program heading aligned on the left side

@DeleteButtonState
Scenario:
Then Admin should see a Delete button in left top is disabled

@SearchBoxDisplay
Scenario:
Then Admin should see Search bar

@SearchPlaceholder
Scenario:
Then Admin should see search... placeholder text

@ColumnHeaderName
Scenario:
Then Admin should see data table with column header

@CheckboxHeaderState
Scenario:
Then Admin should see checkbox default state as unchecked beside Program Name column header

@CheckboxEachRow
Scenario:
Then Admin should see check box default state as unchecked on the left side in all rows against program name 

@SortIconPrescence
Scenario:
Then Admin should see the sort arrow icon beside to each column header except Edit and Delete

@Edit/DeleteIcon
Scenario:
Then Admin should see the Edit and Delete buttons on each row of the data table

@PaginationControl
Scenario:
Then Admin should see the text as "Showing x to y of z entries" along with Pagination controls below the table.

@FooterMessage
Scenario:
Then Admin should see the footer as "In total there are z programs"
 
