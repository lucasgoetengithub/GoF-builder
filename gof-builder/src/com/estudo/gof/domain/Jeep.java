package com.estudo.gof.domain;

public class Jeep extends Veiculo {
	private String nome = "Jeep";
	public Jeep(String modelo) {
		super(modelo, "Utilitario");
	}
	
	@Override
	public String toString() {
		return "Carro: " + nome + " " + getModelo() + " " + getTipo();
	}

}
