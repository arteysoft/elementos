package com.observer.problema;

public class Observador implements Notificable {
	public void notificar(Object t) {
		System.out.println("Gracias x notificarme voy a correr mi scritp para actualizar");
		for (;;) {
			System.out.print(".");
		}
	}

}
