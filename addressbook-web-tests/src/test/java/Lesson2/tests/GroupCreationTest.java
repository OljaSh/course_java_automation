package Lesson2.tests;

import Lesson2.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper()
            .gotoGroupPage();
    app.getGroupHelper()
            .initGroupCreation("new");
    app.getGroupHelper()
            .fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper()
            .submitGroupCreation("submit");
    app.getGroupHelper()
            .returnToGroupPage();
    app.clickLogout("Logout");
  }

}
