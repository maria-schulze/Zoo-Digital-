package br.edu.atitus.maria_schulze.zoo_digital.app;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.atitus.maria_schulze.zoo_digital.animais.*;
import br.edu.atitus.maria_schulze.zoo_digital.comportamentos.*;

public class ZooDigitalApp {
	private static List<Animal> animais = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\n-----------------");
			System.out.println("=== ZOO DIGITAL ===");
			System.out.println("1. Cadastrar Animal");
			System.out.println("2. Listar Todos os Animais");
			System.out.println("3. Listar Animais Corredores");
			System.out.println("4. Listar Animais Nadadores");
			System.out.println("5. Listar Animais Voadores");
			System.out.println("6. Listar Animais Predadores");
			System.out.println("7. Exibir Total de Animais");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			try {
				opcao = scanner.nextInt();
				scanner.nextLine();
			} catch (Exception e) {
				System.out.println("Opção inválida! Tente novamente.");
				scanner.nextLine();
				opcao = -1;
				continue;
			}
			
			switch (opcao) {
				case 1:
					cadastrarAnimal(scanner);
					break;
				case 2:
					listarTodosAnimais();
					break;
				case 3:
					listarAnimaisCorredores();
					break;
				case 4:
					listarAnimaisNadadores();
					break;
				case 5:
					listarAnimaisVoadores();
					break;
				case 6:
					listarAnimaisPredadores();
					break;
				case 7:
					exibirTotalAnimais();
					break;
				case 0:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida!");
			}
			if (opcao != 0 && opcao != -1) {
				System.out.println("\nPressione Enter para continuar...");
				scanner.nextLine();
			}
			
		} while (opcao != 0);

		scanner.close();
	}

	private static void cadastrarAnimal(Scanner scanner) {
		System.out.println("\n=== CADASTRAR ANIMAL ===");
		System.out.println("Tipos disponíveis:");
		System.out.println("1. Cachorro");
		System.out.println("2. Golfinho");
		System.out.println("3. Pato");
		System.out.println("4. Pinguim");
		System.out.println("5. Traira");
		System.out.println("6. PeixeMorcego");
		System.out.println("7. Gato");
		System.out.println("8. Carpa");
		System.out.println("9. Gavião");
		System.out.println("10. Cobra");
		System.out.println("11. Tartaruga");
		System.out.println("12. Lagarto");
		System.out.println("13. Jacare");
		System.out.println("14. Tubarao");
		System.out.println("15. Vaca");
		System.out.print("Escolha o tipo: ");
		int tipo = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("Idade: ");
		int idade = scanner.nextInt();
		scanner.nextLine();

		Animal animal = null;
		switch (tipo) {
			case 1:
				System.out.print("Raça: ");
				String raca = scanner.nextLine();
				animal = new Cachorro(nome, idade, true, raca);
				break;
			case 2:
				animal = new Golfinho(nome, idade, false);
				break;
			case 3:
				System.out.print("Cor das Penas: ");
				String corPenasPato = scanner.nextLine();
				animal = new Pato(nome, idade, corPenasPato);
				break;
			case 4:
				System.out.print("Cor das Penas: ");
				String corPenasPinguim = scanner.nextLine();
				animal = new Pinguim(nome, idade, corPenasPinguim);
				break;
			case 5:
				animal = new Traira(nome, idade, "Doce");
				break;
			case 6:
				System.out.print("Tipo de Água: ");
				String tipoAguaPeixeMorcego = scanner.nextLine();
				animal = new PeixeMorcego(nome, idade, tipoAguaPeixeMorcego);
				break;
			case 7:
				animal = new Gato(nome, idade, true);
				break;
			case 8:
				animal = new Carpa(nome, idade, "Doce");
				break;
			case 9:
				System.out.print("Cor das Penas: ");
				String corPenasGaviao = scanner.nextLine();
				animal = new Gavião(nome, idade, corPenasGaviao);
				break;
			case 10:
				animal = new Cobra(nome, idade, true);
				break;
			case 11:
				animal = new Tartaruga(nome, idade, true);
				break;
			case 12:
				animal = new Lagarto(nome, idade);
				break;
			case 13:
				animal = new Jacare(nome, idade);
				break;
			case 14:
				System.out.print("Tipo de Água: ");
			animal = new Tubarao(nome, idade);
				break;
			case 15:
				animal = new Vaca(nome, idade, true);
				break;
			default:
				System.out.println("Tipo inválido!");
				return;
		}

		if (animal != null) {
			animais.add(animal);
			System.out.println("Animal cadastrado com sucesso!");
		}
	}

	private static void listarTodosAnimais() {
		System.out.println("\n=== TODOS OS ANIMAIS ===");
		if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado. Use a opção 1 para começar!");
            return;
        }
		for (Animal animal : animais) {
			System.out.println("\n--- " + animal.getNome() + " (" + animal.getEspecie() + ") ---");
			System.out.println("Idade: " + animal.getIdade());
			animal.emitirSom();
			animal.comer();
		}
		System.out.println("\n===================================");
	}

	private static void listarAnimaisCorredores() {
		System.out.println("\n=== ANIMAIS CORREDORES ===");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado. Use a opção 1 para começar!");
            return;
        }
		for (Animal animal : animais) {
			if (animal instanceof Corredor) {
				System.out.println("\n--- " + animal.getNome() + " (" + animal.getEspecie() + ") ---");
				System.out.println("Idade: " + animal.getIdade());
				((Corredor) animal).correr();
			}
		}
		System.out.println("\n===================================");
	}

	private static void listarAnimaisNadadores() {
		System.out.println("\n=== ANIMAIS NADADORES ===");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado. Use a opção 1 para começar!");
            return;
        }
		for (Animal animal : animais) {
			if (animal instanceof Nadador) {
				System.out.println("\n--- " + animal.getNome() + " (" + animal.getEspecie() + ") ---");
				System.out.println("Idade: " + animal.getIdade());
				((Nadador) animal).nadar();
			}
		}
		System.out.println("\n===================================");
	}

	private static void listarAnimaisVoadores() {
		System.out.println("\n=== ANIMAIS VOADORES ===");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado. Use a opção 1 para começar!");
            return;
        }
		for (Animal animal : animais) {
			if (animal instanceof Voador) {
				System.out.println("\n--- " + animal.getNome() + " (" + animal.getEspecie() + ") ---");
				System.out.println("Idade: " + animal.getIdade());
				((Voador) animal).voar();
			}
		}
		System.out.println("\n===================================");
	}

	private static void listarAnimaisPredadores() {
		System.out.println("\n=== ANIMAIS PREDADORES ===");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado. Use a opção 1 para começar!");
            return;
        }
		for (Animal animal : animais) {
			if (animal instanceof Predador) {
				System.out.println("\n--- " + animal.getNome() + " (" + animal.getEspecie() + ") ---");
				System.out.println("Idade: " + animal.getIdade());
				((Predador) animal).cacar();
			}
		}
		System.out.println("\n===================================");
	}

	private static void exibirTotalAnimais() {
		System.out.println("\nTotal de animais: " + Animal.getContador());
	}
}