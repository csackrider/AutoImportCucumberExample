Feature: Doing Math
  As a user of a calculator app
  I want to be able to do math functions
  So that I can get answers

  @add @subtract
  Scenario Outline: Adding and subtracting numbers
    Given I have two numbers "<firstNum>" and "<secondNum>"
    When I "<calcMethod>" them
    Then the total will be "<total>"
    Examples:
      | firstNum | calcMethod | secondNum | total |
      | 1        | add        | 2         | 3     |
      | 10       | subtract   | 2         | 8     |