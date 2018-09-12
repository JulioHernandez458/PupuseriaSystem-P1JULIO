package com.lep4.pupuseria;

public class Pupuseria {
	
	PupusaFactory factory;
	
	public Pupuseria(PupusaFactory factory) {
		super();
		this.factory = factory;
	}
	
	public Pupusa ordenarPupusa(String tipo) {		
        Pupusa pupusa = factory.createPupusa(tipo);
        
        if(pupusa != null) { //Pupusa existe!
			pupusa.preparar();
        	pupusa.cocinar();
			pupusa.empaquetar();
        }else {
        	//Pupusa no existe
        	System.out.println("La Pupusa de "+tipo+" no existe!");
        }
	
		return pupusa;
	}
	

}
