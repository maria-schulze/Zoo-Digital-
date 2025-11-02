package br.edu.atitus.maria_schulze.zoo_digital.animais;

public abstract class Reptil extends Animal {
    private boolean venenoso;

    public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public Reptil(String nome, int idade, boolean venenoso) {
        super(nome, "Reptil", idade); 
        this.venenoso = venenoso;       
        
    }
}