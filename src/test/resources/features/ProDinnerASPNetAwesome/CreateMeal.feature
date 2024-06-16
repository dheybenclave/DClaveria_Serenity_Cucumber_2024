Feature: Create Meal from Page

  @UISmoke @CRUD
  Scenario Outline: Create Meal from Pro Dinner Page
    Given ProDinnerAdmin is login in <Page>
    Examples:
      | Page                   |
      | PRODINNERASPNETAWESOME |
