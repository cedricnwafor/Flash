Feature: Application Login


Scenario: Home Page default login
Given User is on netbanking landing page
When User login into application with "JAMES" and "4321"
Then Homepage is populated
And Cards displayed are "true"


Scenario: Home Page default login
Given User is on netbanking landing page
When User login into application with "JOHN" and "1234"
Then Homepage is populated
And Cards displayed are "false"