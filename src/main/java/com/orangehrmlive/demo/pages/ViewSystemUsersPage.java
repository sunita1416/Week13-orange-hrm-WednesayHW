package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {
    By systemUserText = By.xpath("//h5[normalize-space()='System Users']");
    By employeeNameSystem = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]");
    By userNameSystem = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");
    By selectUserRoleSystem = By.xpath("(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[1]");
    By userRoleAdmin = By.xpath("(//span[contains(text(),'Admin')])[1]");
    By statusSystem =By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]");
    By disableSystem = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[3]/span[1]");
    By searchButton =By.xpath("//button[normalize-space()='Search']");
    By employeeDropdown = By.xpath("//div[@role='option']");
    By resetButton = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]");
    public String getsystemUserText(){
        return getTextFromElement(systemUserText);
    }
    public void sendUserNameSystem(String username){
        sendTextToElement(userNameSystem,username);
    }
    public void clickOnSelectRoleSystemDropdown(){
        clickOnElement(selectUserRoleSystem);
    }
    public void clickOnAdminSystem(){
        clickOnElement(userRoleAdmin);
    }
    public void clickOnSearchButton(){
        clickOnElement(searchButton);
    }
    public void clickOnSatusSystem(){
        clickOnElement(statusSystem);
    }
    public void clickOnDisableSystem(){
        clickOnElement(disableSystem);
    }
    By deleteSelectedButton = By.xpath("(//button[normalize-space()='Delete Selected'])[1]");
    public void clickDeleteSelectedButton(){
        clickOnElement(deleteSelectedButton);
    }
    public void sendEmployeeName(String empName){

        sendTextToElement(employeeNameSystem,empName);

    }
    public void clickOnEmployeeNameOption(){
        mouseHoverToElementAndClick(employeeDropdown);
    }
    public void clickOnResetButton(){
        clickOnElement(resetButton);
    }

}

