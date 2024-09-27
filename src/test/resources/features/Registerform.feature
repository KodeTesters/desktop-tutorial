Feature: HerokuApp Testcases
  @Registerform
  Scenario: DS Algo Portal
    Given open ds algo portal
    When user click  get started
    Then The user should be redirected to homepage

    Scenario: All field empty
    Given user Enters register page
    When The user clicks Register button with all fields empty
    Then display an error "Please fill out this field" below Username textbox
#Sending valid credential using feature file to stepdefinition

  Scenario: user enter username only
    Given user is in register page
    When The user clicks Register button after entering "kodetesters" with other fields empty
    Then display an error "Please fill out this field" below Password textbox

#sendng valid credentials using data table
  Scenario: user send username and password only
    Given user in registerform
    When user clicks Register button after entering Username and password with Password Confirmation field empty
      | kodetesters | numpyninja24 |
    Then  display an error "Please fill out this field" below Password Confirmation textbox

  Scenario: user enter username and two different password
    Given user is redirected to register page
    When user clicks Register after entering different passwords in Password and Password Confirmation
      | kodetesters | numpyninja24 | grerety |
    Then display an error message "password_mismatch

  Scenario: user cliks register button with password less than eight character
    Given user is in the register page
    When The user enters a Password with characters less than eight
    Then error message Password should contain atleast eight characters