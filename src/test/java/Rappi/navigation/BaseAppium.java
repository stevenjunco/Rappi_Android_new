package Rappi.navigation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import Rappi.utils.PropertyLoader;

import java.io.File;
import java.net.URL;

public class BaseAppium {

    public static AppiumDriverLocalService service;
    public static AndroidDriver<WebElement> driver;

    public void init() throws Exception {
        // Carga del fichero de propiedades
        PropertyLoader loadproperty = new PropertyLoader();
        // Recuperación del fichero de propiedades de la ruta y nombre de la aplicación móvil
        String appiumON = loadproperty.loadProperties().getProperty("appiumON");
        String device = loadproperty.loadProperties().getProperty("device");

        // Generación de las capabilites a nivel del servicio de Appium
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

        // Generación de las capabilites a nivel de driver
        DesiredCapabilities clientCapabilities = new DesiredCapabilities();
        clientCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        clientCapabilities.setCapability(MobileCapabilityType.UDID, device);
        clientCapabilities.setCapability("appPackage", "com.android.calculator2");
        clientCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        clientCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android SDK built for X86_64");

        try {
            if (appiumON.equals("S")) {
                URL url_appium = new URL("http://" + loadproperty.loadProperties().getProperty("AppiumServerIP") + ":" +
                        loadproperty.loadProperties().getProperty("AppiumServerPort") + "/wd/hub");
                driver = new AndroidDriver(url_appium, clientCapabilities);
            } else {
                File app = new File(loadproperty.loadProperties().getProperty("apkDir"), loadproperty.loadProperties().getProperty("apkName"));
                desiredCapabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
                // Appium service
                AppiumServiceBuilder builder = new AppiumServiceBuilder().withCapabilities(desiredCapabilities)
                        .withIPAddress(loadproperty.loadProperties().getProperty("AppiumServerIP"))
                        .usingPort(Integer.valueOf(loadproperty.loadProperties().getProperty("AppiumServerPort")).intValue());
                service = builder.build();
                service.start();
                driver = new AndroidDriver(service.getUrl(), clientCapabilities);
            }
        } catch (Exception e) {
            throw new Exception ("Error connecting to Appium service : " + e.getMessage());
        }
    }

    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }


}
