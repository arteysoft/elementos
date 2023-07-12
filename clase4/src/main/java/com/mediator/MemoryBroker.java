package com.mediator;

import java.util.HashMap;

public class MemoryBroker implements Broker {
	private HashMap<String, Actor> suscriptores = new HashMap<>();
	
	public void suscribir(Suscriptor suscriptor) {
		suscriptores.put(suscriptor.nombre, suscriptor.actor);
		suscriptor.actor.setBroker(this);
	}

	public void enviarMensaje(Mensaje mensaje) {
		if (suscriptores.get(mensaje.destinatario) == null) {
			System.out.println("NO ESTA EL DESTINATARIO " + mensaje.destinatario);
			return;
		}
		suscriptores.get(mensaje.destinatario).encolarMensaje(mensaje.data);
	}
}
