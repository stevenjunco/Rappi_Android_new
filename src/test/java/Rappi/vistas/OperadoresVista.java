package Rappi.vistas;

import io.appium.java_client.MobileElement;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import Rappi.navigation.BaseAppium;

public class OperadoresVista extends BaseAppium {
    WebDriverWait wait = new WebDriverWait(driver, 10);

    public static MobileElement Operador_Suma = (MobileElement) driver.findElementById("com.android.calculator2:id/op_add");

    public static MobileElement Operador_Resta = (MobileElement) driver.findElementById("com.android.calculator2:id/op_sub");

    public static MobileElement Operador_Multi = (MobileElement) driver.findElementById("com.android.calculator2:id/op_mul");

    public static MobileElement Operador_Divi = (MobileElement) driver.findElementById("com.android.calculator2:id/op_div");

    public static MobileElement Operador_Igual = (MobileElement) driver.findElementById("com.android.calculator2:id/eq");

    public static MobileElement Resultado = (MobileElement) driver.findElementById("com.android.calculator2:id/result");

}
