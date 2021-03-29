# language: pt

Funcionalidade: Acessar o site da Accenture a mostrar a lista de servicos
Projeto final da Accademia Accenture - QA

Contexto: Acessar o menu de servicos no site da Accenture
Dado que estou no site da accenture
E clico no menu servicos

Cenario: Listar servicos da Accenture
      Entao devo ver os servicos
      | Accenture Strategy           |
      | Application Services         |
      | Artificial Intelligence      |
      | Automation                   |
      | Business Process Services    |
      | Change Management            |
      | Cloud                        |
      | Customer Experience          |
      | Data & Analytics             |
      | Ecosystem Partners           |
      | Finance Consulting           |
      | Industry X                   |
      | Infrastructure               |
      | Marketing                    |
      | Mergers & Acquisitions (M&A) |
      | Operating Models             |
      | Security                     |
      | Supply Chain Management      |
      | Sustainability               |
      | Technology Consulting        |
      | Technology Innovation        |
      | Zero Based Budgeting (ZBB)   |

Cenario: Clicar no servico cloud
E clico no item do menu cloud
Entao devo encontrar o titulo "Serviços de Cloud"