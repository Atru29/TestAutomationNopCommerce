package com.nopcommerce.glue;

import com.nopcommerce.step.RegisterStep;
import com.nopcommerce.utils.Base;
import com.nopcommerce.utils.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDef extends Base {
    protected RegisterStep registerStep;

    public RegisterStepDef() {
        registerStep = new RegisterStep();
    }

    @Given("el usuario se encuentra en la pagina principal {string}")
    public void el_usuario_se_encuentra_en_la_pagina_principal(String url) {
        driver.get(url);
    }

    @And("el usuario hace clic en Register")
    public void el_usuario_hace_clic_en_register() {
        registerStep.clicLinkRegister();
    }

    @When("el usuario selecciona su genero")
    public void el_usuario_selecciona_su_genero() {
        registerStep.clicGenero();
    }

    @And("el ususario ingresa su nombre {string}")
    public void el_ususario_ingresa_su_nombre(String nombre) {
        registerStep.typeFirstName(nombre);
    }

    @And("el usuario ingresa su apellido {string}")
    public void el_usuario_ingresa_su_apellido(String apellido) {
        registerStep.typeLastName(apellido);
    }

    @And("el usuario ingresa su fecha de nacimiento su dia {string} , el mes {string} y el anio {string}")
    public void elUsuarioIngresaSuFechaDeNacimientoSuDiaElMesYElAnio(String day, String month, String year) {
        registerStep.typeBirthdate(day,month,year);
    }

    @And("el uusario ingresa su direccion de correo electronico {string}")
    public void el_uusario_ingresa_su_direccion_de_correo_electronico(String email) {
        registerStep.typeEmail(email);
    }

    @And("el usuario ingresa el nombre de su compania {string}")
    public void el_usuario_ingresa_el_nombre_de_su_compania(String nameCompania) {
        registerStep.typeNameCompany(nameCompania);
    }

    @And("el usuario ingresa una contrasena {string}")
    public void el_usuario_ingresa_una_contrasena(String password) {
        registerStep.typePassword(password);
    }

    @And("el usuario confirma su contrasena {string}")
    public void el_usuario_confirma_su_contrasena(String repassword) {
        registerStep.typeRepassword(repassword);
    }

    @And("el usuario hace clic en el boton Register")
    public void elUsuarioHaceClicEnElBotonRegister() {
        registerStep.clicBotonRegistrar();
    }

    @Then("se valida el mensaje de confirmacion {string}")
    public void se_valida_el_mensaje_de_confirmacion(String mensajeConfirmacion) {
        registerStep.validarMensajeConfirmacion(mensajeConfirmacion);
    }

    @And("el usuario hace clic en continuar")
    public void elUsuarioHaceClicEnContinuar() {
        registerStep.clicContinuar();
    }

    @And("valida se que ecuentra en la pagina principal {string}")
    public void valida_se_que_ecuentra_en_la_pagina_principal(String mensajePaginaPrincipal) {
        registerStep.validarMensajePaginaPrincipal(mensajePaginaPrincipal);
    }

    @And("valida la opcion My Account {string}")
    public void valida_la_opcion_my_account(String mensajeMyAccount) {
        registerStep.validarOpcionMyAccount(mensajeMyAccount);

    }



}
