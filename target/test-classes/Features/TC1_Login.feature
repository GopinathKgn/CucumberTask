@Login
Feature: Verify Adactin Hotel login details

  Background: 
    Given User is on the adactin page

  Scenario Outline: Verifying Adactin Hotel Login Valid
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Gopinath1894!"

    Examples: :
      | username     | password   |
      | Gopinath1894 | Gopiwin.94 |

  Scenario Outline: Verifying Adactin Hotel Login Using Enter
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Gopinath1894!"

    Examples: 
      | username     | password   |
      | Gopinath1894 | Gopiwin.94 |

  Scenario Outline: Verifying Adactin Hotel Login Invalid Credentials
    When User should perform login "<username>","<password>"
    Then User should verify after login with invalid credential error message "Invalid Login details or Your Password might have expired."

    Examples: 
      | username | password |
      | Gopinath | Gopi94   |
