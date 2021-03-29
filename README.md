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

- 4 casos de testes;
- 7 cenários

#### Tecnologias utilizadas:

**Selenium**: Framework responsável por fazer a integração do código Java com a linguagem Gherkin(Cucumber), abrindo o browser e realizando os testes de comportamento

**Junit**: testar o software em Java

**Cucumber**: Framework responsável por traduzir uma linguagem humana em código Java

**Java**: Linguagem de programação utilizada

**Maven**: Gerenciador das dependências para o Java

**Visual Studio Code**: IDE para implementação do projeto 

#### Extensões na IDE:

Java Extension Pack | Cucumber (Gherkin) | Cuke Step Definition Generator | Language support for Java

## Caso de teste 1: Acessar o site da accenture e aceitar os cookies do LGPD

Cenário: Aceitar o cookie LGPD
dado que eu estou no site da accenture
e aceito os termos LGPD
Então deve fechar a caixa de informação

Cenário: Configurações do cookie
dado que eu estou no site da accenture
e aceito os termos LGPD
e clico em configurações de cookie
Então devo ver o item de "sua privacidade"
E devo ver "Cookies estritamente necessárias"
e devo ver "Cookies Analíticos de Primeira Parte"
e devo ver "Cookies de Desempenho e Cookies Funcionais"
e devo ver "Cookies de Publicidade e Redes Sociais"

## Caso de teste 2: Acessar o site da accenture a mostrar a lista de serviços

Cenário: listar serviços da Accenture
dado que eu estou no site da accenture
e clico no menu serviços
Então devo ver os serviços abaixo
| Accenture Strategy |
| Application Services |
| Artificial Intelligence |
| Automation |
| Business Process Services |
| Change Management |
| Cloud |
| Customer Experience |
| Data & Analytics |
| Ecosystem Partners |
| Finance Consulting |
| Industry X |
| Infrastructure |
| Marketing |
| Mergers & Acquisitions (M&A) |
| Operating Models |
| Security |
| Supply Chain Management |
| Sustainability |
| Technology Consulting |
| Technology Innovation |
| Zero Based Budgeting (ZBB) |

Cenário: Clicar no serviço cloud
dado que eu estou no site da accenture
e clico no menu serviços
e clico no item do menu cloud
Então devo encontrar o título "Serviços de Cloud"

## Caso de teste 3: Acessar a lista de carreiras da accenture

Cenário: Acessar o item de vagas de tecnologia
dado que eu estou no site da accenture
e clico no menu carreiras
e clico no item do menu vagas em tecnologia
Então devo ver o destaque em "Carreiras em Tecnologia"

Cenário: Procurando uma vaga
dado que eu estou no site da accenture
e digito no campo de busca "desenvolvedor"
e clico no botão procurar
Então devo encontrar vagas para programadores

## Caso de teste 4: Sobre a accenture

Cenário: Ver as características da accenture
dado que eu estou no site da accenture
e clico no menu sobre a accenture
e clico no item do menu sobre a accenture
Então devo ver o destaque em "Nosso propósito"

## Como utilizar:

- Clone do projeto: 
```bash
git clone https://github.com/gasatabi/GuardiasDaQualidade.git
```
- Entrando na pasta do projeto: 
```bash
cd GuardiasDaQualidade-master
```

- Limpando e validando Maven (Unix):
```bash
./mvnw clean
```

- Limpando e validando Maven (Windows):
```bash
mvnw.cmd clean
```


