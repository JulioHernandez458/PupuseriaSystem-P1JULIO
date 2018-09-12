package com.lep4.pupuseria;

/**
 * 
 * ***** PUPUSERIA SYSTEM ****
 * El siguiente programa implementa un sistema de una pupuseria, en el cual un cliente podra pedir una pupusa
 * y el sistema se encargara de preparar, cocinar y empaquetar dicha orden de pupusas.
 * 
 * Como programador del sistema debera solucionar los siguientes problemas:
 * 	1) Debera agregar 3 nuevas especialidades de pupusas: FrijolConQueso, Chicharron, Loroco
 *  2) Debera solucionar el problema con el estado de la plancha utilizando [ Singleton ]
 *  3) Debera refactorar el codigo utilizando el [ patron Factory ]
 *  4) La Pupuseria debera servir Tamales utilizando los mimos procesos de una pupusa por lo cual debera utilizar [ Patron Adapter ]
 *  5) Debera crear un escenario en el cual se pidan todas las pupusas e incluso tamal del menu.
 *  6) Se debera apagar la plancha al final de todos los pedidos
 *
 */

public class Cliente {

	public static void main(String[] args) {
		
		
		Pupuseria local = null;
		
		//Cliente A pide una pupusa de queso y una revuelta
		System.out.println("**Preparando orden del Cliente A: ");
		local = new Pupuseria(new TipoPupusa());
		local.ordenarPupusa("Pupusa de queso");
		
		local = new Pupuseria(new TipoPupusa());
        local.ordenarPupusa("Pupusa revuelta");
		
		//Cliente B pide una defrijol con queso, chicharron y loroco
		System.out.println("\n**Preparando orden del Cliente B: ");
		local = new Pupuseria(new TipoPupusa());
		local.ordenarPupusa("Pupusa Frijol con queso");
		
		local = new Pupuseria(new TipoPupusa());
		local.ordenarPupusa("Pupusa chicharron");
		
		local = new Pupuseria(new TipoPupusa());
		local.ordenarPupusa("Pupusa loroco");
		
		
		//ordenando tamales
		System.out.println("\n");
		local = new Pupuseria(new TipoPupusa());
        local.ordenarPupusa("Tamal");
        
		
		
		
		//Se debe apagar la plancha al final del dia
        
        
	}

}

