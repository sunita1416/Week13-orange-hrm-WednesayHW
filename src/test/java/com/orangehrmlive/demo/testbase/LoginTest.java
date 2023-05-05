package com.orangehrmlive.demo.testbase;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    @Test
    //1. verifyUserShouldLoginSuccessFully()
    public void verifyUserShouldLoginSuccessFully(){
        //   Enter username
        loginPage.sendUserNameInUserNameField("Admin");
        //   Enter password
        loginPage.sendPasswordInPasswordField("admin123");
        //   Click on Login Button
        loginPage.clickONLoginButton();
        //   Verify "Dashboard" Message
        Assert.assertEquals(dashboardPage.getDashboardText(),"Dashboard","Dashboard title not appeared");
    }
    @Test
//   2. VerifyThatTheLogoDisplayOnLoginPage()
    public void  VerifyThatTheLogoDisplayOnLoginPage()  {
        //Launch the application
        //Verify Logo is Displayed
        Assert.assertTrue(loginPage.getHRforAllogoText().isDisplayed(),"Logo Not Displayed");
    }
    @Test
    //3. VerifyUserShouldLogOutSuccessFully()
    public void VerifyUserShouldLogOutSuccessFully()throws InterruptedException{
        //   Login To The application
        verifyUserShouldLoginSuccessFully();
        //   Click on User Profile logo
        loginPage.clickOnprofileLogo();
        //   Mouse hover on "Logout" and click
        loginPage.clickOnprofileLogo();
        loginPage.mouseHoverOnAndClickOnLogout();
        Thread.sleep(2000);
        //   Verify the text "Login Panel" is displayed
        Assert.assertTrue(loginPage.getLoginPanelDisplayed().isDisplayed(),"Login page not displayed");
    }

}


