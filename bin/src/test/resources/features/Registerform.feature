Feature: Ds-AlgoPortal App

  @Registerform
Scenario: Ds-Algo Portal
  Given user opens the Ds-Algo Portal
  When user clicks  get started
  Then The user should be redirected to homepage
  When  user click  register
  Then it should get into register form
  When User clicks Register button with all fields empty
  Then display an error "Please fill out this field" below Username textbox

  Scenario: user enter username only
    Given user in registerpage
    When The user clicks Register button after entering "kodetesters" with other fields empty
    Then display an error "Please fill out this field" below Password textbox


#sendng  credentials using data table
  Scenario: user send username and password only
    Given user is in registerpage
    When user clicks Register button after entering Username and password with Password Confirmation field empty
      | Kodetesters | numpyninja24 |
    Then  display an error "Please fill out this field" below Password Confirmation textbox

  Scenario: user enter username and two different password
    Given user is redirected to register form
    When user clicks Register after entering different passwords in Password and Password Confirmation
      | kodetesters | numpyninja24 | numpy87 |
    Then display an error message "password_mismatch


