package br.edu.atitus.maria_schulze.zoo_digital.animais;

import br.edu.atitus.maria_schulze.zoo_digital.comportamentos.Nadador;

public class Tartaruga extends Reptil implements Nadador{

    public Tartaruga(String nome, int idade, boolean venenoso) {
        super(nome, idade, false);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está assobiando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixes");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no lago");
    } 
}