package io.cucumber.guardiasDaQualidade;

import static org.junit.Assert.assertNotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.pt.*;
/*a classe Configuracao está como import dentro de cada arquivo Steps  ->
Assim não precisamos declarar aquelas linhas do WebDriver e ChromeDriver*/
import io.cucumber.guardiasDaQualidade.Servicos.Configuracao; 

public class CasoDeTesteDoisSteps {

    @Dado("que eu estou na pagina do curso da gama academy curso")
    public void que_eu_estou_na_pagina_do_curso_da_gama_academy_curso() {
        Configuracao.abrir("https://pages.gama.academy/curso-de-product-management/");
        //ação abrir chama lá da classe Configuracao
    }

    @Quando("clico na opcao quero ir para o proximo nivel")
    public void clico_na_opcao_quero_ir_para_o_proximo_nivel() {
        WebElement botao = Configuracao.browser.findElement(By.xpath("//*[@id='lp-pom-button-849']"));
        botao.click();
    }

    @Entao("devo ver o valor e o botao comprar agora")
    public void devo_ver_o_valor_e_o_botao_comprar_agora() {
        Configuracao.abrir("https://pages.gama.academy/curso-de-product-management/");
        WebElement valorbotao = Configuracao.browser.findElement(By.id("lp-pom-box-882"));
        assertNotNull(valorbotao);
        Configuracao.fechar();
    }

    //Cenario Dois ->>->>->>->>->>->>->>->>

    @Dado("que eu estou no site da gama academy curso dev full stack")
    public void que_eu_estou_no_site_da_gama_academy_curso_dev_full_stack() {
        Configuracao.abrir("https://www.gama.academy/gama-experience/desenvolvimento-full-stack");
    }

    @Entao("devo ver as opcoes")
    public void devo_ver_as_opcoes(io.cucumber.datatable.DataTable dataTable) {
        Configuracao.browser.findElements(By.cssSelector(".w-dyn-list"));
        Configuracao.fechar();
        
    }

}