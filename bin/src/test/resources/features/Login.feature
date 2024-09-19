
@Login
Feature: Ds Login Portal Login Functionality
To access the DsAlgo Portal, the user must sign in with their credentials.
Users can access all the features of the DsAlgo Portal

Background: Navigation to Login page after Registration
    Given The user is on the Registration page
    When The user registers with valid credentials
    And The user clicks the sign in button
    Then The user should be redirected to the Login Page
    


Scenario Outline:  User signs in successfully
    Given The user is on the DsAlgo Login Page
    When The user enters valid "<username>" and "<password>"
    And The user clicks on login button
    Then The user should be redirected to the DsAlgo Home Page

    Examples:
      | username    | password     |
      | kodetester  | numpyninja24 |
      | numpy       | kodetester   |
      | numpy       | numpyninja24 |
      | kodetester  | kodetester   |

      