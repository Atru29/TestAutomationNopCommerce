package com.nopcommerce.step;

import com.nopcommerce.page.RegisterPage;
import com.nopcommerce.utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Date;

public class RegisterStep extends Base {
    /*
     * Metodos Reutilizables
     * */
    private static WebElement find(By element) {
        return driver.findElement(element);
    }

    private static void clic(By element) {
        find(element).click();
    }

    private static void type(By element, String text) {
        find(element).sendKeys(text);
    }

    private static void selectDate(By element, String dateText) {
        Select date = new Select(find(element));
        date.selectByVisibleText(dateText);
    }

    /*
     * Metodos
     * */
    public void clicLinkRegister() {
        clic(RegisterPage.linkRegister);
    }

    public void typeFirstName(String firstName) {
        type(RegisterPage.inputFirstName, firstName);
    }

    public void typeLastName(String lastName) {
        type(RegisterPage.inputLastName, lastName);
    }

    public void clicGenero() {
        clic(RegisterPage.inputGenereMale);
    }

    public void typeBirthdate(String day, String month, String year) {
        selectDate(RegisterPage.selectDay,day);
        selectDate(RegisterPage.selectMonth,month);
        selectDate(RegisterPage.selectYear,year);
    }
    public void typeEmail(String email) {
        type(RegisterPage.inputEmail,email);
    }

    public void typeNameCompany(String nameCompania) {
        type(RegisterPage.inputNameCompany,nameCompania);
    }

    public void typePassword(String password) {
        type(RegisterPage.inputPassword,password);
    }

    public void typeRepassword(String repassword) {
        type(RegisterPage.inputRepassword,repassword);
    }

    public void clicBotonRegistrar() {
        clic(RegisterPage.btnLogin);
    }


}
