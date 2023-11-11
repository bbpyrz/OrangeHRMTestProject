@LoginProcess
Feature: OrangeHRM's Login Process

  @EmptyFields
  Scenario Outline: Empty UserName Field and Empty Password Field On Login Process
    Given User At Login Page
    When Click Login Button
    Then Check "<error>" messages For Empty Fields
    Examples:
    |error   |
    |Required|

  @EmptyUserName
  Scenario Outline: Empty UserName Field On Login Process
    Given User At Login Page
    When Enter Password to "<password>"
    When Click Login Button
    Then Check "<error>" messages For Empty UserName Field
    Examples:
    |error   ||password|
    |Required||admin123|

  @EmptyPassword
  Scenario Outline: Empty Password Field On Login Process
    Given User At Login Page
    When Enter UserName to "<userName>"
    When Click Login Button
    Then Check "<error>" messages For Empty Password Field
    Examples:
    |error   ||userName|
    |Required||Admin   |

  @FalseLogin
  Scenario Outline: Write Correct UserName and False Password To Fields On Login Process
    Given User At Login Page
    When Enter UserName to "<userName>"
    When Enter Password to "<password>"
    When Click Login Button
    Then Check "<error>" messages
    Examples:
    |error              ||userName||password    |
    |Invalid credentials||Admin   ||testPassword|

  @CorrectLogin
  Scenario Outline: Write Correct UserName and CorrectPassword To Fields On Login Process
    Given User At Login Page
    When Enter UserName to "<userName>"
    When Enter Password to "<password>"
    When Click Login Button
    Then Check Correct Login Process
    Examples:
    |userName||password|
    |Admin   ||admin123|

