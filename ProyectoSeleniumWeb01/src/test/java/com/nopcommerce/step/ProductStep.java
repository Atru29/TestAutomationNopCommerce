package com.nopcommerce.step;

import com.nopcommerce.page.ProductPage;
import com.nopcommerce.utils.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductStep extends Base {
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
        wait = new WebDriverWait(driver, Duration.ofSeconds(Base.TIME_OUT));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    private static void clic(By element) {
        find(element).click();
    }
    private static void type(By element, String text) {
        find(element).sendKeys(text);
    }
    private static void selectOption(By element,String ordenTexto){
            Select filtroSelect = new Select(find(element));
            filtroSelect.selectByVisibleText(ordenTexto);
    }
    public String getText(By element) {
        return find(element).getText();
    }
    /*
    * Metodos
    * */
    public void clicBtnComputers(){
        clic(ProductPage.btnComputers);
    }
    public void clicDesktops() {
        clic(ProductPage.btnDesktop);
    }
    public void selectPrecioMasBajo(String orden) {
        selectOption(ProductPage.optionSortBy,orden);
    }
    public void selectCantidadProducto(String cantidadBusqueda) {
        selectOption(ProductPage.optionDisplayProducts,cantidadBusqueda);
    }
    public void clicAgregarAlCarrito() {
        clic(ProductPage.btnAddToCart);
    }
    public void validarMensajeAgregarCarritoExitoso(String mensajeConfirmacion) {
    }

    public void clicShoppingCart() {
    }
}
