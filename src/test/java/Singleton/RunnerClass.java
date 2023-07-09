package Singleton;

import io.appium.java_client.AppiumDriver;

public class RunnerClass {

    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        AppiumDriver driver = singletonClass.getDriver();
        driver.quit();

    }
}
