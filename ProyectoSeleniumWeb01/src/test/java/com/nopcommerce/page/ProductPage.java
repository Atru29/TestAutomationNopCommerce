package com.nopcommerce.page;

import org.openqa.selenium.By;

public class ProductPage {
    public  static By btnComputers = By.xpath("//a[@href='/computers']");
    public static By dropDownDesktop = By.xpath("//a[@href='/desktops']");
    public static By optionSortBy = By.xpath("//select[@id='products-orderby']");
    public static By optionDisplayProducts = By.xpath("//select[@id='products-pagesize']");
    public static By btnAddToCart = By.xpath("(//div[@class='item-box']//button[contains(@class, 'product-box-add-to-cart-button')])[2]");
}
