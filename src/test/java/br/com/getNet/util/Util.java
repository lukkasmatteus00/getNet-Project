package br.com.getNet.util;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.text.Normalizer;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.getNet.config.ConfigDriver;

/**
 Tem como objetivo criar metodos que será que auxiliaram toda a estrutura do projeto
 **/
public class Util {
    public static Util esperar(int tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Util();
    }

    public static String removerAcentos(String str) {
        String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(nfdNormalizedString).replaceAll("");
    }

    public static String retornaPathChromeDriver(){
        return new File("src\\test\\resources\\driver\\chromedriver.exe").getAbsolutePath();
    }

    public static void checarValores(String valorEsperado, String valorObtido){
        assertEquals(
                Util.removerAcentos(valorEsperado),
                Util.removerAcentos(valorObtido)
        );
    }

    public static WebElement encontrarElementoPorXPath(WebDriver driver, String xpath){
        return driver.findElement(By.xpath(xpath));
    }
    
    public static WebElement encontrarElementoPorCSSSelector(WebDriver driver, String css){
        return driver.findElement(By.cssSelector(css));
    }
    
    public static void seAlgoDeuErrado(Exception e) {
    	System.out.println("Algo deu errado" + e.getMessage());
		ConfigDriver.finalizarDriver();
		fail("Foi lançado alguma exceção durante o teste!!!");
    }
}

