package br.edu.atitus.maria_schulze.zoo_digital.animais;

import br.edu.atitus.maria_schulze.zoo_digital.comportamentos.Voador;

public class Pomba extends Ave implements Voador {

    public Pomba(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está arrulhando (pru pru)");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sementes");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando pelos céus");
    }    
}