package com.estudo.gof.domain;

public class Ferrari extends Veiculo {

	private String nome = "Ferrari";
	public Ferrari(String modelo) {
		super(modelo, "Esportivo");
	}

	@Override
	public String toString() {
		return "Carro: " + nome + " " + getModelo() + " " + getTipo();
	}
	
}
