# Sistema de Locação de Carros

## Descrição

Imagine que você está planejando alugar um carro para uma viagem. Para facilitar esse processo, uma empresa de locação de carros desenvolveu um sistema com diferentes comportamentos, dependendo das circunstâncias da locação e do cliente.

Inicialmente, considere um cliente que deseja alugar um carro de luxo. Se esse cliente realizar a reserva com antecedência de pelo menos uma semana, o sistema deve oferecer um desconto especial no valor total da locação. Por outro lado, suponha um cliente que necessita alugar um carro utilitário de última hora, sem qualquer reserva prévia. Nesse caso, o sistema deve ainda conseguir encontrar um veículo disponível e processar a locação rapidamente, mesmo que isso implique em um custo um pouco mais elevado devido à demanda urgente.

Esses cenários exemplificam como o sistema de locação de carros responde às diferentes necessidades e condições dos clientes, adaptando-se para garantir uma experiência satisfatória de locação, seja para reservas antecipadas ou demandas de última hora.

## Pré-requisitos

- **Linguagem**: Java
- **Bibliotecas**: Cucumber para BDD, JUnit para testes unitários
- **IDE**: IntelliJ IDEA ou Eclipse

## Estrutura do Projeto

- **Classes Utilizadas**:
  - `LocacaoCarro`: Classe principal que gerencia o processo de locação.
    - Funções:
      - `reservarCarroLuxoAntecipado()`: Realiza a reserva antecipada de um carro de luxo e aplica o desconto.
      - `alugarCarroUtilitarioUltimaHora()`: Processa a locação de última hora de um carro utilitário com custo adicional.
  - `Cliente`: Classe que representa um cliente.
    - Funções:
      - `getNome()`: Retorna o nome do cliente.
      - `getTipoCarro()`: Retorna o tipo de carro que o cliente deseja alugar.
  - `Carro`: Classe que representa um carro.
    - Funções:
      - `getDisponibilidade()`: Verifica a disponibilidade do carro.
      - `getTipo()`: Retorna o tipo do carro (luxo ou utilitário).
      - `getPreco()`: Retorna o preço do carro.
      
## Implantações

As implantações foram feitas para simular o processo de locação de carros de luxo com reservas antecipadas e de carros utilitários de última hora.

## Versionamento

- **Versão 1.0**: Criação do cenário inicial em Gherkin e definição da estrutura do projeto.

## Autor

- **Nome**: Henrique Ribeiro Borges
- **E-mail**: henriqueribeiroborges@gmail.com
- **RA**: 223997

## Cenário em Gherkin

```gherkin
Feature: Car rental system

  Scenario: Luxury car rental with early booking
    Given a customer wants to rent a luxury car
    And the reservation is made at least one week in advance
    When the customer finalizes the booking
    Then the system should offer a special discount on the total rental price

  Scenario: Utility car rental without prior reservation
    Given a customer wants to rent a utility car
    And the reservation is made on the same day
    When the customer finalizes the booking
    Then the system should find an available vehicle
    And the system should process the rental quickly
    And the system should charge a higher price due to the urgent demand

