package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {
    By userRoleSelect =By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    By cancelButton =By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]");
    By adminUserRole = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/span[1]");
    By employeeNameField= By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]");
    By employeeDropdown = By.xpath("//div[@role='option']");
    By userName =By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]");
    By selectStatus =By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]");
    By disableStatus = By.xpath("//span[normalize-space()='Disabled']");
    By password = By.xpath("(//input[@type='password'])[1]");
    By confirmPassword = By.xpath("(//input[@type='password'])[2]");
    By saveButton = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]");
    public void clickOnCancelButton(){
        clickOnElement(cancelButton);
    }
    public void clickOnUserRoleDropdown(){
        clickOnElement(userRoleSelect);
    }
    public void selectAdmin(){
        clickOnElement(adminUserRole);
    }
    public void sendEmployeeName(String empName){

        sendTextToElement(employeeNameField,empName);

    }
    public void clickOnEmployeeNameOption(){
        mouseHoverToElementAndClick(employeeDropdown);
    }
    public void sendUserName(String username){
        sendTextToElement(userName,username);
    }
    public void selectStatus(){
        clickOnElement(selectStatus);

    }
    public void selectDisableInStatusDropdown(){
        clickOnElement(disableStatus);
    }
    public void sendPassword(String password1){
        sendTextToElement(password,password1);
    }
    public void sendConfirmPassword(String confimpassword){
        sendTextToElement(confirmPassword,confimpassword);
    }
    public void clickOnSaveButton(){clickOnElement(saveButton);}

}

