# language: pt

Funcionalidade: Acessar o site da accenture e aceitar os cookies do LGPD
Navegando no site da Accenture

Contexto: Acessar o site da Accenture
Dado que estou no site da accenture

Cenario: Aceitar o cookie LGPD
Entao deve fechar a caixa de informacao

Cenario: Configuracoes do cookie
E clico em "configuracao dos cookies"
Entao devo ver o item de "sua privacidade"
E devo ver as opcoes
| Cookies estritamente necessárias           |
| Cookies Analíticos de Primeira Parte       |
| Cookies de Desempenho e Cookies Funcionais |
| Cookies de Publicidade e Redes Sociais     |