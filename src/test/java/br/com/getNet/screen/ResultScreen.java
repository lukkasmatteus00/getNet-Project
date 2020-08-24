package br.com.getNet.screen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultScreen extends DefaultScreen {
	@FindBy(css = ".is-modal-open .o-modal__title")
	public WebElement getElement;
	
	@FindBy(xpath = "//h2[@class='c-search-page__title']")
	public WebElement resultados;		
}
