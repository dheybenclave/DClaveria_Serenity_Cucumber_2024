Feature: Grid Filtering Testing

  @Grid @UISmoke @Grid_Scenario_1
  Scenario Outline: Validate and Verify the Filter grid using parent controls
    Given Tester is navigating in <Page>
    When I verify the element navigation search box in the page
    And I go to Grid > Filtering > Misc modules
    Then I verify the grid filter using parent control element
    And I filter the grid using the following :
      | field   | value       |
      | person  | Tracy       |
      | food    | Cheesecake  |
      | country | Greville    |
      | country | any country |
#  Get Multple result in grid
    Then I validate the grid result using the following :
      | Id   | Person | Food       | Country       | Date       | Location | Chef             |
      | 967  | Tracy  | Cheesecake | Hatton Garden | 11/19/2009 | Tavern   | Bruce Nolan      |
      | 1925 | Tracy  | Cheesecake | Regent        | 1/11/2013  | Visit    | Fromage Sandwich |
#  Get Specific result in grid
    And I filter the grid using the following :
      | field | value  |
      | food  | Banana |
    Then I validate the grid result using the following :
      | Id   | Person | Food   | Country      | Date      | Location | Chef         |
      | 1435 | Tracy  | Banana | La Croisette | 8/15/2015 | Tavern   | Hercules Oat |
    Examples:
      | Page               |
      | DEMOASPAWESOMEPAGE |





