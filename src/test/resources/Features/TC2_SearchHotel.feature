@SearchHotel
Feature: Verifying Adactin Hotel Search Hotel Details

  Background: 
    Given User is on the adactin page

  Scenario Outline: Verify Adactin Search Hotel Valid Data
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Gopinath1894!"
    And User should enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | username     | password   | location | hotels         | roomType     | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Gopinath1894 | Gopiwin.94 | London   | Hotel Sunshine | Super Deluxe | 2 - Two       | 15/01/2023  | 16/01/2023   | 2 - Two       | 2 - Two         |

  Scenario Outline: Verify Adactin Search Hotel only manatory fields
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Gopinath1894!"
    And User should enter only manatory fields "<location>","<numberOfRooms>","<checkInDate>","<checkOutDate>" and "<adultsPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | username     | password   | location | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom |
      | Gopinath1894 | Gopiwin.94 | London   | 2 - Two       | 15/01/2023  | 16/01/2023   | 2 - Two       |

  Scenario Outline: Verify Adactin Search Hotel With Invalid Date Checking
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Gopinath1894!"
    And User should enter "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after search hotel with invalid CheckIn Date and CheckOut Date credential error message "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username     | password   | location | hotels         | roomType     | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Gopinath1894 | Gopiwin.94 | London   | Hotel Sunshine | Super Deluxe | 2 - Two       | 28/01/2024  | 27/01/2023   | 2 - Two       | 2 - Two         |

  Scenario Outline: Verify Adactin Search Hotel without Entry any fields
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Gopinath1894!"
    Then User should verify after search hotel without entry any fields error message "Please Select a Location"

    Examples: 
      | username     | password   |
      | Gopinath1894 | Gopiwin.94 |
