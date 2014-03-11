package com.example.tests;


import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{

    @Test
        public void testNonEmptyGroupCreation() throws Exception {
            app.getNavigationHelper().openMainPage();
            app.getNavigationHelper().gotoGroupsPage();
            app.getGroupHelper().initGroupCreation();
            GroupData group = new GroupData();
            group.setName("group 1");
            group.setHeader("header 1");
            group.setFooter("footer 1");
            app.getGroupHelper().fillGroupForm(group);
            app.getGroupHelper().submitGroupCreation();
            app.getGroupHelper().returnToGroupsPage();

        }

        @Test
        public void testEmptyGroupCreation() throws Exception {
            app.getNavigationHelper().openMainPage();
            app.getNavigationHelper().gotoGroupsPage();
            app.getGroupHelper().initGroupCreation();
            app.getGroupHelper().fillGroupForm(new GroupData("", "", ""));
            app.getGroupHelper().submitGroupCreation();
            app.getGroupHelper().returnToGroupsPage();

    }

}
