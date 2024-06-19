# Sistema de Gerenciamento de Funcionários em Java

Este projeto em Java é uma aplicação de linha de comando que gerencia uma lista de funcionários, oferecendo diversas funcionalidades como adição, remoção, atualização, agrupamento e relatórios sobre os dados dos funcionários.

## Funcionalidades Implementadas

- **Adicionar Funcionário**: Permite inserir novos funcionários na lista.
- **Remover Funcionário**: Remove um funcionário específico da lista.
- **Aumento de Salário**: Aplica um aumento de 10% nos salários de todos os funcionários.
- **Agrupamento por Função**: Agrupa os funcionários por função em um mapa.
- **Impressão de Aniversariantes**: Lista os funcionários que fazem aniversário em meses específicos.
- **Identificação do Funcionário Mais Velho**: Exibe o funcionário mais velho da lista.
- **Ordenação Alfabética**: Ordena os funcionários por nome.
- **Cálculo de Salários Mínimos**: Calcula quantos salários mínimos cada funcionário recebe, considerando um salário mínimo de R$1212.00.
- **Total dos Salários dos Funcionários**: Calcula e imprime o total dos salários dos funcionários.

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- **Pacote `model`**:
  - `Pessoa.java`: Classe base que define os atributos básicos de uma pessoa.
  - `Funcionario.java`: Classe que estende `Pessoa` e adiciona os atributos específicos de um funcionário como salário e função.

- **Pacote `services`**:
  - `FuncionarioService.java`: Contém a lógica de negócio para manipulação da lista de funcionários, incluindo métodos para adicionar, remover, calcular salários mínimos, aumentar salários, agrupar por função, entre outros.

- **Classe `Principal.java`**:
  - Contém o método `main` onde são instanciados os serviços e executadas as operações de gerenciamento dos funcionários.

## Requisitos

- Java Development Kit (JDK) 8 ou superior.

## Como Utilizar

1. Clone o repositório para sua máquina local:

   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git

2. Execute na sua IDE de preferência.
