package br.com.getNet.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import br.com.getNet.config.ConfigDriver;
import br.com.getNet.page.LandingPage;
import br.com.getNet.page.ResultPage;
import br.com.getNet.util.Util;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class StepDefinitionRealizarPesquisa {
    private  WebDriver driver;
    @Dado("que desejo acessar o site")
    public void queDesejoAcessarOSite() {
    	try {
    		driver = ConfigDriver.configurar();
            Util.openSite(driver, "https://site.getnet.com.br/");
            Util.esperar(10000);
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
		} catch (Exception e) {
			Util.seAlgoDeuErrado(driver, e);
		}
        
    }

    @Quando("acionar o campo de busca")
    public void acionarOCampoDeBusca() {
        try {	
    		LandingPage.acionarCampoBuscar(driver);
	    } catch (Exception e) {
	    	Util.seAlgoDeuErrado(driver, e);
		}
    }

    @Então("informar {string} e aciono o botao pesquisar")
    public void informarValorPesquisaEAcionoOBotaoPesquisar(String valorPesquisa) {
    	try {
    		LandingPage.inputCampoBuscar(driver, valorPesquisa);
    		LandingPage.acionarBotãoProcurar(driver);
    	} catch (Exception e) {
    		Util.seAlgoDeuErrado(driver, e);
		}
    }

    @Então("no resultado da busca, clico no link {string}")
    public void noResultadoDaBuscaClicoNoLinkValorResultado(String valorResultado) {
    	try {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	js.executeScript("window.scrollTo(0,100)");
	    	
	    	String getElement = "";
	    	int interator = 3;
	    	
	    	do {
	    		getElement = ResultPage.recuperarItemLink(driver, interator);
	    		if (!valorResultado.equals(getElement))
	    			interator ++;
	    	}while(!valorResultado.equals(getElement));
	
	    	ResultPage.acionarLink(driver, interator-2);
    	} catch (Exception e) {
    		Util.seAlgoDeuErrado(driver, e);
		}
    }

    @Então("verifico se a modal foi aberta com a mensagem {string}")
    public void verificoSeAModalFoiAbertaComAMensagemValorResultado(String valorResultado) {
        try {		
        	Util.checarValores(valorResultado, ResultPage.getElement(driver));
        	Util.closeSite(driver);
        } catch (Exception e) {
        	Util.seAlgoDeuErrado(driver, e);
		}
    }
}
