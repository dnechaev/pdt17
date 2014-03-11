package com.example.fw;

import com.example.tests.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class ContactHelper extends HelperBase {

    public ContactHelper(ApplicationManager manager) {
        super(manager);
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void fillOutForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHomePhone());
        type(By.name("mobile"), contactData.getMobilePhone());
        type(By.name("work"), contactData.getWorkPhone());
        type(By.name("email"), contactData.getEmailFirst());
        type(By.name("email2"), contactData.getEmailSecond());
        selectByText(By.name("bday"), contactData.getDayOfBirth());
        selectByText(By.name("bmonth"), contactData.getMonthOfBirth());
        type(By.name("byear"), contactData.getYearOfBirth());
        //selectByText(By.name("new_group"), contactData.getSelectGroup());
        type(By.name("address2"), contactData.getAddressSecond());
        type(By.name("phone2"), contactData.getPhoneSecond());
    }

}