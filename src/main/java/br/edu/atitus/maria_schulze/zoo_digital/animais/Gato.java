package br.edu.atitus.maria_schulze.zoo_digital.animais;

import br.edu.atitus.maria_schulze.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.maria_schulze.zoo_digital.comportamentos.Predador;


public class Gato extends Mamifero implements Corredor, Predador {


	public Gato(String nome, int idade, boolean b) {
		super(nome, idade, true);
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está miando");
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está comendo seu petisco");
	}

	@Override
	public void correr() {
		System.out.println(getNome() + " está correndo atrás do novelo de lã");
	}
	
	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando o ratinho.");
	}
}