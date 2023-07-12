package com.mediator;

import com.google.gson.Gson;

public class Christian extends Actor {
	private Gson gson = new Gson();
	
	protected void onNewMessage(String t) {
		System.out.println("Me llego el siguiente mensaje: " + t);
		Numero n = gson.fromJson(t, Numero.class);
		Numero e = new Numero(n.numero + 1);
		broker.enviarMensaje(new Mensaje("com.mediador.ana", gson.toJson(e)));
	}
}
