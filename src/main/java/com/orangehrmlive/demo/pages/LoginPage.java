package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends Utility {
    /*By username = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name ='password']");
    By loginButton = By.xpath("//button[@type ='submit']");
    By HrForAllLogo = By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/img");

    By LoginPanelTxtLocator = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5");

*/
    By userName = By.name("username");
    By password = By.name("password");
    By loginButton =By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
    By hrForAlllogo =By.xpath("(//img[@alt='orangehrm-logo'])[2]");
    By loginPanelText =By.xpath("//div[@class='orangehrm-login-slot']");
    //By dashboard = By.xpath("//h6[normalize-space()='Dashboard']");
    By profileLogo =By.xpath("//p[@class='oxd-userdropdown-name']");
    By logout = By.xpath("//a[normalize-space()='Logout']");
    public void sendUserNameInUserNameField(String username){
        sendTextToElement(userName,username);}
    public void sendPasswordInPasswordField(String password1){
        sendTextToElement(password,password1);}
    public void clickONLoginButton(){clickOnElement(loginButton);}
    public WebElement getHRforAllogoText(){
        WebElement logo = driver.findElement(hrForAlllogo);
        return logo;      }

    //public String getDashboardText(){return getTextFromElement(dashboard);}
    public void clickOnprofileLogo()
    {clickOnElement(profileLogo);}
    public void mouseHoverOnAndClickOnLogout(){
        mouseHoverToElementAndClick(logout);
    }
    public WebElement getLoginPanelDisplayed(){
        WebElement loginPanel = driver.findElement(loginPanelText);
        return loginPanel;
    }



}



