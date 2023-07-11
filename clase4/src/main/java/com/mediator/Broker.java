package com.mediator;

public interface Broker {
	void suscribir(/* aca va a venir una clase Suscriptor */);
	void enviarMensaje(/* Mensaje */);
}
