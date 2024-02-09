package com.demowebshop.tests;

import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @Test
    public void loginRegisteredUserPositiveTest(){
        clickOnLogInLink();
        fillLogInForm();
        clickOnCheckpointRememberMe();
        clickOnLogInButton();
        clickOn25$VirtualGiftCard();
        fillRecipientForm();
        clickOnAddCart();
        clickOnShoppingCartLink();
        //assert shopping cart
        //Assert.assertTrue(isElementPresent(By.cssSelector("td.product [href='/25-virtual-gift-card'")));
    }


}
