## Time: Guardiãs da Qualidade

Integrantes: <br>
<ul>
    <li> Amanda Barral </li>
    https://github.com/AmandaBarral
    <li> Eliete Miranda </li>
    https://github.com/elietemiranda
    <li> Gabriela Tavares </li>
    https://github.com/gasatabi
    <li> Jacqueline Carriel </li>
    https://github.com/midorinoo
    <li> Jéssika Gomes </li>
    https://github.com/jessikagomes
    <li> Mariana Caetano </li>
    https://github.com/Mariana-Caetano
    <li> Renata Moreira </li>
    https://github.com/renatamoreir4
</ul>

## Desafio: Automação de testes utilizando Selenium e Cucumber 

Utilizando o site da *Accenture* 

- 4 casos de testes
- 7 cenários

#### Tecnologias utilizadas:

**Selenium**: Framework responsável por fazer a integração do código Java com a linguagem Gherkin (Cucumber), abrindo o browser e realizando os testes de comportamento

**Junit**: testar o software em Java

**Cucumber**: Framework responsável por traduzir uma linguagem humana em código Java

**Java**: Linguagem de programação utilizada

**Maven**: Gerenciador das dependências para o Java

**Visual Studio Code**: IDE para implementação do projeto 

#### Extensões na IDE:

Java Extension Pack | Cucumber (Gherkin) | Cuke Step Definition Generator | Language support for Java

### Caso de teste 1: Acessar o site da accenture e aceitar os cookies do LGPD

Cenário: Aceitar o cookie LGPD<br>
    Dado que eu estou no site da accenture<br>
    E aceito os termos LGPD<br>
    Então deve fechar a caixa de informação<br><br>

Cenário: Configurações do cookie<br>
    Dado que eu estou no site da accenture<br>
    E aceito os termos LGPD<br>
    E clico em configurações de cookie<br>
    Então devo ver o item de "sua privacidade"<br>
    E devo ver "Cookies estritamente necessárias"<br>
    E devo ver "Cookies Analíticos de Primeira Parte"<br>
    E devo ver "Cookies de Desempenho e Cookies Funcionais"<br>
    E devo ver "Cookies de Publicidade e Redes Sociais"<br>

### Caso de teste 2: Acessar o site da accenture a mostrar a lista de serviços

Cenário: Listar serviços da Accenture<br>
    Dado que eu estou no site da accenture<br>
    E clico no menu serviços<br>
    Então devo ver os serviços abaixo<br>
    | Accenture Strategy |<br>
    | Application Services |<br>
    | Artificial Intelligence |<br>
    | Automation |<br>
    | Business Process Services |<br>
    | Change Management |<br>
    | Cloud |<br>
    | Customer Experience |<br>
    | Data & Analytics |<br>
    | Ecosystem Partners |<br>
    | Finance Consulting |<br>
    | Industry X |<br>
    | Infrastructure |<br>
    | Marketing |<br>
    | Mergers & Acquisitions (M&A) |<br>
    | Operating Models |<br>
    | Security |<br>
    | Supply Chain Management |<br>
    | Sustainability |<br>
    | Technology Consulting |<br>
    | Technology Innovation |<br>
    | Zero Based Budgeting (ZBB) |<br>

Cenário: Clicar no serviço cloud<br>
    Dado que eu estou no site da accenture<br>
    E clico no menu serviços<br>
    E clico no item do menu cloud<br>
    Então devo encontrar o título "Serviços de Cloud"<br>

### Caso de teste 3: Acessar a lista de carreiras da accenture

Cenário: Acessar o item de vagas de tecnologia<br>
    Dado que eu estou no site da accenture<br>
    E clico no menu carreiras<br>
    E clico no item do menu vagas em tecnologia<br>
    Então devo ver o destaque em "Carreiras em Tecnologia"<br>

Cenário: Procurando uma vaga<br>
    Dado que eu estou no site da accenture<br>
    E digito no campo de busca "desenvolvedor"<br>
    E clico no botão procurar<br>
    Então devo encontrar vagas para programadores<br>

### Caso de teste 4: Sobre a accenture

Cenário: Ver as características da accenture<br>
    Dado que eu estou no site da accenture<br>
    E clico no menu sobre a accenture<br>
    E clico no item do menu sobre a accenture<br>
    Então devo ver o destaque em "Nosso propósito"<br>

### Como utilizar:
- Pré requisitos:

Instalar o Java: https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR

Intalar o jdk: https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html


- Clone do projeto: 
```bash
git clone https://github.com/gasatabi/GuardiasDaQualidade.git
```

- Entrando na pasta do projeto: 
```bash
cd GuardiasDaQualidade-master
```

- Configurando Selenium no computador:<br>
Fazer o download do Chrome Web Driver e adiconar o arquivo (descompactado) dentro da pasta "driver" na raíz do projeto<br>https://chromedriver.chromium.org/downloads<br>
<br>Exemplo:<br>

<ul>
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
</ul>

- Limpando e validando Maven (Unix):
```bash
./mvnw clean
```

- Limpando e validando Maven (Windows):
```bash
mvnw.cmd clean
```

- Executando teste no Unix:
```bash
./test.sh
```

- Executando teste no Windows:
```bash
test.bat
```

## Estrutura de arquivos

<pre>
    driver <br>
        |-- chromedriver<br> -- Arquivo Selenium WebDriver. 
        Substitua este arquivo com a versão da sua máquina.
    mvwn<br>
    mvnw.cmd
    pom.xml
    src
        |-- test
        |  |-- java
        |  |  |-- io
        |  |  |  |-- cucumber
        |  |  |  |  |-- guardiasDaQualidade
        |  |  |  |  |  |-- contexts
        |  |  |  |  |  |  |-- ContextoBasico.java -- Arquivo que especifica o contexto comum aos casos de testes

        |  |  |  |  |  |-- servicos
        |  |  |  |  |  |  |-- Configuracao.java -- Arquivo que especifica as ações do browser

        |  |  |  |  |  |-- steps
        |  |  |  |  |  |  |-- CasoDeTeste1.java
        |  |  |  |  |  |  |-- CasoDeTeste2.java
        |  |  |  |  |  |  |-- CasoDeTeste3.java
        |  |  |  |  |  |  |-- CasoDeTeste4.java

        |  |  |  |  |  |-- RunCucumberTest.java -- Arquivo que configura a inicialização do Java test

    |  |-- resources
    |  |  |-- io
    |  |  |  |-- cucumber
    |  |  |  |  |-- guardiasDaQualidade
    |  |  |  |  |  |-- features -- Gherkin com os casos de teste de acordo com a especificação do cliente

    test.bat -- Arquivo para rodar teste no Windows

    test.sh -- Arquivo para rodar teste no Unix