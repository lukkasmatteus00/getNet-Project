package br.com.getNet.screen;

import org.openqa.selenium.support.PageFactory;

import br.com.getNet.config.ConfigDriver;


public class DefaultScreen {
	public DefaultScreen() {
		PageFactory.initElements(ConfigDriver.configurarDriver(), this);
	}

}
