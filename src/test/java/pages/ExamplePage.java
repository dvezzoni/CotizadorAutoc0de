package pages;

import com.core.utility.MasterPage;
import org.junit.Assert;


import static locators.Locators.*;

public class ExamplePage extends MasterPage {
    public void navigateToMainURL() {
        auto_openURLInBrowser();
    }


    public void clickMarcaAuto() {
        auto_setClickElement(DROPDOWN_MARCA_AUTO_XPATH);
    }

    public void clickChevrolet() {
        auto_setClickElement(ITEM_CHEVROLET_XPATH);
    }

    public void clickAnoDropdown() {
        auto_setClickElement(DROPDOWN_ANO_XPATH);
    }

    public void clickAno(String ano) {
        auto_setClickElement(String.format(OPTION_ANO_ID, ano));
    }

    public void clickModeloDropdown() {
        auto_setClickElement(DROPDOWN_MODELO_XPATH);
    }

    public void clickModelo(String modelo) {
        auto_setClickElement(String.format(OPTION_MODELO_XPATH, modelo));
    }

    public void clickProvinciaDropdown() {
        auto_setClickElement(DROPDOWN_PROVINCIA_XPATH);
    }

    public void clickProvincia(String provincia) {
        auto_setClickElement(String.format(OPTION_PROVINCIA_XPATH, provincia));
    }

    public void clickLocalidadDropdown() {
        auto_setClickElement(DROPDOWN_LOCALIDAD_XPATH);
    }

    public void clickLocalidad(String provincia) {
        auto_setClickElement(String.format(OPTION_LOCALIDAD_XPATH, provincia));
    }

    public void clickContinuar() {
        auto_setClickElement(BUTTON_CONTINUAR_XPATH);
    }


    public void completeNombreApellido(String nombre, String apellido) {
        auto_setTextToInput(NOMBRE_INPUT_XPATH, nombre);
        auto_setTextToInput(APELLIDO_INPUT_XPATH, apellido);
    }

    public void completeMail(String mail) {
        auto_setTextToInput(MAIL_INPUT_XPATH, mail);
    }

    public void completeTelefono(String codigo, String telefono) {
        auto_setTextToInput(CODIGOAREA_INPUT_XPATH, codigo);
        auto_setTextToInput(TELEFONO_INPUT_XPATH, telefono);
    }


    public void clickEdadDropdown() {
        auto_setClickElement(DROPDOWN_EDAD_XPATH);
    }

    public void clickEdad(String edad) {
        auto_setClickElement(String.format(OPTION_EDAD_XPATH, edad));
    }

    public void clickGarage() {
        auto_setClickElement(OPCION_GARAGE_XPATH);
    }

    public void clickComercial() {
        auto_setClickElement(OPCION_COMERCIAL_XPATH);
    }

    public void clickAlarma() {
        auto_setClickElement(OPCION_ALARMA_XPATH);
    }

    public void clickGnc() {
        auto_setClickElement(OPCION_GNC_XPATH);
    }

    public void clickKM() {
        auto_setClickElement(OPCION_KM_XPATH);
    }

    public void clickCotizar() {
        auto_setClickElement(BOTON_COTIZAR_XPATH);
    }

    public void clickContratar() {
        auto_setClickElement(BOTON_CONTRATAR_XPATH);
    }

    public void contrataSeguro() {
        auto_verifyVisibility(SUCCESS_TEXT_XPATH);
    }



}
