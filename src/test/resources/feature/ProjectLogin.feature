  @tag
  Feature: Test login page "https://www.demoblaze.com/index.html"
  @tag1
  Scenario: Login page
    Given Access login page
    When Input user name: "<user>" and  password: "<pass>"
    And User login
    Then Login success
    
    Examples:
	|user						|pass	|
	|tranhoaian|123456|	 
   

  @tag2
  Scenario: Error message login page
  	Given Access login page
    When Input user name: "<user>" and  password: "<pass>"
    And User login
    Then Confirm error message: "<message>"
    And Close page
    
    Examples: 
      | user  | pass | message  |
      |  |     |Please fill out Username and Password. |
      |  |     123456 | Please fill out Username and Password.    |
      | tranhoaian |     |Please fill out Username and Password. |
      | tranhoaian  | 1234543 | Wrong password.  |
      