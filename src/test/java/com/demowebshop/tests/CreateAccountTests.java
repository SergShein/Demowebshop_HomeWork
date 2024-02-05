package com.demowebshop.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    @Test
    public void createNewAccountPositiveTest(){
        //click on Register link
        driver.findElement(By.cssSelector("[href='/register']")).click();

        //gender
        driver.findElement(By.cssSelector("#gender-male")).click();
        //enter first name
        driver.findElement(By.id("FirstName")).click();
        driver.findElement(By.id("FirstName")).clear();
        driver.findElement(By.id("FirstName")).sendKeys("John_QA");
        //enter last name
        driver.findElement(By.xpath("//input[@id='LastName']")).click();
        driver.findElement(By.xpath("//input[@id='LastName']")).clear();
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Rambo_QA");
        //enter Email
        driver.findElement(By.cssSelector("#Email")).click();
        driver.findElement(By.cssSelector("#Email")).clear();
        driver.findElement(By.cssSelector("#Email")).sendKeys("rambo_qa@gmail.com");
        //enter Password
        driver.findElement(By.xpath("//*[@id='Password']")).click();
        driver.findElement(By.xpath("//*[@id='Password']")).clear();
        driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("PassWord$");
        //enter confirm password
        driver.findElement(By.xpath("//*[@id='ConfirmPassword']")).click();
        driver.findElement(By.xpath("//*[@id='ConfirmPassword']")).clear();
        driver.findElement(By.xpath("//*[@id='ConfirmPassword']")).sendKeys("PassWord$");
        //click on Register button
        driver.findElement(By.xpath("//*[@id='register-button']")).click();
        //assert sign out button in present

        //Assert.assertTrue(isElementPresent(By.cssSelector("[href='/logout']")));
    }
}
