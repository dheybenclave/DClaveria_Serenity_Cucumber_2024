Feature: Create Meal from Page

  @UISmoke @CRUD
  Scenario Outline: Create Meal from Pro Dinner Page
    Given ProDinnerAdmin is login in <Page>
    Then validate and verify a meal created using the following :
      | Name            | Comments           |
      | TestSerenity    | DheoClaveria       |
      | TestingCucumber | Testing_Automation |

    Examples:
      | Page                   |
      | PRODINNERASPNETAWESOME |
