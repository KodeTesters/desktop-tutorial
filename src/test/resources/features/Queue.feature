@Queue
Feature: Module Queue Testing

  Scenario: User is able to Login
    Given The user is on the DsAlgo Signin Page
    When The user enter valid "Kodetesters" and "numpyninja24"
    And The user click on login button
    Then The user should be redirected to Ds Algo Home Page

  Scenario: Queue Module
    Given The user is on the DsAlgo Home Page
    When The User clicks Get Started button in Queue module
    Then The User should be directed to Queue  Page



  Scenario: Implementation of Queue in Python Page
    Given The user is on  Queue Page
    When The User clicks on Implementation of Queue in Python Page
    Then The User should be directed to Implementation of Queue in Python Page


  Scenario: The user run the code in tryEditor with valid input for Implementation of Queue in Python page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The User is able to see the output in console

  Scenario: Implementation using collections.dequeue page
    Given The user is on  Queue Page
    When The User clicks on Implementation using collections.dequeue Page
    Then The User should be directed to Implementation using collections.dequeue Page



  Scenario: The user run the code in tryEditor with invalid input for Implementation using collections.dequeue page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run

  Scenario: Implementation using Array page
    Given The user is on  Queue Page
    When The User clicks on Implementation using Array Page
    Then The User should be directed to Implementation using Array Page

  Scenario: The user run the code in tryEditor with invalid input for Implementation using Array page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And The User clicks on Run button
    Then The user should be presented with the Run

  Scenario: Queue Operations page
    Given The user is on  Queue Page
    When The User clicks on Queue Operations Page
    Then The User should be directed to Queue Operations Page

  Scenario: The user run the code in tryEditor with invalid input for Queue page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And The User clicks on Run button
    Then The user should be presented with the Run