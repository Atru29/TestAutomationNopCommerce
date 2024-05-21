package com.nopcommerce.glue;

import com.nopcommerce.step.LoginStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginStepDef {
    protected LoginStep loginStep;

    public LoginStepDef(){
        loginStep = new LoginStep();
    }
    @And("el usuario hace clic en Log In")
    public void elUsuarioHaceClicEnLogIn() {
        loginStep.clicLogIn();
    }
    @When("el usuario ingresa su direccion de correo electrinico {string}")
    public void elUsuarioIngresaSuDireccionDeCorreoElectrinico(String email) {
        loginStep.typeEmail(email);
    }
    @And("el usuario ingresa su password {string}")
    public void elUsuarioIngresaSuPassword(String password){
        loginStep.typePassword(password);
    }
    @And("el usuario hace clic en Remenber Me")
    public void elUsuarioHaceClicEnRemenberMe() {
        loginStep.clicRemenberMe();
    }
    @And("el usuario hace clic en el boton Log In")
    public void elUsuarioHaceClicEnElBotonLogIn() {
        loginStep.clicBtnLogIn();
    }
}
