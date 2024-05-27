package com.nopcommerce.glue;

import com.nopcommerce.utils.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDef  extends Base {

    @When("el usuario hace clic en el boton Computers")
    public void elUsuarioHaceClicEnElBotonComputers() {
    }

    @And("el usuario hace clic en Dekstops")
    public void elUsuarioHaceClicEnDekstops() {
    }

    @And("el usuario ordena por precio mas bajo")
    public void elUsuarioOrdenaPorPrecioMasBajo() {
    }

    @And("el usuario selecciona la cantidad de productos en el catalago")
    public void elUsuarioSeleccionaLaCantidadDeProductosEnElCatalago() {
    }

    @And("el usuario hace clic en agregar al carrito")
    public void elUsuarioHaceClicEnAgregarAlCarrito() {
    }

    @Then("se valida el mensaje de confirmacion del producto argegado al carrito {string}")
    public void seValidaElMensajeDeConfirmacionDelProductoArgegadoAlCarrito(String arg0) {
    }

    @And("el usuario hace clic en Shopping Cart")
    public void elUsuarioHaceClicEnShoppingCart() {
    }

    @And("se valida que el producto se encuentre en el carrito")
    public void seValidaQueElProductoSeEncuentreEnElCarrito() {
    }


}
