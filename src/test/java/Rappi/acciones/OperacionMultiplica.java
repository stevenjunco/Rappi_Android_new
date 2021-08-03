package Rappi.acciones;

import Rappi.navigation.BaseAppium;
import Rappi.vistas.NumerosVista;
import Rappi.vistas.OperadoresVista;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OperacionMultiplica extends BaseAppium {
    public static String MultiplicarNumeros(String número1, String número2) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(OperadoresVista.Resultado));
        Thread.sleep(5000);
        NumerosVista.número_2.click();

        OperadoresVista.Operador_Multi.click();

        NumerosVista.número_4.click();

        OperadoresVista.Operador_Igual.click();

        Thread.sleep(1000);

        return OperadoresVista.Resultado.getText();
    }


}
