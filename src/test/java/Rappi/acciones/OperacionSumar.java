package Rappi.acciones;

import Rappi.navigation.BaseAppium;
import io.appium.java_client.MobileElement;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import Rappi.vistas.NumerosVista;
import Rappi.vistas.OperadoresVista;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OperacionSumar extends BaseAppium {
    public static String SumarNumeros(String número1, String número2) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(OperadoresVista.Resultado));
        Thread.sleep(1000);
        NumerosVista.número_1.click();

        OperadoresVista.Operador_Suma.click();

        NumerosVista.número_2.click();

        OperadoresVista.Operador_Igual.click();

        Thread.sleep(1000);

        return OperadoresVista.Resultado.getText();
    }
}
