package com.demowebshop.tests;

import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    @Test
    public void createNewAccountPositiveTest(){
        //click on Register link
        clickOnRegisterLink();
        //gender
        clickOnGenderCheckbox();
        //enter first name
        fillCreateAccountForm("rambo_qa@gmail.com", "PassWord$");
        //click on Register button
        clickOnRegisterButton();
        //assert sign out button in present

        //Assert.assertTrue(isElementPresent(By.cssSelector("[href='/logout']")));
    }

}
