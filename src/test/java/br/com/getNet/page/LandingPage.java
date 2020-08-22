package br.com.getNet.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.getNet.util.Util;

public class LandingPage {
    static WebElement element;
     public static void acionarCampoBuscar(WebDriver driver){
    	 element = Util.encontrarElementoPorCSSSelector(driver,
        		".c-mobile-header-item__text:nth-child(1)"
        );
         element.click();
    }

    public static void inputCampoBuscar(WebDriver driver, String busca){
        element = Util.encontrarElementoPorXPath(
                driver,
                "//input[@class='c-search-box__input']"
                        + "[@id='global-search-input']"
        );
        element.sendKeys(busca);
    }
    public static void acionarBotãoProcurar(WebDriver driver){
        element = Util.encontrarElementoPorXPath(
                driver,
                "//button[@class='o-btn o-btn--cor-roxo-borda c-search-box__button']"
        );
        element.click();
    }
}
