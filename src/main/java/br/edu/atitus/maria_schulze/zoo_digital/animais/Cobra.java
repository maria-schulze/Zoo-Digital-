package br.edu.atitus.maria_schulze.zoo_digital.animais;

import br.edu.atitus.maria_schulze.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.maria_schulze.zoo_digital.comportamentos.Predador;

public class Cobra extends Reptil implements Nadador, Predador{

    public Cobra(String nome, int idade, boolean venenoso) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está chiando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo ovos");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no rio");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando ratinhos.");
    }
    
}
