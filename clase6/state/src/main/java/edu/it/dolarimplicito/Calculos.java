package edu.it.dolarimplicito;

import java.util.HashMap;

import edu.it.State;
import edu.it.model;

public class Calculos implements State {	
	public State execute(HashMap<String, Object> mapa) {
		System.out.println("Realice los calculos pedidos");
		Double dolarImplicito = model.local / model.nuevaYork;
		System.out.println("El valor del dolar implicito es: " + dolarImplicito);
		Double local = (Double)mapa.get("cotizacion_ypf_mercado_local");
		Double nyse = (Double)mapa.get("cotizacion_ypf_mercado_nyse");
		System.out.println("El valor del dolar implicito por HashMap es: " + (local / nyse));
		return new EstadoInicial();
	}
}
