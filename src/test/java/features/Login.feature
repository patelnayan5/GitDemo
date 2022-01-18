Feature: Application Login

Scenario: Home page default login
Given User is on landing page
When User login into application with "Nayan" and password "1234"
Then Home page is populated
And Cards are displayed "true"

Scenario: Home page default login
Given User is on landing page
When User login into application with "John" and password "5678"
Then Home page is populated
And Cards are displayed "false"