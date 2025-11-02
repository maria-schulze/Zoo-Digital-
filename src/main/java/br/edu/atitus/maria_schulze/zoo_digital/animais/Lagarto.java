package br.edu.atitus.maria_schulze.zoo_digital.animais;

import br.edu.atitus.maria_schulze.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.maria_schulze.zoo_digital.comportamentos.Predador;

public class Lagarto extends Reptil implements Corredor, Predador{

    public Lagarto(String nome, int idade) {
        super(nome, idade, false);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está chiando e batendo a calda");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo insetos");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo das pessoas");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando insetos.");
    }
    
}
