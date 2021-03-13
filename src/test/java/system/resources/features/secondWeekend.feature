#language: en

Feature: Create user

  Scenario Outline:
    Given create user form is empty
    When "<name>", <age>, "<e-mail>", "<password>"  is filled
    And clicks on Cadastrar

    Then a success "<message>" should be displayed

    Examples:
      | name  | age | e-mail          | password | message                     |
      | Maria | 30  | maria@gmail.com | 12345    | User created successfully   |
      | Joao  | 14  |                 | password | Not possible to create user |
      |       |     |                 |          | Not possible to create user |
