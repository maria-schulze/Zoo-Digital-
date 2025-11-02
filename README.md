# 🦁 Zoo Digital: Sistema de Cadastro e Polimorfismo de Animais

<p align="center">
  <img src="https://img.shields.io/badge/Linguagem-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Linguagem: Java"/>
  <img src="https://img.shields.io/badge/Paradigma-POO-blue?style=for-the-badge" alt="Paradigma: POO"/>
  <img src="https://img.shields.io/badge/Conceitos-Interfaces%2FPolimorfismo-green?style=for-the-badge" alt="Conceitos: Interfaces/Polimorfismo"/>
</p>

Este projeto é uma aplicação de console desenvolvida em Java, focada em demonstrar os conceitos fundamentais da **Programação Orientada a Objetos (POO)**: Herança, Interfaces e Polimorfismo. O sistema simula um cadastro simples de animais em um zoológico digital, onde os animais são listados e agrupados com base em seus comportamentos.

## ✨ Conceitos Aplicados

O núcleo deste trabalho é a aplicação dos seguintes princípios:

* **Herança:** Utilização de classes base (`Animal`, `Mamifero`, `Ave`, `Peixe`, `Reptil`) para construir uma hierarquia e compartilhar atributos e métodos comuns.
* **Interfaces:** Utilização das interfaces de comportamento (`Corredor`, `Nadador`, `Voador`, `Predador`) para desacoplar a funcionalidade da classe, permitindo que diferentes tipos de animais compartilhem o mesmo comportamento (Ex: um `Cachorro` e um `Lagarto` podem ser ambos `Corredor`).
* **Polimorfismo:** Os métodos de listagem usam o operador `instanceof` para identificar e interagir com qualquer animal que implemente uma determinada interface, garantindo que o código seja flexível e escalável.

## 📁 Estrutura do Projeto

O projeto é organizado em pacotes Java para manter a separação de responsabilidades (SRP):
br.edu.atitus ├── maria_schulze.zoo_digital.app (Contém o menu principal e a execução) │ └── ZooDigitalApp.java (Método main e lógica de interação do usuário) ├── maria_schulze.zoo_digital.animais (Contém todas as classes Animal) │ ├── Animal.java, Mamifero.java, etc. (Classes base e subclasse) │ └── Cachorro.java, Gato.java, etc. (Classes concretas) └── zoo_digital.comportamentos (Contém as Interfaces de Comportamento) ├── Corredor.java ├── Nadador.java ├── Voador.java └── Predador.java

## 🖥️ Funcionalidades Principais (Menu)

A aplicação de console oferece as seguintes opções para o usuário:

| Opção | Funcionalidade | Conceito POO |
| :---: | :--- | :--- |
| `1` | **Cadastrar Animal** | Instanciação de Objeto (Classes Concretas) |
| `2` | **Listar Todos** | Iteração e Chamada de Métodos (Herança) |
| `3` | **Listar Corredores** | Polimorfismo (`instanceof Corredor`) |
| `4` | **Listar Nadadores** | Polimorfismo (`instanceof Nadador`) |
| `5` | **Listar Voadores** | Polimorfismo (`instanceof Voador`) |
| `6` | **Listar Predadores** | Polimorfismo (`instanceof Predador`) |
| `7` | **Exibir Total de Animais** | Variável Estática (`Animal.getContador()`) |
| `0` | **Sair** | Encerra a aplicação |

## 🚀 Como Executar o Projeto

### Pré-requisitos

* [Java Development Kit (JDK) 8+](https://www.oracle.com/java/technologies/downloads/) instalado.
* Uma IDE como **Eclipse** ou **IntelliJ IDEA**.

### Passos para Compilação e Execução

1.  **Clone o Repositório:**
    ```bash
    git clone [URL_DO_SEU_REPOSITÓRIO]
    ```
2.  **Importar na IDE:**
    * Abra sua IDE (Eclipse/IntelliJ) e importe o projeto como um projeto Java existente.
3.  **Verificar Pacotes:**
    * Confirme se todos os pacotes (especialmente o de comportamentos) estão sendo importados corretamente na classe `ZooDigitalApp.java`.
4.  **Executar:**
    * Localize a classe `ZooDigitalApp.java`.
    * Clique com o botão direito e execute como `Java Application`.

O menu interativo será exibido no console.
