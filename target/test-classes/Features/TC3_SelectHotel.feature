@SelectHotel
Feature: Verifying Adactin Hotel Select Hotel Details

  Background: 
    Given User is on the adactin page

  Scenario Outline: Verify Adactin Select Hotel With Valid Data
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Gopinath1894!"
    And User should enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    When User should verify after select by hotel name success message "Book A Hotel"

    Examples: 
      | username     | password   | location | hotels         | roomType     | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Gopinath1894 | Gopiwin.94 | London   | Hotel Sunshine | Super Deluxe | 2 - Two       | 15/01/2023  | 16/01/2023   | 2 - Two       | 2 - Two         |

  Scenario Outline: Verify Adactin Select Hotel Without Select Hotel
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Gopinath1894!"
    And User should enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    Then User should verify after without select hotel error message "Please Select a Hotel"

    Examples: 
      | username     | password   | location | hotels         | roomType     | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Gopinath1894 | Gopiwin.94 | London   | Hotel Sunshine | Super Deluxe | 2 - Two       | 15/01/2023  | 16/01/2023   | 2 - Two       | 2 - Two         |
