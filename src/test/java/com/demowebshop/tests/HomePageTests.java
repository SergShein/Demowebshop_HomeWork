package com.demowebshop.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase{

    @Test
    public void isHomeComponentPresentTest(){
        //System.out.println("Home component "+isHomeComponentPresent());
        // driver.findElements(By.xpath("//div[@class='header-logo']"));
        //driver.findElement(By.cssSelector("div.header-logo"));
        Assert.assertTrue(isHomeComponentPresent());

    }
    public boolean isHomeComponentPresent(){
        return driver.findElements(By.cssSelector("div.header-logo")).size()>0;
    }
}
