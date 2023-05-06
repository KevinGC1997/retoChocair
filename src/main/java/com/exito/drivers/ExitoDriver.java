package com.exito.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExitoDriver {

    public static WebDriver driver;

    public static ExitoDriver ChromeDriverExito(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--no-sandbox --test-type");
        options.addArguments("--disable-popup-blocking --disable-download-notification --start-maximized --test-type --ignore-certificate-errors --allow-running-insecure-content --disable-translate --always-authorize-plugins --disable-extensions --disable-dev-shm-usage");

        driver = new ChromeDriver(options);
        return new ExitoDriver();
    }
    public static WebDriver on(String url) {
        driver.get(url);
        return driver;
    }

}
