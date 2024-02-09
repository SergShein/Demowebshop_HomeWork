package com.demowebshop.tests;

import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @Test
    public void loginRegisteredUserPositiveTest(){
        //click on  Log_in link
        clickOnLogInLink();
        //enter email
        fillLogInForm();

        //click checkpoint Remember me
        clickOnCheckpointRememberMe();
        //click on the Log_in button
        clickOnLogInButton();

        //click on 25$ Virtual Gift Card
        clickOn25$VirtualGiftCard();

        //enter Recipient Name
        fillRecipientForm();

        //click on Add to cart
        clickOnAddCart();
        //click on the shopping cart
        clickOnShoppingCartLink();

        //assert shopping cart
        //Assert.assertTrue(isElementPresent(By.cssSelector("td.product [href='/25-virtual-gift-card'")));
    }


}
