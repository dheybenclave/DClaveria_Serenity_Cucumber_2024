Feature: Form Page Testing Controls

  @form_testing
  Scenario Outline: Validating form controls from Pages1
    Given Tester is navigating in <Page>
    Given Tester is navigating in <Page>
#    When he looks up "green"
#    Then he should see information about "green"

    Examples:
      | Page               |
      | DEMOASPAWESOMEPAGE |

  @form_testing
  Scenario Outline: Validating form controls from Pages1
    Given Tester is navigating in <Page>
    Given Tester is navigating in <Page>
#    When he looks up "green"
#    Then he should see information about "green"

    Examples:
      | Page         |
      | WIKIHOMEPAGE |
      | WIKIHOMEPAGE |
