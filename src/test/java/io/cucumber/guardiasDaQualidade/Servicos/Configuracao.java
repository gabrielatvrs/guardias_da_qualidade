package io.cucumber.guardiasDaQualidade.Servicos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Configuração do Chromedriver
Instanciando WebDriver browser 
*/

public class Configuracao {
  
    public static WebDriver browser; //Objeto browser da classe WebDriver
    
    public static void abrir(String url){
      /*Lógica: Se o navegador estiver "null/vazio"
                  Configura chromedriver
                  Instacia browser 
      */          
      if(browser == null){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        browser = new ChromeDriver();
      }
  
      browser.get(url); //browser chama uma url como parametro
    }
  
    public static void fechar(){
      browser.close();
      browser = null; //volta o navegador para a posição null
    }
  /*
Sempre que for usar o browser, ele está dentro da classe Configuração, 
então coloca ponto e chama as ações que estão nele: 
.browser  .fechar   .abrir
 */
  }