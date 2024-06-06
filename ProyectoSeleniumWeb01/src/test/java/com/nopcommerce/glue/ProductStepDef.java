package com.nopcommerce.glue;

import com.nopcommerce.page.ShoppingCartPage;
import com.nopcommerce.step.ProductStep;
import com.nopcommerce.utils.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDef extends Base {

    protected ProductStep productStep;
    protected ShoppingCartPage shoppingCartPage;

    public ProductStepDef () {
        productStep =  new ProductStep();
        shoppingCartPage = new ShoppingCartPage();
    }

    @When("el usuario hace clic en el boton Computers")
    public void elUsuarioHaceClicEnElBotonComputers() {
        productStep.clicBtnComputers();
    }

    @And("el usuario hace clic en Desktops")
    public void elUsuarioHaceClicEnDesktops() {
        productStep.clicDesktops();
    }

    @And("el usuario ordena por precio mas bajo {string}")
    public void elUsuarioOrdenaPorPrecioMasBajo(String filtroBusqueda) {
        productStep.selectPrecioMasBajo(filtroBusqueda);
    }

    @And("el usuario selecciona la cantidad de productos en el catalago {string}")
    public void elUsuarioSeleccionaLaCantidadDeProductosEnElCatalago(String cantidadBusqueda) {
        productStep.selectCantidadProducto(cantidadBusqueda);
    }

    @And("el usuario hace clic en agregar al carrito")
    public void elUsuarioHaceClicEnAgregarAlCarrito() {
        productStep.clicAgregarAlCarrito();
    }

    @Then("se valida el mensaje de confirmacion del producto argegado al carrito {string}")
    public void seValidaElMensajeDeConfirmacionDelProductoArgegadoAlCarrito(String mensajeConfirmacion) {
        productStep.validarMensajeAgregarCarritoExitoso(mensajeConfirmacion);
    }

    @And("el usuario hace clic en Shopping Cart")
    public void elUsuarioHaceClicEnShoppingCart() {
        productStep.clicShoppingCart();
    }

    @And("se valida que el producto se encuentre en el carrito")
    public void seValidaQueElProductoSeEncuentreEnElCarrito() {
        shoppingCartPage.validarProductoEnElCarrito();
    }
}
