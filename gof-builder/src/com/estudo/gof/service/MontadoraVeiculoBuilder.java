package com.estudo.gof.service;

import com.estudo.gof.domain.Ferrari;
import com.estudo.gof.domain.Jeep;
import com.estudo.gof.domain.Veiculo;
import com.estudo.gof.resource.MontadoraBuilder;

public class MontadoraVeiculoBuilder implements MontadoraBuilder{

	private Veiculo veiculo;

	@Override
	public void montar(char tipo, String modelo) {
		switch (tipo) {
		case 'F': veiculo = new Ferrari(modelo);break;
		case 'J': veiculo = new Jeep(modelo);break;
		}
		
	}

	@Override
	public Veiculo getVeiculo() {
		return veiculo;
	}
	
	
}
