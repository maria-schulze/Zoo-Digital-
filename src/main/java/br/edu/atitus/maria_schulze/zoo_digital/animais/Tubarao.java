package br.edu.atitus.maria_schulze.zoo_digital.animais;

import br.edu.atitus.maria_schulze.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.maria_schulze.zoo_digital.comportamentos.Predador;

public class Tubarao extends Peixe implements Nadador, Predador{

    public Tubarao(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está sileciosamente captando vibrações");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixinhos");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no mar aberto");
    }
    
    @Override
	public void cacar() {
		System.out.println(getNome() + " está caçando os peixinhos dourados");
	}
}

