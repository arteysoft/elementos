package edu.it.services;

import static edu.it.Utiles.Util.dormir;

import edu.it.model.DatosLlamada;
import edu.it.model.Usuario;

public class DiscadorPotencia implements DiscadorAbstracto {
	public DatosLlamada realizarLlamada(Usuario u) {
		System.out.println("realizando la llamada ...");
		dormir(3);
		return new DatosLlamada();
	}
	public void emitirMensaje(DatosLlamada datosLlamada) {
		System.out.println("emitiendo mensaje de voz");
		dormir(3);
	}
	public void cortar(DatosLlamada datosLlamada) {
		System.out.println("Cortando la llamada");
		dormir(3);		
	}
}
