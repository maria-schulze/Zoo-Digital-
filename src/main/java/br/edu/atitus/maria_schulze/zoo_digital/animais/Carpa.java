package br.edu.atitus.maria_schulze.zoo_digital.animais;

import br.edu.atitus.maria_schulze.zoo_digital.comportamentos.Nadador;

public class Carpa extends Peixe implements Nadador{

    public Carpa(String nome, int idade, String tipoAguaCarpa) {
        super(nome, idade, "Doce");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo algas");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no açude");
    }
    
}

