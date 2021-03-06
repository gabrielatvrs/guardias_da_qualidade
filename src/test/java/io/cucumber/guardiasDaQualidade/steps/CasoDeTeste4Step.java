package io.cucumber.guardiasDaQualidade.steps;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.guardiasDaQualidade.servicos.Configuracao;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class CasoDeTeste4Step extends Configuracao {

    @Dado("clico no menu sobre a accenture")
    public void clico_no_menu_sobre_a_accenture() {
        WebElement span = browser.findElement(By.cssSelector("div#navigation-menu > div:nth-of-type(5) > div > span"));
        span.click();
    }

    @Dado("clico no item do menu sobre accenture")
    public void clico_no_item_do_menu_sobre_accenture() throws InterruptedException {
        WebElement a = browser
                .findElement(By.cssSelector("div#primaryLink5_SobreaAccenture > div > div > ul > li > ul > li > a"));
        Thread.sleep(5000);
        a.click();
    }

    @Entao("devo ver destaque em {string}")
    public void devo_ver_destaque_em(String string) {
        WebElement input = Configuracao.browser.findElement(By.cssSelector(
                "div#block-section-1 > div > div > div > div > div > div:nth-of-type(3) > div > div > div > div > h3"));
        assertEquals(string, input.getText());
        Configuracao.fechar();
    }
}
