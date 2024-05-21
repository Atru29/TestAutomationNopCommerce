package com.nopcommerce.step;

import com.nopcommerce.page.RegisterPage;
import com.nopcommerce.utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


import static org.junit.jupiter.api.Assertions.assertEquals;

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
    public String getText(By element) {
        return find(element).getText();
    }
    /*
     * Metodos
     * */
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
        selectDate(RegisterPage.selectDay, day);
        selectDate(RegisterPage.selectMonth, month);
        selectDate(RegisterPage.selectYear, year);
    }

    public void typeEmail(String email) {
        type(RegisterPage.inputEmail, email);
    }

    public void typeNameCompany(String nameCompania) {
        type(RegisterPage.inputNameCompany, nameCompania);
    }

    public void typePassword(String password) {
        type(RegisterPage.inputPassword, password);
    }

    public void typeRepassword(String repassword) {
        type(RegisterPage.inputRepassword, repassword);
    }

    public void clicBotonRegistrar() {
        clic(RegisterPage.btnLogin);
    }


    public void validarMensajeConfirmacion(String mensajeConfirmacion) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(RegisterPage.textConfirmacion));
        String mensaje = getText(RegisterPage.textConfirmacion);
        assertEquals(mensaje, mensajeConfirmacion, "El mensaje de confirmacion de Registro dela cuenta no coinciden");
    }

    public void clicContinuar() {
        clic(RegisterPage.btnContinuar);
    }

}
