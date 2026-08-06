Feature: Program Page validation 

Background:
Given Admin is on home page after Login

@ProgramPageNavigation
Scenario:
When Admin clicks "Program" on the navigation bar
Then Admin should be navigated to Program page

@SubMenuDisplay
Scenario:
When Admin clicks "Program" on the navigation bar
Then Admin should see sub menu in menu bar as "Add New Program"