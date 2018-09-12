package com.lep4.pupuseria;

public class TipoPupusa extends PupusaFactory{

	@Override
	public Pupusa createPupusa(String tipo) {
		
		Pupusa pupusa = null;
		
		if(tipo.equals("Pupusa de queso")) {
			pupusa =  new PupusaDeQueso();
		}else if(tipo.equals("Pupusa revuelta")) {
			pupusa = new PupusaRevuelta();
		}else if(tipo.equals("Pupusa Frijol con queso")) {
			pupusa = new PupusaFrijolConQueso();
		}else if(tipo.equals("Pupusa chicharron")) {
			pupusa = new PupusaChicharron();
		}else if(tipo.equals("Pupusa loroco")) {
			pupusa = new PupusaLoroco();
		}
		return pupusa;
	}
	
	

}
