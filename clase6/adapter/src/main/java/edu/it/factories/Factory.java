package edu.it.factories;

import dialerpluspro.DialerPro;
import edu.it.services.DiscadorAdapter;
import edu.it.services.DiscadorPotencia;
import edu.it.services.ServicioDiscador;

public class Factory {
	public static Runnable crearServicioDiscador() {
		return new ServicioDiscador(new DiscadorPotencia());
		// return new ServicioDiscador(new DiscadorAdapter(new DialerPro()));
	}
}

/*
 * CreadorServicioPotencia
 * CreadorServicioPlusPro
 * 
 * edu.it.factories.CreadorServicioPotencia
 * edu.it.factories.CreadorPlusPro
 */