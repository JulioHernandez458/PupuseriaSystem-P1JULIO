package com.lep4.pupuseria;

public abstract class Pupusa {
	
    String nombre ;
	
    
    
	public void preparar() {
		System.out.println("Preparando pupusa...");
	}
	
	
	public void cocinar() {
		
		Plancha plancha = Plancha.getInstance();
;		
		if(plancha.iscaliente() && !plancha.isLlena()) {
			System.out.println("Cocinando pupusa en la plancha");
			plancha.colocar(this);
		}
		
	}
	
	public void empaquetar() {
		System.out.println("Empaquetando la pupusa...");
	}
	
	/*public void apagarP() {
		Plancha plancha = Plancha.getInstance();
		plancha.setApagada(true);
	}*/
	
	public String getNombre() {
		return this.nombre;
	}

}
