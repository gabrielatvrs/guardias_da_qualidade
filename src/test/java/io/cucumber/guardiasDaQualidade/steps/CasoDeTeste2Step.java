package io.cucumber.guardiasDaQualidade.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.guardiasDaQualidade.servicos.Configuracao;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class CasoDeTeste2Step extends Configuracao {

    @Entao("devo ver os servicos")
    public void devo_ver_os_servicos(List<String> servicos) {
        for (int i = 0; i < servicos.size(); i++) {
            int elementos = browser.findElements(By.cssSelector("a[aria-label='" + servicos.get(i) + "']")).size();
            assertNotEquals(0, elementos);
        }
        fechar();
    }

    @Dado("clico no item do menu cloud")
    public void clico_no_item_do_menu_cloud() {
        By cloudSelector = By.cssSelector("#primaryLink2_Servios > div > div > ul > li:nth-child(7) > a");

        WebDriverWait espera = new WebDriverWait(browser, 5);
        espera.until(ExpectedConditions.visibilityOfElementLocated(cloudSelector));

        WebElement cloud = browser.findElement(cloudSelector);
        cloud.click();
    }

    @Entao("devo encontrar o titulo {string}")
    public void devo_encontrar_o_titulo(String string) {
        WebElement titulo = browser.findElement(By.cssSelector("#full-width-text-container h1.page-title"));
        assertEquals(string, titulo.getText());
        fechar();
    }
}
