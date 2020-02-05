Feature: Login_Action


Scenario Outline: Successful login with valid credentials
Given User is on Home Page
When User navigates to Login Page
And  User enters "<username>" and "<password>"
Then Message displayed login successfully

Examples:
| username | password    |
| admin    | password456 |

#Scenario Outline: User adds Category and SubCategory
#Given  User clicks Category
#And User select "<category>" and "<subcategory>"
#Then Message displayed product added
#
#Examples:
#| category | subcategory |
#| Sports   | Basketball  |
#| Sports   | Volleyball  |