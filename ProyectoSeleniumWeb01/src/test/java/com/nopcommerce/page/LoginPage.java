package com.nopcommerce.page;

import org.openqa.selenium.By;

public class LoginPage {
    public static By linkLogIn= By.xpath("//a[@class='ico-login']");
    public static By inputEmail= By.xpath("//input[@id='Email']");
    public static By inputPassword= By.xpath("//input[@id='Password']");
    public static By inputCheckBoxRemenberMe = By.xpath("//input[@id='RememberMe']");
    public static By inputBtnLogIn= By.xpath("//button[@type='submit' and @class='button-1 login-button']");
}
