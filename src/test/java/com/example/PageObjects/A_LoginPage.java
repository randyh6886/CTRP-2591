package com.example.PageObjects;

import com.example.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A_LoginPage extends BaseClass {
    public static WebDriver webDriver;

    public A_LoginPage(WebDriver driver) {
        this.webDriver=driver;
        //PageFactory.initElements(driver,this);
    }
    public void setUserName(){
        WebElement uName=webDriver.findElement(By.id("okta-signin-username"));//cssSelector("#okta-signin-username"));
        uName.sendKeys("NCIPA_Super_Abstractor@mail.nih.gov");
    }
    public void setPassword(){
        WebElement pWord=webDriver.findElement(By.id("okta-signin-password"));
        pWord.sendKeys("BoozAllen#2022");
    }

    public void clickSigninSubmit(){
        WebElement signinSubmit= webDriver.findElement(By.cssSelector("#okta-signin-submit"));
        signinSubmit.click();
    }

    public void clickProtocolAbstraction() throws InterruptedException {
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector(".fas")).click();
        //"div.v-select__slot>div.v-input__append-inner>" +
        //"div.v-input__icon.v-input__icon--append>i.v-icon.notranslate.fas.fa-caret-down.theme--light")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector("div.v-list-item__content")).click();               //id("list-item-56-0")).click();

    }

    public void clickAccept() throws InterruptedException {
        webDriver.findElement(By.cssSelector(".confirm")).click();

        //WebElement acceptBtn=webDriver.findElement(By.cssSelector(".confirm"));
        //acceptBtn.click();
        Thread.sleep(45000);

    }



}
