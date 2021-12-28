package com.estudo.gof.domain;

public abstract class Veiculo {

	private String modelo;
	private String tipo;
	public Veiculo(String modelo, String tipo) {
		super();
		this.modelo = modelo;
		this.tipo = tipo;
	}
	public String getModelo() {
		return modelo;
	}
	public String getTipo() {
		return tipo;
	}
	
}
