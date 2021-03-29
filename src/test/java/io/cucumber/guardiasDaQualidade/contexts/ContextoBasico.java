package io.cucumber.guardiasDaQualidade.contexts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.guardiasDaQualidade.Servicos.Configuracao;
import io.cucumber.java.pt.Dado;

public class ContextoBasico extends Configuracao {

    @Dado("que estou no site da accenture")
    public void que_estou_no_site_da_accenture() {
        abrir("https://www.accenture.com/br-pt");
        browser.manage().window().maximize();
    }

    @Dado("clico no menu servicos")
    public void clico_no_menu_servicos() {
        WebElement servicos = browser.findElement(By.cssSelector("div[data-target='#primaryLink2_Servios']"));
        servicos.click();
    }
}
