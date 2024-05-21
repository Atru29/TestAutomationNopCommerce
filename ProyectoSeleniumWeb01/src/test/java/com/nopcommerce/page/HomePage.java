package com.nopcommerce.page;

import org.openqa.selenium.By;

public class HomePage {
    public static By linkLogIn= By.xpath("//a[@class='ico-login']");
    public static By linkRegister = By.xpath("//a[text()='Register']");
    public static By textMessageHomePage= By.xpath("//div[@class='topic-block-title']//h2");
    public static By linkMyAccount = By.xpath("//a[@href='/customer/info' and contains(@class, 'ico-account')]");
}
