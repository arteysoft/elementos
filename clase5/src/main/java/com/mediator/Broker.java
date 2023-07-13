package com.mediator;

public interface Broker {
	void suscribir(Suscriptor suscriptor);
	void enviarMensaje(Mensaje mensaje);
}
