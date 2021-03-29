package io.cucumber.guardiasDaQualidade.steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.guardiasDaQualidade.servicos.Configuracao;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class CasoDeTeste3 extends Configuracao {

    @Dado("fecho a autorizacao de cookie")
    public void fecho_a_autorizacao_de_cookie() {
        WebElement cookie = browser.findElement(
                By.cssSelector(".onetrust-close-btn-handler.onetrust-close-btn-ui.banner-close-button.ot-close-icon"));
        cookie.click();
    }

    @Dado("clico no menu carreiras")
    public void clico_no_menu_carreiras() {
        WebElement carreiras = browser
                .findElement(By.cssSelector("div:nth-of-type(4) > div[role='menuitem'] > .nav-submenu-label-text"));
        carreiras.click();
    }

    @Dado("clico no item do menu vagas em tecnologia")
    public void clico_no_item_do_menu_vagas_em_tecnologia() {
        WebDriverWait espera = new WebDriverWait(browser, 2);
        WebElement tecnologia = browser.findElement(By.cssSelector("a[aria-label='Vagas em tecnologia']"));
        espera.until(ExpectedConditions.elementToBeClickable(tecnologia));
        tecnologia.click();
    }

    @Entao("devo ver o destaque em {string}")
    public void devo_ver_o_destaque_em(String string) {
        WebElement titulo = browser.findElement(By.cssSelector("h1.area-of-interest-title"));
        assertEquals(string, titulo.getText());
        fechar();
    }

    @Dado("clico no simbolo de lupa")
    public void clico_no_simbolo_de_lupa() {
        WebElement a = browser.findElement(By.cssSelector(".ion-ios-search.serp"));
        a.click();
    }

    @Dado("digito no campo de busca {string}")
    public void digito_no_campo_de_busca(String string) {
        WebElement input = browser.findElement(By.cssSelector("#search-form-label"));
        input.sendKeys(string);
    }

    @Dado("clico no botao buscar")
    public void clico_no_botao_buscar() {
        WebElement button = browser.findElement(By.cssSelector(".btn.btn-primary.col-xs-2"));
        button.click();
    }

    @Entao("devo encontrar vagas para programadores")
    public void devo_encontrar_vagas_para_programadores() {
        WebElement desenvolvedor = browser.findElement(By.cssSelector(".results-for-keyword"));
        fechar();
    }
}
