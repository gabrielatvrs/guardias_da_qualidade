# language: pt

Funcionalidade: Acessar o site da accenture e aceitar os cookies do LGPD
Navegando no site da Accenture

Contexto: Acessar o site da Accenture
Dado que estou no site da accenture

Cenario: Aceitar o cookie LGPD
Entao deve fechar a caixa de informacao

Cenario: Configuracoes do cookie
E clico em configuracoes de cookie
Entao devo ver o item de sua privacidade "Sua privacidade"
E devo ver Cookies estritamente necessarias "Cookies estritamente necessárias"
E devo ver Cookies Analiticos de Primeira Parte "Cookies Analíticos de Primeira Parte"
E devo ver Cookies de Desempenho e Cookies Funcionais "Cookies de Desempenho e Cookies Funcionais"
E devo ver Cookies de Publicidade e Redes Sociais "Cookies de Publicidade e Redes Sociais"
Entao clico no botao confirmar