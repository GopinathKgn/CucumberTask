@CancelBooking
Feature: Verifying Adactin Hotel Cancel Booking Details

  Background: 
    Given User is on the adactin page

  Scenario Outline: Verify Adactin Hotel Cancel Booking
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
    When User should perform cancel booking by passing the generated order id in Booked Itinerary page
    And User should verify after cancel booking success message "The booking has been cancelled."

    Examples: 
      | username     | password   | location | hotels         | roomType     | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstName | lastName | billingAddress                           |
      | Gopinath1894 | Gopiwin.94 | London   | Hotel Sunshine | Super Deluxe | 2 - Two       | 15/01/2023  | 16/01/2023   | 2 - Two       | 2 - Two         | Gopinath  | K        | 889,4th Avenue Street,Velechery,Chennai. |

  Scenario Outline: Verify Adactin Hotel Existing OrderNo Cancel Booking
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Gopinath1894!"
    When User should perform cancel booking by passing the existing "<OrderId>" in Booked Itinerary page
    And User should verify after cancel booking success message "The booking has been cancelled."

    Examples: 
      | username     | password   | OrderId    |
      | Gopinath1894 | Gopiwin.94 | 6V5Q6C2189 |
