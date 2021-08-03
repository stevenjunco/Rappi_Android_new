package Rappi.stepdefinitions;

import Rappi.acciones.OperacionDivide;
import Rappi.acciones.OperacionMultiplica;
import Rappi.acciones.OperacionRestar;
import Rappi.acciones.OperacionSumar;
import Rappi.navigation.BaseAppium;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OperacionSumaStepDefinition extends BaseAppium {

    String Resultado = "";

    @When("Se suma el {string} con el {string}")
    public void heSeSumaElConEl(String arg0, String arg1) throws InterruptedException {


        BaseAppium baseAppium = new BaseAppium();
        try {
            baseAppium.init();
        } catch (Exception e) {
            System.out.println("Error connecting to Appium Service. Error :" + e.getMessage());
        }

        Resultado = OperacionSumar.SumarNumeros(arg0, arg1);
    }

    @When("Se resta el {string} con el {string}")
    public void seRestaElConEl(String arg0, String arg1) throws InterruptedException {
        Resultado = OperacionRestar.RestarNumeros(arg0, arg1);
    }

    @Then("y se verifica que el resultado es el {string}")
    public void heSeVerificaQueElResultadoEsEl(String arg0) throws InterruptedException {
        Assert.assertTrue(Resultado.equals(arg0));
    }

    @When("Se multiplica el {string} con el {string}")
    public void seMultiplicaElConEl(String arg0, String arg1) throws InterruptedException {
        Resultado = OperacionMultiplica.MultiplicarNumeros(arg0, arg1);
    }

    @When("Se Divide el {string} con el {string}")
    public void seDivideElConEl(String arg0, String arg1) throws InterruptedException {
        Resultado = OperacionDivide.DividirNumeros(arg0, arg1);
    }

    @After
    public void close() {
        BaseAppium baseAppium = new BaseAppium();
        baseAppium.tearDown();
    }



}
