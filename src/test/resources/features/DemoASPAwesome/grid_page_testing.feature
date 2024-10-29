Feature: Grid Filtering Testing

  @Grid @UISmoke @Grid_Scenario_1
  Scenario Outline: Validate and Verify the Filter grid using parent controls
    Given Tester is navigating in <Page>
#    When I verify the element navigation search box in the page
    And I go to Grid > Filtering > Misc modules
    Then I verify the grid filter using parent control element
    And I filter the grid using the following :
      | field   | value       |
      | person  | Tracy       |
      | food    | Pizza       |
      | country | Greville    |
      | country | any country |
#  Get Multple result in grid
    Then I validate the grid result using the following :
      | Id   | Person | Food  | Country           | Date      | Location | Chef        |
      | 2599 | Tracy  | Pizza | Carpana           | 10/3/2014 | Home     | Josh Baskin |
      | 839  | Tracy  | Pizza | Loch Modan Forest | 6/17/2011 | Tavern   | Josh Baskin |
#      | 1459 | Tracy  | Pizza | Farringdon         | 11/13/2010 | Visit      | Tom Smykowski |
#  Get Specific result in grid
    And I filter the grid using the following :
      | field | value  |
      | food  | Banana |
    Then I validate the grid result using the following :
      | Id   | Person | Food   | Country      | Date      | Location | Chef        |
      | 1173 | Tracy  | Banana | Stone Cutter | 9/25/2019 | Home     | Josh Baskin |
    Examples:
      | Page           |
      | DEMOASPAWESOME |





