package br.com.getNet.util;


import static br.com.getNet.config.ConfigDriver.configurarDriver;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class DSL {

	protected WebDriver driver;
	protected static Wait<WebDriver> wait;

	public DSL() {
		this.driver = configurarDriver();
		wait = new FluentWait<WebDriver>(configurarDriver()).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(100)).ignoring(NoSuchElementException.class, WebDriverException.class);

	}

	protected WebElement aguardarElemento(WebElement elemento) {
		return wait.until(ExpectedConditions.elementToBeClickable(elemento));
	}

	protected static void navegar(String url) {
		configurarDriver().navigate().to(url);
	}

	protected void preencherCampo(WebElement elemento, String texto) {
		aguardarElemento(elemento).clear();
		elemento.sendKeys(texto);
	}
	
	protected void clicarElemento(WebElement elemento) {
		aguardarElemento(elemento).click();
	}

	protected String obterTexto(WebElement elemento) {
		return elemento.getText();
	}
}

