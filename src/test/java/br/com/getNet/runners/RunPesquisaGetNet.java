package br.com.getNet.runners;

import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;

import com.codeborne.selenide.junit.TextReport;

import br.com.getNet.config.ConfigDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags            = "@PequisarSuperget",
        plugin          = {"pretty","html: cucumber-html-reports"},
        features        = "src/test/resources/features/",
        glue            = {"br.com.getNet.steps"}
        )

public class RunPesquisaGetNet{
        @Rule
        public TestRule report = new TextReport().onFailedTest(true).onSucceededTest(true);

        @AfterClass
        public static void tearDown() {
        	ConfigDriver.finalizarDriver();
        }
}
