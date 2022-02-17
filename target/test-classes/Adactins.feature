Feature: Login Action

Scenario Outline: Successful Login with Valid Credentials
	Given User is on adactin login Page
	When User enters "<username>" and "<password>"
  When User click "<location>","<hotels>","<room_type>","<room_nos>"
    When User enter "<first_name>","<last_name>","<address>","<cc_num>","<cc_type>","<cc_exp_month>","<cc_exp_year>","<cc_cvv>"
  
	Then Message displayed
Examples:
    | username   | password | location | hotels | room_type | room_nos | first_name | last_name | address | cc_num | cc_type | cc_exp_month | cc_exp_year | cc_cvv |
    | Nathishsriramm | cTykT4QPSJc6wA@ | Sydney | Hotel Creek | Standard | 2 - Two | nathish | sriram | chennai | 1234567891234567 | VISA | January | 2022 | 123 |
    | Nathishsriramm | cTykT4QPSJc6wA@ | Sydney | Hotel Creek | Standard | 2 - Two | nathish | sriram | chennai | 1234567891234567 | VISA | January | 2022 | 123 |
    | Nathishsriramm | cTykT4QPSJc6wA@ | Sydney | Hotel Creek | Standard | 2 - Two | nathish | sriram | chennai | 1234567891234567 | VISA | January | 2022 | 123 |
    | Nathishsriramm | cTykT4QPSJc6wA@ | Sydney | Hotel Creek | Standard | 2 - Two | nathish | sriram | chennai | 1234567891234567 | VISA | January | 2022 | 123 |
     