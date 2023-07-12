package com.mediator;

import com.google.gson.Gson;

public class Ana extends Actor {
	private Gson gson = new Gson();
	
	protected void onNewMessage(String t) {
		System.out.print("Soy ana: ");
		System.out.println(t);
		Numero n = gson.fromJson(t, Numero.class);
		System.out.println(n.numero);
		Numero e = new Numero(n.numero + 1);
		broker.enviarMensaje(new Mensaje("com.mediador.christian", gson.toJson(e)));
	}
}
