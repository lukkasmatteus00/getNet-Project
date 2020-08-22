package br.com.getNet.runners;

import com.codeborne.selenide.junit.TextReport;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags            = "@PequisarSuperget",
        plugin          = {"pretty","html: cucumber-html-reports"},
        features        = "src/test/resources/features/",
        glue            = {"br.com.getNet.steps"}
        )

public class RunPesquisaGetNet {
        @Rule
        public TestRule report = new TextReport().onFailedTest(true).onSucceededTest(true);
        
}
