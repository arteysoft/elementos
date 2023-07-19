package edu.it;

import java.util.HashMap;

import edu.it.Utiles.Util;
import edu.it.dolarimplicito.EstadoInicial;

public class Init {
	public static void main(String... params) {
		
		State estado = new EstadoInicial();
		HashMap<String, Object> mapa = new HashMap<String, Object>();
		
		for (;;) {
			estado = estado.execute();
			Util.dormir(3);
		}
	}
}
