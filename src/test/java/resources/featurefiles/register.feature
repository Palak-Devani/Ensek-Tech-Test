# Feature file consists of functional test cases in the form of cucumber feature files written in gherkin format (BDD)

Feature: Register functionality

  As a user I would like to register with Ensek

  Scenario: Verify user is able to register with Ensek
    Given I am on the homepage
    When I click on register link
    And I verify the text 'Create a new account.' on register page
    And I send text to email field
    And I enter text into password field
    And I enter text into confirm password field
    And I click on register button
    Then I should register successfully
    And I am getting an 'Error' and unable to register
    #The error is a defect which needs to be raised
