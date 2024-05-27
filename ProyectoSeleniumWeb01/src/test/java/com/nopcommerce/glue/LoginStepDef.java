package com.nopcommerce.glue;

import com.nopcommerce.step.HomeStep;
import com.nopcommerce.step.LoginStep;
import com.nopcommerce.utils.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginStepDef extends Base {
    protected LoginStep loginStep;
    protected HomeStep homeStep;

    public LoginStepDef() {
        loginStep = new LoginStep();
        homeStep = new HomeStep();
    }

    @When("el usuario ingresa su direccion de correo electronico {string}")
    public void elUsuarioIngresaSuDireccionDeCorreoElectronico(String email) {
        loginStep.typeEmail(email);
    }

    @And("el usuario ingresa su password {string}")
    public void elUsuarioIngresaSuPassword(String password) {
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
