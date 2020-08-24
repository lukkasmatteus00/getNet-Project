package br.com.getNet.steps;

import org.openqa.selenium.JavascriptExecutor;

import br.com.getNet.pageObjects.ResultPO;
import br.com.getNet.screen.LandingScreen;
import br.com.getNet.screen.ResultScreen;
import br.com.getNet.util.DSL;
import br.com.getNet.util.Util;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class StepDefinitionRealizarPesquisa extends DSL {
	LandingScreen landingScreen;
	ResultScreen resultScreen;

	public StepDefinitionRealizarPesquisa() {
		super();
	}

	@Dado("que desejo acessar o site")
	public void queDesejoAcessarOSite() {
		try {
			landingScreen = new LandingScreen();
			resultScreen = new ResultScreen();
			
			navegar("https://site.getnet.com.br/");

		} catch (Exception e) {
			Util.seAlgoDeuErrado(e);
		}

	}

	@Quando("acionar o campo de busca")
	public void acionarOCampoDeBusca() {
		try {
			aguardarElemento(landingScreen.logo);
			aguardarElemento(landingScreen.footer);
			aguardarElemento(landingScreen.acionarCampoBuscar);
			clicarElemento(landingScreen.acionarCampoBuscar);
		} catch (Exception e) {
			Util.seAlgoDeuErrado(e);
		}
	}

	@Então("informar {string} e aciono o botao pesquisar")
	public void informarValorPesquisaEAcionoOBotaoPesquisar(String valorPesquisa) {
		try {
			preencherCampo(landingScreen.inputCampoBuscar, valorPesquisa);
			clicarElemento(landingScreen.acionarBotaoProcurar);
		} catch (Exception e) {
			Util.seAlgoDeuErrado(e);
		}
	}

	@Então("no resultado da busca, clico no link {string}")
	public void noResultadoDaBuscaClicoNoLinkValorResultado(String valorResultado) {
		try {
			aguardarElemento(resultScreen.resultados);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,100)");

			String getElement = "";
			int interator = 3;

			do {
				getElement = ResultPO.recuperarItemLink(driver, interator);
				if (!valorResultado.equals(getElement))
					interator++;
			} while (!valorResultado.equals(getElement));

			ResultPO.acionarLink(driver, interator - 2);
		} catch (Exception e) {
			Util.seAlgoDeuErrado(e);
		}
	}

	@Então("verifico se a modal foi aberta com a mensagem {string}")
	public void verificoSeAModalFoiAbertaComAMensagemValorResultado(String valorResultado) {
		try {
			aguardarElemento(resultScreen.getElement);
			Util.checarValores(valorResultado, obterTexto(resultScreen.getElement));
		} catch (Exception e) {
			Util.seAlgoDeuErrado(e);
		}
	}
}
