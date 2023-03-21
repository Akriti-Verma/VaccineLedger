Feature: SignUp functionality

  Scenario: SignUp functionality
    Given User lauches browser
    Then User enters url "https://vaccineledger.com/"
    When Click on SignUp Link
    And Enter Username and Lastname "Akriti", "Verma"
    Then User Enter Email Id "akritiverma579@gmail.com"
    And User Enter Mobile Number "9007541901"
    When Select Tipo de Organization "CENTRAL_AUTHORITY"
    And Select Nombre de la Organization "StaTwig"
    Then User clicks on Continuar
