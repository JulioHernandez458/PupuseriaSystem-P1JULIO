package com.lep4.pupuseria;

public class PupusaAdapter implements Tamal{
	
	Pupusa pupusa;

	@Override
	public void prepararTA() {
		
		pupusa.preparar();
	}

	@Override
	public void cocinarTA() {
		pupusa.cocinar();
	}

	@Override
	public void empaquetarTA() {
		pupusa.empaquetar();
	}

}
