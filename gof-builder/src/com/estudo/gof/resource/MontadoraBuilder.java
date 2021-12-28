package com.estudo.gof.resource;

import com.estudo.gof.domain.Veiculo;

public interface MontadoraBuilder {
	
	void montar(char tipo, String modelo);
	
	Veiculo getVeiculo();
}
