package com.nopcommerce.step;

import com.nopcommerce.page.HomePage;
import com.nopcommerce.utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeStep extends Base {
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
    public void clicLinkRegister() {
        clic(HomePage.linkRegister);
    }
    public void clicLogIn() {
        clic(HomePage.linkLogIn);
    }
    public void validarMensajePaginaPrincipal(String mensajePaginaPrincipal) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.textMessageHomePage));
        String mensaje= getText(HomePage.textMessageHomePage);
        assertEquals(mensaje, mensajePaginaPrincipal, "El titulo de la Home Page no coinciden");

    }

    public void validarOpcionMyAccount(String mensajeMyAccount) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.linkMyAccount));
        String mensaje= getText(HomePage.linkMyAccount);
        assertEquals(mensaje,mensajeMyAccount,"El text de la opcion My Account No cocinciden");

    }
}
