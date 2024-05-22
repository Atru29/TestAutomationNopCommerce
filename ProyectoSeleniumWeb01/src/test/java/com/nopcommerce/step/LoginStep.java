package com.nopcommerce.step;

import com.nopcommerce.utils.Base;
import com.nopcommerce.page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginStep extends Base {
    private static final Logger logger = LogManager.getLogger(LoginStep.class);

    /*
     * Metodos Reutilizables
     * */
    public static void logAssertInfo(String mensajeCapturado, String mensajeEsperado) {
        logger.info("Validando Textos");
        logger.info("Mensaje Capturado: " + mensajeCapturado);
        logger.info("Mensaje Esperado:  " + mensajeEsperado);
    }

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
        type(LoginPage.inputEmail, email);
    }

    public void typePassword(String password) {
        type(LoginPage.inputPassword, password);
    }

    public void clicBtnLogIn() {
        clic(LoginPage.inputBtnLogIn);
    }

    public void clicRemenberMe() {
        clic(LoginPage.inputCheckBoxRemenberMe);
    }

    public void validarTextLogIn(String textWelconLogin) {
        logger.info("Validando Texto de Log In");
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.textWelconLogin));
        String mensaje = getText(LoginPage.textWelconLogin);
        logAssertInfo(mensaje, textWelconLogin);
        assertEquals(mensaje, textWelconLogin);
    }

    public void validartextReturnCustomer(String textReturnCustomer) {
        logger.info("Validando Texto Return Customer");
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.textReturnCustomer));
        String mensaje = getText(LoginPage.textReturnCustomer);
        logAssertInfo(mensaje, textReturnCustomer);
        assertEquals(mensaje, textReturnCustomer);
    }
}
