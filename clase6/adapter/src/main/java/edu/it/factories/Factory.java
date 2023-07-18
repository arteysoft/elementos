package edu.it.factories;

import edu.it.services.ServicioDiscador;

public class Factory {
	public static Runnable crearServicioDiscador() {
		return new ServicioDiscador();
	}
}
