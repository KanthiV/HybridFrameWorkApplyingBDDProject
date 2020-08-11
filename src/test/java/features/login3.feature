@sprint
Feature: As a user I want a login page so that only authentic 
     users will be able to login
         
     Scenario: Valid user should be able to login 
     Given I am on Techfios website  
     When  I enter username and password
     And   I click on SignIn button
     Then  DashBoard Page should display
