Feature: Login into Vaccineledger application

  Scenario: Log in functionality
    Given User launches browser
    And User enters url "https://vaccineledger.com/"
    When User enters Email id "dev@statwig.com"
    Then User clicks on Sign In button
    And Click on VERIFICAR button
