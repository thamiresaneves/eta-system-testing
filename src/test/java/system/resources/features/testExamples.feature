#language: en

@CreateUsers
Feature: As an admin user
  I want to be able to create users
  so I can associate them to other projects

  @CreateUserActivity @expressions
  Scenario Outline:
    Given the user is on signup page
    When "<name>", <age>, "<e-mail>", "<password>" are filled
    And clicks on button Cadastrar

    Then a "<message>" should be displayed

    Examples:
      | name  | age | e-mail          | password | message                     |
      | Maria | 30  | maria@gmail.com | 12345    | User created successfully   |
      | Joao  | 14  |                 | password | Not possible to create user |
      |       |     |                 |          | Not possible to create user |

  @TeacherFirstExample
  Scenario: Create user without sending age
    Given the user accessed the application
    When the user sets the name as "Maria"
    And the user sets the e-mail as "maria@school.com"
    And the user sets the password as 323123123
    And the user clicks on cadastrar button
    Then the user should be added successfully
