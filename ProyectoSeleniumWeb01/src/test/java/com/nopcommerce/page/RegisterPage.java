package com.nopcommerce.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
   public static By linkRegister = By.xpath("//a[text()='Register']");
   public static By inputFirstName = By.xpath("//input[@id='FirstName']");
   public static By inputLastName = By.xpath("//input[@id='LastName']");
   public static By inputGenereMale= By.xpath("//input[@id='gender-male']");
   public static By selectDay=By.xpath("//select[@name='DateOfBirthDay']");
   public static By selectMonth=By.xpath("//select[@name='DateOfBirthMonth']");
   public static By selectYear=By.xpath("//select[@name='DateOfBirthYear']");
   public static By inputEmail= By.xpath("//input[@id='Email']");
   public static By inputNameCompany= By.xpath("//input[@id='Company']");
   public static By inputPassword= By.xpath("//input[@id='Password']");
   public static By inputRepassword= By.xpath("//input[@id='ConfirmPassword']");
   public static By btnLogin= By.xpath("//button[@id='register-button']");
}
