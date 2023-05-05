package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By search = By.xpath("//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/div[1]/div[1]/input[1]");
    By admin = By.xpath("//span[normalize-space()='Admin']");
    By PIM = By.xpath("//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]/span[1]");
    By dashboard = By.xpath("//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[8]/a[1]/span[1]");
    By leave = By.xpath("//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/span[1]");
    public boolean isSearchBoxVisible(){
        return  isElementVisible(search);
    }
    public boolean isAdminOptionVisible(){
        return isElementVisible(admin);
    }
    public boolean isPIMOptionVisible(){
        return isElementVisible(PIM);
    }
    public boolean isDashboardOptionVisible(){
        return isElementVisible(dashboard);
    }
    public boolean isLeaveOptionVisible(){
        return isElementVisible(leave);
    }
}
