package com.inversiondecontrol.ejemplo;

public class HolaMundoImpl extends Template {	
	protected String obtenerContenido() {
		return "<h1>Hola mundo</h1>";
	}	
	protected Integer obtenerLargoMensaje() {
		return 19;
	}

}
