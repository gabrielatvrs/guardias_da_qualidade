package io.cucumber.guardiasDaQualidade.steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import io.cucumber.java.pt.*;

import io.cucumber.guardiasDaQualidade.servicos.Configuracao;

public class CasoDeTeste1 extends Configuracao {

    @Entao("deve fechar a caixa de informacao")
    public void deve_fechar_a_caixa_de_informacao() {
		WebElement input = browser.findElement(By.cssSelector(".onetrust-close-btn-handler.onetrust-close-btn-ui.banner-close-button.ot-close-icon"));
		input.click();
		Configuracao.fechar();
	}

    @Quando("clico em {string}")
	public void clico_em(String string) {
		WebElement cookies = browser.findElement(By.cssSelector(".cookie-setting-link"));
		cookies.click();
	}

    @Entao("devo ver o item de {string}")
    public void devo_ver_o_item_de(String string) {
        browser.findElements(By.cssSelector(".ot-sdk-eight.ot-sdk-columns.description-container"));    
    }

    @Entao("devo ver as opcoes")
    public void devo_ver_as_opcoes(io.cucumber.datatable.DataTable dataTable) {
        Configuracao.browser.findElements(By.cssSelector(".ot-main-content.pc-content"));
        Configuracao.fechar();
    }
}
