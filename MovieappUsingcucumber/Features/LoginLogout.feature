Feature: Login and Logout Functionality
  As a user of movies app website
  I want to be able to login and logout
  So that I can check the functionality of the elements

  Scenario: Successful Login and Logout
    Given I am on the Movies app login Page
    When I enter username "rahul" and password "rahul@2021"
    And I click on the login button
    Then I should be redirected to the home page
    When I click on the account logo
    And I click on the logout button
    Then I should be redirected to the login page