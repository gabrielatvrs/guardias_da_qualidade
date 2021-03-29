package io.cucumber.guardiasDaQualidade.steps;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.guardiasDaQualidade.Servicos.Configuracao;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class CasoDeTeste5 extends Configuracao {

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
}
