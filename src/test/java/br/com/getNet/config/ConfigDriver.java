package br.com.getNet.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.getNet.util.Util;

public class ConfigDriver {
    public static WebDriver configurar() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", Util.retornaPathChromeDriver());
        driver = new ChromeDriver();
        driver.manage()
                .window()
                .maximize();
        return driver;
    }
}
