package com.demowebshop.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();
    }
    public boolean isElementPresent(By locator){
        return driver.findElements(locator).size()>0;
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public  void clickOnRegisterButton() {
        click(By.xpath("//*[@id='register-button']"));
    }

    public void clickOnGenderCheckbox() {
        click(By.cssSelector("#gender-male"));
    }

    public void fillCreateAccountForm(String email, String password) {
        type(By.id("FirstName"), "John");
        //enter last name
        type(By.xpath("//input[@id='LastName']"), "Rambo");
        //enter Email
        type(By.cssSelector("#Email"), email);
        //enter Password
        type(By.xpath("//*[@id='Password']"), password);
        //enter confirm password
        type(By.xpath("//*[@id='ConfirmPassword']"), password);
    }

    public void clickOnRegisterLink() {
        click(By.cssSelector("[href='/register']"));
    }

    public void clickOnShoppingCartLink() {
        click(By.cssSelector("#topcartlink [href='/cart']"));
    }

    public void clickOnAddCart() {
        click(By.cssSelector("#add-to-cart-button-2"));
    }

    public void fillRecipientForm() {
        type(By.xpath("//input[@id='giftcard_2_RecipientName']"),"John Rambo");
        // enterRecipient's Email:
        type(By.xpath("//input[@id='giftcard_2_RecipientEmail']"),"rambo_qa@gmail.com");
    }

    public void clickOn25$VirtualGiftCard() {
        click(By.cssSelector(".item-box:nth-child(2) [value='Add to cart']"));
    }

    public void clickOnLogInButton() {
        click(By.cssSelector(".button-1.login-button"));
    }

    public void fillLogInForm() {
        type(By.cssSelector("#Email"), "rambo_qa@gmail.com");
        //enter password
        type(By.xpath("//*[@id='Password']"), "PassWord$");
    }

    public void clickOnLogInLink() {
        click(By.cssSelector("[href='/login']"));
    }

    public void clickOnCheckpointRememberMe() {
        click(By.cssSelector("#RememberMe"));
    }
}
