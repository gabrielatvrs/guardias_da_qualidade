package io.cucumber.guardiasDaQualidade;

import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import io.cucumber.java.pt.*;
/*a classe Configuracao está como import dentro de cada arquivo Steps  ->
Assim não precisamos declarar aquelas linhas do WebDriver e ChromeDriver*/
import io.cucumber.guardiasDaQualidade.Servicos.Configuracao;


public class CasoDeTesteUmSteps {

	@Dado("que eu estou no site da gama academy")
	public void que_eu_estou_no_site_da_gama_academy() {
		Configuracao.abrir("https://www.gama.academy/");
		 //ação abrir chama lá da classe Configuracao
	}	

	@Quando("clico na opcao {string}")
	public void clico_na_opcao(String quemsomosString) {
		WebElement quemsomos = Configuracao.browser.findElement(By.cssSelector(".nav-link"));
		quemsomos.click();
	}

	@Entao("deve ver o item do {string}")
	public void deve_ver_o_item_do(String string) {
		WebElement input = Configuracao.browser.findElement(By.cssSelector(".manifesto h1.heading.lado"));
		assertEquals(string, input.getText());
		Configuracao.fechar();
	}

}
