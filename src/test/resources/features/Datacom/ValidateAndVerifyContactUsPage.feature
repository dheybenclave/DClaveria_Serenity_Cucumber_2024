Feature: Validate and Verify Datacom Contact Us Page

  @datacom_contact_us @smoke_testing @UISmoke
  Scenario Outline: Validate and Verify Contact Us Tab Page
    Given Tester is navigating in <Page>
    Then I validate and verify header control element :
      | Tab           | Content                                                                                                                                                     |
      | Get in touch  | Do you have a question? Want to learn more about our products and solutions?                                                                                |
      | media pack    | Need access to Datacom’s media pack and brand assets? Get in touch with our communications team for the latest guidelines and assets for the Datacom brand. |
      | Our locations | Contact one of our global offices or one of our teams to find out more about how we can help you, or to answer any query you may have.                      |
    And I validate and verify the Asia location using the following :
      | Location    | Address                                                                                       | Phone           | Email                               |
      | Malaysia    | Level 3A, 1 Sentral, Jalan Rakyat, Kuala Lumpur Sentral, Kuala Lumpur 50470                   | +60 3 2109 1000 | info-kl@datacom.com.au              |
      | Philippines | Level 23F, IBM Plaza, 8 Eastwood Ave, Bagumbayan, Quezon City, 1110 Metro Manila, Philippines | +63 2 717 6300  | caracamille.cruz@datacom.com.au     |
      | Singapore   | 38 Beach Road, South Beach Tower, #29-11 Singapore 189767                                     | +60 3 2109 1000 | felicisimo.gadaingan@datacom.com.au |
    Then I validate the Contact Us Form using the following :
      | First Name | Last Name | Email         | Phone    | Job Title     | Company         | Country     | Category 1 | Category 2 | Message      |
      | Test       | Test      | test@test.com | 555-1234 | Test Engineer | Testing Company | Philippines | Careers    | Other      | Test Message |
    Examples:
      | Page             |
      | DATACOMCONTACTUS |

#  @datacom_contact_us @smoke_testing
#  Scenario Outline: Validate and Verify Get In Touch Tab Page
#    Given Tester is navigating in <Page>
#    And I validate and verify header control element :
#      | Tab          | Content                                                                                                                                                     |
#      | Get in touch | Do you have a question? Want to learn more about our products and solutions? We're here to help.                                                            |
#      | media pack   | Need access to Datacom’s media pack and brand assets? Get in touch with our communications team for the latest guidelines and assets for the Datacom brand. |
#
#    Examples:
#      | Page             |
#      | DATACOMCONTACTUS |
#
#  @datacom_contact_us @smoke_testing
#  Scenario Outline: Validate and Verify Our Media Pack Tab Page
#    Given Tester is navigating in <Page>
#    And I validate and verify header control element :
#      | Tab        | Content                                                                                                                                                     |
#      | media pack | Need access to Datacom’s media pack and brand assets? Get in touch with our communications team for the latest guidelines and assets for the Datacom brand. |
#
#    Examples:
#      | Page             |
#      | DATACOMCONTACTUS |
