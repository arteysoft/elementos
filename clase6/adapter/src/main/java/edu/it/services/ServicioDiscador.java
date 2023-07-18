package edu.it.services;

import java.util.Random;

import edu.it.model.Usuario;

import static edu.it.Utiles.Util.dormir;

public class ServicioDiscador implements Runnable {
	DiscadorAbstracto discador = null;
	
	public ServicioDiscador(DiscadorAbstracto discador) {
		this.discador = discador;
	}

	public void run() {
		for (;;) {
			Integer x = new Random().nextInt(4);
			System.out.println(x+"");
			if (x == 0) {
				System.out.println("Si es 0 entonces NO realizar la llamada...");
				continue;
			}
			var datosLlamada = discador.realizarLlamada(new Usuario());
			int z = x;
			if (z == 1) {
				System.out.println("retrazar el llamado a emitir mensaje x q corresponde a la emrpes Arcor");
				dormir(5);
			}
			discador.emitirMensaje(datosLlamada);
			int f = x;
			if (f == 2) {
				System.out.println("Cortar 2 veces x que hay un bug");
				discador.cortar(datosLlamada);
			}
			discador.cortar(datosLlamada);
			System.out.println("");
		}
	}
}
