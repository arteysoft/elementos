package com.modeloactor.ejemplo;

public class MiPrimerActor extends Actor {	
	private Actor a;
	
	public MiPrimerActor(Actor a) {
		this.a = a;
	}	
	
	protected void onNewMessage(String t) {
		System.out.print("Recibi un mensaje: ");
		System.out.println(t);
		Integer i = Integer.parseInt(t);
		this.encolarMensaje(String.valueOf(i + 1));
		
		if (i % 111 == 0) {
			a.encolarMensaje("Multiplo de 111");
		}
	}
}
