Feature:  Techfios billing login page functionality validation

Scenario: Usershould be able to login with valid credentials

Given User is on the techfios login page
When User enters username as "demo@techfios.com"
When User enter passward as "abc123"
When User click on sign in button
Then User land on dashboard page 
And User click on bank and cash 
And User click on newAccount
Then User should land on accounts page
And User enters accountTitle as "checking"
And User enters describtion as "new account"
And User enters initialbalance as "4,000,000"
And Users enters accountnumbers as "23005674987"
And User enters contactperson as "hillina"
And User enters phone as "469-786-9087"
And User enters internetBankingURL as "www.bank of America"
And User click on submit











