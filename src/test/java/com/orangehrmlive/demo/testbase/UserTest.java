package com.orangehrmlive.demo.testbase;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends BaseTest{
    AdminPage adminPage = new AdminPage();
    LoginPage loginPage = new LoginPage();
    AddUserPage addUserPage = new AddUserPage();
    ViewSystemUsersPage systemUsersPage = new ViewSystemUsersPage();


    @Test
//1.adminShouldAddUserSuccessFully().
    public void adminShouldAddUserSuccessFully() throws InterruptedException{
        //Login to Application
        loginPage.sendUserNameInUserNameField("Admin");
        loginPage.sendPasswordInPasswordField("admin123");
        loginPage.clickONLoginButton();

        //click On "Admin" Tab
        adminPage.clickOnAdminButton();
        //Verify "System Users" Text
        Thread.sleep(2000);
        Assert.assertEquals(adminPage.getUsermanagementText(),"User Management","UserManagement title not appeared");
        //click On "Add" button
        adminPage.clickOnAddButton();
        Thread.sleep(2000);
        //Verify "Add User" Text
        Assert.assertEquals(adminPage.getAddUserText(),"Add User","Add User not displayed");
        //Select User Role "Admin"
        addUserPage.clickOnUserRoleDropdown();
        Thread.sleep(2000);
        addUserPage.selectAdmin();
        //enter Employee Name "Ananya Dash"
        addUserPage.sendEmployeeName("Lisa");
        Thread.sleep(1000);
        addUserPage.clickOnEmployeeNameOption();
        //enter Username
        addUserPage.sendUserName("shital");
        //Select status "Disable"
        addUserPage.selectStatus();
        Thread.sleep(2000);
        addUserPage.selectDisableInStatusDropdown();
        //enter psaaword
        addUserPage.sendPassword("Alice@123");
        //enter Confirm Password
        addUserPage.sendConfirmPassword("Alice@123");
        //click On "Save" Button
        addUserPage.clickOnSaveButton();
        //Verify message "Successfully Saved"
        String actualMessage = adminPage.verifySaveSuccessfully();
        String expectedMessage ="Success\nSuccessfully Saved";
        boolean message = actualMessage.contains(expectedMessage.trim());
        Assert.assertTrue(message);
    }
    @Test
    //2. searchTheUserCreatedAndVerifyIt().
    public void searchTheUserCreatedAndVerifyIt()throws InterruptedException{
        //	Login to Application
        loginPage.sendUserNameInUserNameField("Admin");
        loginPage.sendPasswordInPasswordField("admin123");
        loginPage.clickONLoginButton();
        //	click On "Admin" Tab
        adminPage.clickOnAdminButton();
        //	Verify "System Users" Text
        Assert.assertEquals(systemUsersPage.getsystemUserText(),"System Users","UserSystem not displayed");
        //	Enter Username
        systemUsersPage.sendUserNameSystem("shital");
        //	Select User Role
        systemUsersPage.clickOnSelectRoleSystemDropdown();
        Thread.sleep(2000);
        systemUsersPage.clickOnAdminSystem();
        Thread.sleep(2000);
        //	Select Satatus
        //       adminPage.clickOnSatusSystem();
//        Thread.sleep(2000);
//        adminPage.clickOnDisableSystem();
        //	Click on "Search" Button
        Thread.sleep(2000);
        systemUsersPage.clickOnSearchButton();
        //	Verify the User should be in Result list.
        String record = adminPage.getUsernameInSearchList();
        System.out.println(record);
        String expectedRecordfoundMessage ="shital";
        Assert.assertEquals(record,expectedRecordfoundMessage,"Record Not found");

    }
    @Test
    //3. verifyThatAdminShouldDeleteTheUserSuccessFully.
    public void  verifyThatAdminShouldDeleteTheUserSuccessFully()throws InterruptedException {
        //	Login to Application
        loginPage.sendUserNameInUserNameField("Admin");
        loginPage.sendPasswordInPasswordField("admin123");
        loginPage.clickONLoginButton();
        //	click On "Admin" Tab
        adminPage.clickOnAdminButton();
        //	Verify "System Users" Text
        Assert.assertEquals(systemUsersPage.getsystemUserText(),"System Users","UserSystem not displayed");
        //	Enter Username
        systemUsersPage.sendUserNameSystem("Payal");
        //	Select Satatus
        systemUsersPage.clickOnSelectRoleSystemDropdown();
        Thread.sleep(2000);
        systemUsersPage.clickOnAdminSystem();

        //	Click on "Search" Button
        systemUsersPage.clickOnSearchButton();
        //	Verify the User should be in Result list.
        String record = adminPage.getUsernameInSearchList();
        System.out.println(record);
        String expectedRecordfoundMessage ="Payal";
        Assert.assertEquals(record,expectedRecordfoundMessage,"Record Not found");
        //	Click on Check box
        adminPage.clickCheckBoxtoSelectRecord();
        //	Click on Delete Button
        systemUsersPage.clickDeleteSelectedButton();
        //	Popup will display//	Click on Ok Button on Popup
        adminPage.clickOnyesDeleteButton();
        //	verify message "Successfully Deleted"
        String actualDeleteMessage = adminPage.getDeleteSuccessfullyText();
        String expectedDeletMessage="Success\nSuccessfully Deleted";
        boolean message = actualDeleteMessage.contains(expectedDeletMessage.trim());
        Assert.assertTrue(message);
    }
    @Test
    //4. searchTheDeletedUserAndVerifyTheMessageNoRecordFound.
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() throws InterruptedException{
        //	Login to Application
        loginPage.sendUserNameInUserNameField("Admin");
        loginPage.sendPasswordInPasswordField("admin123");
        loginPage.clickONLoginButton();
        //	click On "Admin" Tab
        adminPage.clickOnAdminButton();
        //	Verify "System Users" Text
        Assert.assertEquals(systemUsersPage.getsystemUserText(),"System Users","UserSystem not displayed");
        //	Enter Username
        systemUsersPage.sendUserNameSystem("shital");
        //	Select User Role
        systemUsersPage.clickOnSelectRoleSystemDropdown();
        Thread.sleep(2000);
        systemUsersPage.clickOnAdminSystem();
        //	Select Satatus
        // adminPage.clickOnSatusSystem();
        // Thread.sleep(2000);
        // adminPage.clickOnDisableSystem();
        //	Click on "Search" Button
        systemUsersPage.clickOnSearchButton();
        Thread.sleep(2000);
        adminPage.getNoRecordFoundText();
        //	verify message "No Records Found"
        String expectedNoRecordFoundMessage= "Info\nNo Records Found";
        String actualMessage = adminPage.getNoRecordFoundText();
        boolean message = actualMessage.contains(expectedNoRecordFoundMessage.trim());

    }


}

