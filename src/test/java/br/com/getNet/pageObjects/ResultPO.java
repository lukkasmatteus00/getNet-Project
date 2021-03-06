package br.com.getNet.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.getNet.util.Util;

public class ResultPO {
    static WebElement element;
    public static void acionarLink(WebDriver driver, int interator){
        element = Util.encontrarElementoPorXPath(
                driver,
                "//a[@class='c-search-page__link'][" + interator + "]"
        );
        element.click();
    }

    public static String recuperarItemLink(WebDriver driver, int interator){
        element = Util.encontrarElementoPorCSSSelector(
                driver,
                ".c-search-page__link:nth-child(" + interator + ") > .c-search-page__result-title"
        );
        return element.getText();
    }

}
