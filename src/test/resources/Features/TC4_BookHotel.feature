@BookHotel
Feature: Verifying Adactin Hotel Book Hotel Details

  Background: 
    Given User is on the adactin page

  Scenario Outline: Verify Adactin Book Hotel Valid Data
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Gopinath1894!"
    And User should enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    When User should verify after select by hotel name success message "Book A Hotel"
    And User should enter book hotel page details "<firstName>","<lastName>" and "<billingAddress>"
    And User should perform payment
      | creditCardNo     | creditCardType   | expiryMonth | expiryYear | cvvNumber |
      | 3414098747774874 | American Express | December    |       2022 |       744 |
      | 4328887778949734 | VISA             | May         |       2022 |       874 |
      | 5426378536835745 | Master Card      | July        |       2022 |       545 |
    Then User should verify after book hotel success message "Booking Confirmation" and save the order id

    Examples: 
      | username     | password   | location | hotels         | roomType     | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstName | lastName | billingAddress                           |
      | Gopinath1894 | Gopiwin.94 | London   | Hotel Sunshine | Super Deluxe | 2 - Two       | 15/01/2023  | 16/01/2023   | 2 - Two       | 2 - Two         | Gopinath  | K        | 889,4th Avenue Street,Velechery,Chennai. |

  Scenario Outline: Verify Adactin Book Hotel Without Enter Any Fields
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Gopinath1894!"
    And User should enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    When User should verify after select by hotel name success message "Book A Hotel"
    Then User should verify after without enter any fields error message "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month", and "Please Enter your Credit Card CVV Number"

    Examples: 
      | username     | password   | location | hotels         | roomType     | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Gopinath1894 | Gopiwin.94 | London   | Hotel Sunshine | Super Deluxe | 2 - Two       | 15/01/2023  | 16/01/2023   | 2 - Two       | 2 - Two         |
