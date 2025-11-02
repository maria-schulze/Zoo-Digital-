package br.edu.atitus.maria_schulze.zoo_digital.animais;

import br.edu.atitus.maria_schulze.zoo_digital.comportamentos.Voador;
import br.edu.atitus.maria_schulze.zoo_digital.comportamentos.Predador;


public class Gavião extends Ave implements Voador, Predador {

    public Gavião(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está gritando.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo ratinhos");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando baixo atrás de comida.");
    }
    
    @Override
	public void cacar() {
		System.out.println(getNome() + " está caçando roedores.");
	}
    
}
