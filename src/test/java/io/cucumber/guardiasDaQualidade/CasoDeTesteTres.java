package io.cucumber.guardiasDaQualidade;

import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.By;
import io.cucumber.java.pt.*;
import io.cucumber.guardiasDaQualidade.Servicos.Configuracao;
import static org.junit.Assert.assertNotEquals;

public class CasoDeTesteTres extends Configuracao {

    @Dado("que eu estou no site da Accenture")
    public void que_eu_estou_no_site_da_Accenture() {
        abrir("https://www.accenture.com/br-pt?c=acn_glb_brandexpressiongoogle_11608449&n=psgs_1020&gclsrc=ds");
        browser.manage().window().maximize();
    }

    @Dado("clico no menu de servicos")
    public void clico_no_menu_de_servicos() {
        WebElement servicos = browser.findElement(By.cssSelector("div[data-target='#primaryLink2_Servios']"));
        servicos.click();
    }

    @Entao("devo ver os servicos")
    public void devo_ver_os_servicos(List<String> servicos) {
        for (int i = 0; i < servicos.size(); i++) {
            int elementos = browser.findElements(By.cssSelector("a[aria-label='" + servicos.get(i) + "']")).size();
            assertNotEquals(0, elementos);
        }
        fechar();
    }
}