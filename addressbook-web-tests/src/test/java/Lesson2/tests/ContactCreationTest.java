package Lesson2.tests;

import Lesson2.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase{

    @Test
    public void testAddNewContact() throws Exception {
        app.getNavigationHelper().gotoAddNewContact();
        app.getContactHelper().fillContactForm(new ContactData("First Name", "Middle Name", "Last Name", "Nickname", "title", "company", "address", "home", "mobile", "work"));
        app.getContactHelper().submitContactCreation("submit");
    }

}
