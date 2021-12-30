# Autor: Camilo Quevedo

@stories
Feature: New user registration in Utest
  As a new user, I want to register on the utest page.

  @scenario1
  Scenario: Camilo's registration on the Utest page
    Given that Camilo wants to register on the Utest page
    When Enter all the required data and necessary permissions
          | strName | strLastName | strEmail              | strBirthMonth | strBirthDay | strBirthYear | strCity       | strPostalCode | strCountry | strComputer | strVersion      | strLanguage | strMobile | strModel | strSystem  | strPassword |
          | Camilo  | Quevedo     | camoeeee@hotmail.com   | May           | 26          | 1996         | Villavicencio | 500001        | Colombia   | Windows     | Windows 10 Home |  Spanish    | Xiaomi    | Mi A3    | Android 10 | Camilo12345 |
    Then he completes the registration successfully on the page
      | strFinalText                                                            |
      | Welcome to the world's largest community of freelance software testers! |