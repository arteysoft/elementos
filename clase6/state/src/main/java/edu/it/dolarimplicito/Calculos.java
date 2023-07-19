package edu.it.dolarimplicito;

import java.util.HashMap;

import edu.it.State;
import edu.it.model;

public class Calculos implements State {	
	public State execute(HashMap<String, Object> mapa) {
		System.out.println("Realice los calculos pedidos");
		Double dolarImplicito = model.local / model.nuevaYork;
		System.out.println("El valor del dolar implicito es: " + dolarImplicito);
		return new EstadoInicial(mapa);
	}
}
