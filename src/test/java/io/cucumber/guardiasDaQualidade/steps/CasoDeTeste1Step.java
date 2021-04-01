package io.cucumber.guardiasDaQualidade.steps;

import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import io.cucumber.java.pt.*;
import io.cucumber.guardiasDaQualidade.servicos.Configuracao;

public class CasoDeTeste1Step extends Configuracao {

    @Entao("deve fechar a caixa de informacao")
    public void deve_fechar_a_caixa_de_informacao() {
        WebElement input = browser.findElement(
                By.cssSelector(".onetrust-close-btn-handler.onetrust-close-btn-ui.banner-close-button.ot-close-icon"));
        input.click();
        fechar();
    }

    @Dado("clico em configuracoes de cookie")
    public void clico_em_configuracoes_de_cookie() {
        browser.findElement(By.cssSelector(".cookie-setting-link")).click();
    }

    @Entao("devo ver o item de sua privacidade {string}")
    public void devo_ver_o_item_de_sua_privacidade(String string) {
        WebElement str0 = Configuracao.browser.findElement(By.cssSelector("#privacy-text"));
        assertEquals(string, str0.getText());
    }

    @Entao("devo ver Cookies estritamente necessarias {string}")
    public void devo_ver_Cookies_estritamente_necessarias(String string) {
        WebElement str1 = Configuracao.browser.findElement(By.cssSelector("#ot-header-id-1"));
        assertEquals(string, str1.getText());
    }

    @Entao("devo ver Cookies Analiticos de Primeira Parte {string}")
    public void devo_ver_Cookies_Analiticos_de_Primeira_Parte(String string) {
        WebElement str2 = Configuracao.browser.findElement(By.cssSelector("#ot-header-id-2"));
        assertEquals(string, str2.getText());
    }

    @Entao("devo ver Cookies de Desempenho e Cookies Funcionais {string}")
    public void devo_ver_Cookies_de_Desempenho_e_Cookies_Funcionais(String string) {
        WebElement str3 = Configuracao.browser.findElement(By.cssSelector("#ot-header-id-3"));
        assertEquals(string, str3.getText());
    }

    @Entao("devo ver Cookies de Publicidade e Redes Sociais {string}")
    public void devo_ver_Cookies_de_Publicidade_e_Redes_Sociais(String string) {
        WebElement str4 = Configuracao.browser.findElement(By.cssSelector("#ot-header-id-4"));
        assertEquals(string, str4.getText());
    }

    @Entao("clico no botao confirmar")
    public void clico_no_botao_confirmar() {
        WebElement botao = Configuracao.browser.findElement(By.cssSelector(
                "#onetrust-pc-sdk > div.ot-button-group-parent > div.ot-button-group > button.save-preference-btn-handler.onetrust-close-btn-handler"));
        botao.click();
        fechar();
    }
}