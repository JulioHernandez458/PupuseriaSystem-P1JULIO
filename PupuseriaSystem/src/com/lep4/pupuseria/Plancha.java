package com.lep4.pupuseria;
public class Plancha{

	
	private boolean caliente;
	private boolean llena;
	private boolean apagada;
	private int capacidadMaxima = 5;
	private int contadorDePupusas = 0;
	
	private static Plancha plancha;
	
	private Plancha() {
		
		this.caliente = true;
		this.llena = false;
		this.contadorDePupusas = 0;
		this.apagada = false;
		calentar();
	
	}
	
	public static Plancha getInstance() {
		
		//En un incio la plancha NO esta llena y se pone a calentar
		if(plancha == null) {

			System.out.println("Preparando la plancha, calentando ...");
			plancha = new Plancha();
		}else {
			System.out.println("La plancha ya esta caliente...");
		}
        
       return plancha;
		
	}
	
	public void calentar() {
		System.out.println("La plancha se ha calentado ...");
		this.caliente = true;
	}
	
	public void colocar(Pupusa pupusa) {
		if(caliente) {
			if(this.contadorDePupusas < 10) {
				System.out.println("Colocando en la plancha: "+pupusa.getNombre());
				this.contadorDePupusas++;
				this.quitar(pupusa);
			}else {
				System.out.println("No se puede colocar... la plancha esta llena!");
				this.setLlena(true);
			   }
			}else {
			System.out.println("Debe calentar primero la plancha para colocar!");
			}
		}
  

	
	
	public void quitar(Pupusa pupusa) {
		System.out.println("Quitando "+pupusa.getNombre() + " de la plancha");
		this.contadorDePupusas--;
		this.setLlena(false);
	}
	

	public boolean iscaliente() {
		return caliente;
	}

	public boolean isApagada() {
		return apagada;
	}

	public void setApagada(boolean apagada) {
		this.apagada = apagada;
		System.out.println("La plancha se ha apagado...");
	}

	public boolean isLlena() {
		return llena;
	}

	public void setLlena(boolean llena) {
		this.llena = llena;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}


}
