package br.edu.atitus.maria_schulze.zoo_digital.animais;

import br.edu.atitus.maria_schulze.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.maria_schulze.zoo_digital.comportamentos.Predador;
import br.edu.atitus.maria_schulze.zoo_digital.comportamentos.Corredor;

public class Jacare extends Reptil implements Nadador, Predador, Corredor{

    public Jacare (String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rugindo e e grunhindo.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo a carpa.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no rio.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo atrás do cachorrinho.");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando peixes.");
    }
    
}
