package Lesson2.appmanager;

import Lesson2.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends BaseHelper{



    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }


    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirst_name());
        type(By.name("middlename"), contactData.getMiddle_name());
        type(By.name("lastname"), contactData.getLast_name());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHome());
        type(By.name("mobile"), contactData.getMobile());
        type(By.name("work"), contactData.getWork());

    }

    public void submitContactCreation(String submit) {
        click(By.name(submit));
    }


}
