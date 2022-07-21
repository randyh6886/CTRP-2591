package com.example.PageObjects;

import com.example.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class B_OrganizationPage extends BaseClass{
    public static WebDriver weBdriver;

    public B_OrganizationPage(WebDriver ldriver){
        this.weBdriver=ldriver;
        PageFactory.initElements(ldriver, this);
    }

    public void clickOrganizationsMenuOption() throws Throwable{
        WebElement element=weBdriver.findElement(By.id("organizationSearchMenuOption"));
        element.click();
    }

    public void selectActive() throws Throwable{
        WebElement element=weBdriver.findElement(By.id("status"));
        element.click();
        {
            WebElement dropdown = weBdriver.findElement(By.id("status"));
            dropdown.findElement(By.xpath("//option[. = 'ACTIVE']")).click();
        }
    }

    public void clickSearch() throws Throwable{
        WebElement element=weBdriver.findElement(By.cssSelector(".search"));
        element.click();
    }

    public void assertStep(){
        String assertText="Organization(s):";
        System.out.println(weBdriver.findElement(By.cssSelector("h2")).getText());
        Assert.assertTrue(assertText.equals(weBdriver.findElement(By.cssSelector("h2")).getText()));
    }

    public void clickLogout() throws Throwable{
        WebElement element=weBdriver.findElement(By.linkText("Logout"));
        element.click();
    }
}
