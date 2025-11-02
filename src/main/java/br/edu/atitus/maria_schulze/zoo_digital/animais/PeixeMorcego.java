package br.edu.atitus.maria_schulze.zoo_digital.animais;
public class PeixeMorcego extends Peixe {

    public PeixeMorcego(String nome, int idade, String tipoAguaPeixeMorcego) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo pesquenas algas");
    }
    
}
