package br.edu.atitus.maria_schulze.zoo_digital.animais;

import br.edu.atitus.maria_schulze.zoo_digital.comportamentos.Nadador;

public class Traira extends Peixe implements Nadador{

    public Traira(String nome, int idade, String tipoAguaTraira) {
        super(nome, idade, "Doce");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo lambaris");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no rio");
    }
    
}

