package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {
    By admin = By.xpath("//span[normalize-space()='Admin']");
    By userManagementText = By.xpath("//h6[normalize-space()='User Management']");
    By addButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    //"//button[normalize-space()='Add']");
    By addUserText = By.xpath("//h6[normalize-space()='Add User']");
//    By userRoleSelect =By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");


    By saveMessage =By.xpath("//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']");
    By recordSelectCheckbox =By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]");

    By recordFoundText=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/span[1]");
    By usernameInTheList =By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
    By yesDeleteButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']");
    By deleteSuccessfullyText = By.xpath("//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']");
    By noRecordFoundText =By.xpath("//div[@class='oxd-toast oxd-toast--info oxd-toast-container--toast']");
    public String getDeleteSuccessfullyText(){
        String text = getTextFromElement(deleteSuccessfullyText);
        System.out.println(text);
        return text;
    }
    public void clickOnAdminButton(){
        clickOnElement(admin);
    }
    public String getUsermanagementText(){
        return getTextFromElement(userManagementText);
    }
    public void clickOnAddButton(){
        clickOnElement(addButton);
    }
    public String getAddUserText(){
        return getTextFromElement(addUserText);
    }
    public String verifySaveSuccessfully(){
        String save = driver.findElement(saveMessage).getText();
        System.out.println(save);
        return save;
    }
    public void clickCheckBoxtoSelectRecord(){
        clickOnElement(recordSelectCheckbox);
    }

    public String verifyRecordFound(){
        String record = getTextFromElement(recordFoundText);
        System.out.println(record);
        return record;
    }
    public String getUsernameInSearchList(){
        return getTextFromElement(usernameInTheList);
    }
    public void clickOnyesDeleteButton(){
        clickOnElement(yesDeleteButton);

    }
    public String getNoRecordFoundText(){
        String record = getTextFromElement(noRecordFoundText);
        System.out.println(record);
        return record;
    }

}

