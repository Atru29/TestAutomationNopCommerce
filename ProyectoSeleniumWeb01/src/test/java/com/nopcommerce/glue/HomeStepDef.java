package com.nopcommerce.glue;

import com.nopcommerce.step.HomeStep;
import com.nopcommerce.step.LoginStep;
import com.nopcommerce.step.RegisterStep;
import com.nopcommerce.utils.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomeStepDef extends Base {
    protected LoginStep loginStep;
    protected RegisterStep registerStep;
    protected HomeStep homeStep;
    public HomeStepDef(){
        loginStep=new LoginStep();
        registerStep= new RegisterStep();
        homeStep = new HomeStep();
    }
    @Given("el usuario se encuentra en la pagina principal {string}")
    public void el_usuario_se_encuentra_en_la_pagina_principal(String url) {
        driver.get(url);
    }
    @And("el usuario hace clic en Register")
    public void el_usuario_hace_clic_en_register() {
        homeStep.clicLinkRegister();
    }
    @And("el usuario hace clic en Log In")
    public void elUsuarioHaceClicEnLogIn() {
        homeStep.clicLogIn();
    }
}
