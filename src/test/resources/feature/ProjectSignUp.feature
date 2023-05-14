@tag
	Feature: Test sign up page "https://www.demoblaze.com/index.html"
	@tag1
	Scenario: Test error message sign up
		Given Access signup page
		When Input username: "<name>" and password: "<pass>"
		And User signup
		Then Confirm signup error message: "<mess>"
		And Close signup page
	Examples: 
      | name     | pass  | mess  |
      |tranhoaian|123456|This user already exist.|
      |tranhoaian|abcde|This user already exist.|
      |          |       | Please fill out Username and Password.  |
      | abcabc   |       | Please fill out Username and Password.  |
      |          | 123456| Please fill out Username and Password.  |
 @tag2
 Scenario: Test contact message 
 	Given Access contact page
 	When Open contact box
 	Then Fill in the contact fields  
 	And Close contact box
 @tag3
 Scenario: Test about us box
 		Given Open about us box
 		When Click play button
 		Then Click pause button
 		And Close about us box