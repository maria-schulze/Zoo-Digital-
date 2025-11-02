package br.edu.atitus.maria_schulze.zoo_digital.animais;

import br.edu.atitus.maria_schulze.zoo_digital.comportamentos.Corredor;

public class Vaca extends Mamifero implements Corredor {

	public Vaca(String nome, int idade, boolean b) {
		super(nome, idade, true);
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está mugindo");
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está comendo pasto");
	}

	@Override
	public void correr() {
		System.out.println(getNome() + " está correndo atrás da bezerrinha.");
	}
}