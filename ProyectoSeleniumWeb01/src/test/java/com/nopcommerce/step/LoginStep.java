package com.nopcommerce.step;

import com.nopcommerce.utils.Base;
import com.nopcommerce.page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginStep extends Base {
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
    public String getText(By element) {
        return find(element).getText();
    }
    /*
     * Metodos
     * */
    public void typeEmail(String email) {
        type(LoginPage.inputEmail,email);
    }

    public void typePassword(String password) {
        type(LoginPage.inputPassword,password);
    }

    public void clicBtnLogIn() {
        clic(LoginPage.inputBtnLogIn);
    }

    public void clicRemenberMe() {
        clic(LoginPage.inputCheckBoxRemenberMe);
    }

    public void validarTextLogIn(String textWelconLogin) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.textWelconLogin));
        String mensaje = getText(LoginPage.textWelconLogin);
        assertEquals(mensaje, textWelconLogin);
    }
    public void validartextReturnCustomer(String textReturnCustomer) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.textReturnCustomer));
        String mensaje = getText(LoginPage.textReturnCustomer);
        assertEquals(mensaje, textReturnCustomer);
    }
}
