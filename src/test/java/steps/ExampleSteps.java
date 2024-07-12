package steps;

import io.cucumber.java.en.*;
import pages.ExamplePage;

public class ExampleSteps {
    /*
     ** PAGE INSTANCE **
     */

    ExamplePage examplePage = new ExamplePage();

    @Given("el usuario esta en la pantalla principal del cotizador")
    public void theUserIsOnTheHomeScreenOfUndercDeOrg() {
        examplePage.navigateToMainURL();
    }


    @And("el usuario selecciona la marca del auto") //
    public void theUserClicksMarcaAuto() {
        examplePage.clickMarcaAuto();
    }

    @And("el usuario selecciona chevrolet") //
    public void theUserClicksChevrolet() {
        examplePage.clickChevrolet();
    }

    @And("^el usuario selecciona el \"(.*)\"$") //
    public void theUserSeleccionaAno(String ano) {
        examplePage.clickAnoDropdown();
        examplePage.clickAno(ano);
    }

    @And("^el usuario selecciona modelo \"(.*)\"$") //
    public void theUserSeleccionaModelo(String modelo) {
        examplePage.clickModeloDropdown();
        examplePage.clickModelo(modelo);
    }


    @And("^el usuario selecciona la provincia \"(.*)\"$") //
    public void theUserSeleccionaProvincia(String provincia) {
        examplePage.clickProvinciaDropdown();
        examplePage.clickProvincia(provincia);
    }

    @And("^el usuario selecciona la localidad \"(.*)\"$") //
    public void theUserSeleccionaLocalidad(String localidad) {
        examplePage.clickLocalidadDropdown();
        examplePage.clickLocalidad(localidad);
    }

    @And("el usuario clickea en el boton CONTINUAR") //
    public void theUserClicksContinuar() {
        examplePage.clickContinuar();
    }

    @And("^el usuario completa el nombre \"(.*)\" y el apellido \"(.*)\"$")
    public void theUserCompleteTeNombreApellido(String nombre, String apellido) {
        examplePage.completeNombreApellido(nombre, apellido);
    }

    @And("^el usuario completa con el mail \"(.*)\"$")
    public void theUserCompleteTeMail(String mail) {
        examplePage.completeMail(mail);
    }

    @And("^el usuario completa el codigo de area \"(.*)\" y el telefono \"(.*)\"$")
    public void theUserCompleteTeTelefono(String codigo, String telefono) {
        examplePage.completeTelefono(codigo, telefono);
    }

    @And("^el usuario completa la edad \"(.*)\"$") //
    public void theUserSeleccionaEdad(String edad) {
        examplePage.clickEdadDropdown();
        examplePage.clickEdad(edad);
    }

    @And("el usuario selecciona las opciones de su auto") //
    public void theUserClicksTheOptions() {
        examplePage.clickGarage();
        examplePage.clickComercial();
        examplePage.clickAlarma();
        examplePage.clickGnc();
        examplePage.clickKM();
    }

    @And("el usuario clickea en el boton COTIZAR") //
    public void theUserClicksCotizar() {
        examplePage.clickCotizar();
    }

    @And("el usuario clickea el boton CONTRATAR") //
    public void theUserClicksContratar() {
        examplePage.clickContratar();
    }

    @Then("el usuario contrata el seguro")
    public void theUserContrataSeguro() {
        examplePage.contrataSeguro();
    }


}
