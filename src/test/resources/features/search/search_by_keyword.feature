Feature: Search by keyword

  @green
  Scenario Outline: Searching for 'green'
    Given Sergey is researching things on the internet
    When he looks up "green"
    Then he should see information about "green"

    Examples:
      | Page                |
      | DEMOASPAWESOMEPAGE  |

  @red
  Scenario: Searching for 'red'
    Given Sergey is researching things on the internet
    When he looks up "red"
    Then he should see information about "red"
