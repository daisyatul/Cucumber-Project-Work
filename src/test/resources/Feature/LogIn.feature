Feature: Just Dial Application User stories Journeys


##############Login Related Test Cases #################
  Scenario: 1. User is able to Sign up in the application
    Given User navigates to the application url  https:justdial.com
    When User clicks on Sign up link at the top right corner of the application
    And User enters name as "Romali" and Phone number as "9123456789" and clicks on Submit Button as per given
    Then User is displayed with the message as "OTP is sent on number"

  #Negative Scenario, to check error messages thrown by application
  Scenario: 2. User receives an error message when tries to enter incorrect mobile number in the Login pop up
    Given User navigates to the application given url
    When User clicks on Login-in link at the top right corner of that application
    And User enters name as "Akash" and Phone number as "1234567890" and then clicks on Submit Button
    Then User gets error message as per "Please Enter valid Mobile number!"

  #Negative Scenario, to check error messages thrown by application
  Scenario: 3. User receives an error message when tries to enter incorrect name in the Login pop up
    Given User navigates to the application
    When User clicks on Login-in link at the top right corner of the application url
    And User do not enter any name and phone number but clicks on Submit Button
    Then User gets error message as given "Please enter a valid name !!"

  # Hint: Check the Max length of the Mobile field in the Then Step using Selenium get attribute method
  Scenario: 4. User is able to enter only 10 digits in the Mobile Text box
    Given User navigates to the application url then
    When User clicks on Login-in link at the top right corner of the application url
    Then User is able to enter only "10" digits in the Mobile text field

##############Search Related Test Cases #################
  @Sc5
  Scenario: 5. User is able to search the Application
    Given User navigates to the application browser
    When User enters as "restaurants" in search text box
    And User clicks search button
    Then User is able to see search result related to "restaurants"

    # Hint: Use Fluent Wait to wait in the Then Step to wait for drop down to appear

  @Sc6
  Scenario: 6. User is able to see the drop down when he keys in the text in the search box
    Given User navigates to the browser
    When User enters "resta" in search text box as given
    Then User is able to see the drop down under search text box with all the items with text "resta"

##############Menu Related Test Cases #################

##############Customer Care Related Test Cases #################
  # Hint: Use Fluent Wait to wait in the Then Step to wait for drop down to appear

  @Sc8
  Scenario: 8. User is able to see the drop down in customer care service tab
    Given User navigates to the application url as
    And User navigates to Customer care page by clicking on Customer Care tab at the right-mid of the page
    When User enter "online" in the Text box
    Then User is able to see the drop down and all the items in the list must have text as "online"