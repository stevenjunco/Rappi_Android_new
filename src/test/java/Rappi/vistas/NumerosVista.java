package Rappi.vistas;

import Rappi.navigation.BaseAppium;
import io.appium.java_client.MobileElement;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NumerosVista extends BaseAppium {
    WebDriverWait wait = new WebDriverWait(driver, 10);

    public static MobileElement número_1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_1");

    public static MobileElement número_2 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");

    public static MobileElement número_3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_3");

    public static MobileElement número_4 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_4");

    public static MobileElement número_5 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_5");

    public static MobileElement número_6 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_6");

    public static MobileElement número_7 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_7");

    public static MobileElement número_8 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_8");

    public static MobileElement número_9 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_9");

    public static MobileElement número_0 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_0");

}
