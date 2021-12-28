package com.estudo.gof.application;

import com.estudo.gof.domain.Veiculo;
import com.estudo.gof.service.Montadora;

public class Build {

	public static void main(String[] args) {
		executar();
	}
	
	public static void executar() {
		Montadora montadora = new Montadora();
		Veiculo carro1 = montadora.montar('F', "Testerossa");
		Veiculo carro2 = montadora.montar('J', "Renegade");
		System.out.println(carro1);
		System.out.println(carro2);
	}

}
