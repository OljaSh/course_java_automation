package Lesson2.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{

    @Test
    public void testContactDeletion(){
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().selectFirstContact();
        app.getContactHelper().submitContactDeletion();
        app.getNavigationHelper().gotoHomePage();
    }

}
