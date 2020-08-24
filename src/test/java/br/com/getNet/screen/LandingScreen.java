package br.com.getNet.screen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingScreen extends DefaultScreen{
	@FindBy(css = ".c-mobile-header-item__text:nth-child(1)")
	public WebElement acionarCampoBuscar;
	
	@FindBy(xpath = "//div[@class='c-brand']//a//img")
	public WebElement logo;
	
	@FindBy(xpath = "//input[@class='c-search-box__input'][@id='global-search-input']")
	public WebElement inputCampoBuscar;
	
	@FindBy(xpath = "//button[@class='o-btn o-btn--cor-roxo-borda c-search-box__button']")
	public WebElement acionarBotaoProcurar;
}
