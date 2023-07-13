package com.mediator.repository;

import com.mediator.Actor;
import com.mediator.Mensaje;

public class GrabadorMulta extends Actor {
	protected void onNewMessage(String strJson) {	
		System.out.println("Corresponde multa");
		broker.enviarMensaje(new Mensaje("com.mediator.repository.grabadormultajson", strJson));
		broker.enviarMensaje(new Mensaje("com.mediator.repository.grabadormultasql", strJson));
	}
}
