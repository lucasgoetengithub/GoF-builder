package com.estudo.gof.service;

import com.estudo.gof.domain.Veiculo;
import com.estudo.gof.resource.MontadoraBuilder;

public class Montadora {

	private MontadoraBuilder builder = new MontadoraVeiculoBuilder();
	
	public Veiculo montar(char tipo, String modelo) {
		builder.montar(tipo, modelo);
		return builder.getVeiculo();
	}
}
