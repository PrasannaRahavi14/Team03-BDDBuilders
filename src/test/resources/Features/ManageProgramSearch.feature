@ManageProgramSearch
Feature: Manage Program Search Functionality

Background: Admin navigates to program page after logged in
Given Admin is on the ProgramPage

@SearchByProgramName
Scenario:
When Admin enters the "programname" in search box
Then Admin should  see Program name, description, and status for searched program name

@SearchByProgramDescription
Scenario:
When Admin enters the "programdescription" in searchbox
Then Admin should  see Program name, description, and status for searched program description