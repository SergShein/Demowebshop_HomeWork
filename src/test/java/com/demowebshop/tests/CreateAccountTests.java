package com.demowebshop.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition(){

    }
    @Test
    public void createNewAccountPositiveTest(){
        clickOnRegisterLink();
        clickOnGenderCheckbox();
        fillCreateAccountForm("rambo_qa@gmail.com", "PassWord$");
        clickOnRegisterButton();
        //Assert.assertTrue(isElementPresent(By.cssSelector("[href='/logout']")));
    }

}
