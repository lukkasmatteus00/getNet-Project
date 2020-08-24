package br.com.getNet.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.getNet.util.Util;


public final class ConfigDriver {
	static WebDriver driver;

	public static WebDriver configurarDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", Util.retornaPathChromeDriver());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}
		return driver;
	}

	public static void finalizarDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
