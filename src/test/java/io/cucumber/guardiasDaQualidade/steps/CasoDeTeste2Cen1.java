package io.cucumber.guardiasDaQualidade.steps;

import java.util.List;
import org.openqa.selenium.By;
import io.cucumber.guardiasDaQualidade.Servicos.Configuracao;
import io.cucumber.java.pt.Entao;
import static org.junit.Assert.assertNotEquals;

public class CasoDeTeste2Cen1 extends Configuracao {

    @Entao("devo ver os servicos")
    public void devo_ver_os_servicos(List<String> servicos) {
        for (int i = 0; i < servicos.size(); i++) {
            int elementos = browser.findElements(By.cssSelector("a[aria-label='" + servicos.get(i) + "']")).size();
            assertNotEquals(0, elementos);
        }
        fechar();
    }
}