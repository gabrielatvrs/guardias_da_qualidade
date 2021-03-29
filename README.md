## Automação de testes com Selenium e Cucumber 

Utilizando o site da *Accenture* 

- 4 casos de testes;
- 7 cenários

#### Tecnologias utilizadas

**Selenium**: interagir com os elementos web da página

**Junit**: testar o software em Java

**Cucumber**: escrever os teste em linguagem mais humana e BDD

**Java**: linguagem de programação

**Maven**: para gerenciamento de dependências

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



