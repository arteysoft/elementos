package edu.it.services;

import edu.it.model.DatosLlamada;
import edu.it.model.Usuario;
import dialerpluspro.DialerPro;
import dialerpluspro.InfoCall;
import dialerpluspro.User;

public class DiscadorAdapter implements DiscadorAbstracto {
	DialerPro dialerPro = null;
	
	public DiscadorAdapter(DialerPro dialerPro) {
		this.dialerPro = dialerPro;
	}

	public DatosLlamada realizarLlamada(Usuario u) {
		System.out.println("Adapter");
		// Adaptar la estrcutrua de Usuario a User
		User user = new User();
		InfoCall datosLlamada = dialerPro.dial(user);
		// Adaptar infoCall a DatosLlamada
		return new DatosLlamada();
	}
	
	public void emitirMensaje(DatosLlamada datosLlamada) {
		System.out.println("Wrapper");
		// Adaptar infoCall a DatosLlamada y viseversa
		dialerPro.playMessage(new InfoCall());
		System.out.println("Wrapper");
	}
	
	public void cortar(DatosLlamada datosLlamada) {
		System.out.println("Wrapper");
		dialerPro.hangup(new InfoCall());
		System.out.println("Wrapper");
	}
}
