package Singleton;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Platform;

import java.net.URL;
import java.time.Duration;

public class SingletonClass {

    /* Declare static reference variables of the class */
    private static SingletonClass instance = null;
    private AppiumDriver driver;
    private final UiAutomator2Options androidOptions = new UiAutomator2Options();

    /**
     * Declaring constructor as private to restrict object creation outside of class
     **/
    private SingletonClass() {
        try {
            androidOptions.setPlatformName(Platform.ANDROID.name())
                    .setPlatformVersion("13.0")
                    .setAutomationName("UiAutomator2")
                    //.setApp(System.getProperty("user.dir") + "/src/main/resources/ApiDemos-debug.apk")
                    //.setAppPackage("io.appium.android.apis")
                    //.setAppActivity(".ApiDemos")
                    .setAvd("Pixel_3a")
                    .setDeviceName("emulator-5554")
                    .setFullReset(false)
                    .setNewCommandTimeout(Duration.ofSeconds(30))
                    .autoGrantPermissions();
            URL url = new URL("http://0.0.0.0:4723/");
            driver = new AndroidDriver(url, androidOptions);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /**
     * Declare a static method with return type as object of class which should check if class is already instantiated once.
     *
     * @return
     */
    public static SingletonClass getInstance() {
        if (instance == null) {
            System.out.println("New Driver Initialised");
            instance = new SingletonClass();
        } else {
            System.out.println("Driver Already Initialised");
        }
        return instance;
    }

    public AppiumDriver getDriver() {
        return driver;
    }


}
