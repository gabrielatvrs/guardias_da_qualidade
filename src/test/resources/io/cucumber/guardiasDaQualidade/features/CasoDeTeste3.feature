#language: pt

Funcionalidade: Acessar a lista de carreiras e vaga de Desenvolvedor da accenture
  Navegando no site da Accenture

Contexto: Acessar o site da Accenture
  Dado que estou no site da accenture

Cenario: Acessar o item de vagas de tecnologia
  E fecho a autorizacao de cookie
  E clico no menu carreiras
  E clico no item do menu vagas em tecnologia
  Entao devo ver o destaque em "Carreiras em tecnologia"

Cenario: Procurando uma vaga de Desenvolvedor
  E clico no simbolo de lupa
  E digito no campo de busca "desenvolvedor"
  E clico no botao buscar
  Entao devo encontrar vagas para programadores