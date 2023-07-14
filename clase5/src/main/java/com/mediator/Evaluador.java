package com.mediator;

import java.util.HashMap;
import static com.bolivarsoft.sensorclima.TipoClima.NORMAL;
import static com.bolivarsoft.sensorclima.TipoClima.LLUVIAS_MODERADAS;
import static com.bolivarsoft.sensorclima.TipoClima.LLUVIAS_TORRENCIALES;

import static com.bolivarsoft.sensorvelocidad.TipoVehiculo.Auto;
import static com.bolivarsoft.sensorvelocidad.TipoVehiculo.Moto;
import static com.bolivarsoft.sensorvelocidad.TipoVehiculo.Camion;
import static com.bolivarsoft.sensorvelocidad.TipoVehiculo.Tractor;

import java.util.UUID;

import com.facade.JsonFacade;
import com.mediator.dto.ClimaTipoVehiculo;
import com.mediator.dto.ClimaVehiculo;
import com.mediator.dto.Ticket;

public class Evaluador extends Actor {
	private HashMap<ClimaTipoVehiculo, Integer> limites = new HashMap<ClimaTipoVehiculo, Integer>();
	
	public Evaluador() {
		limites.put(new ClimaTipoVehiculo(NORMAL, Auto), 130);
		limites.put(new ClimaTipoVehiculo(NORMAL, Moto), 130);
		limites.put(new ClimaTipoVehiculo(NORMAL, Camion), 90);
		limites.put(new ClimaTipoVehiculo(NORMAL, Tractor), 60);
		
		limites.put(new ClimaTipoVehiculo(LLUVIAS_MODERADAS, Auto), 110);
		limites.put(new ClimaTipoVehiculo(LLUVIAS_MODERADAS, Moto), 90);
		limites.put(new ClimaTipoVehiculo(LLUVIAS_MODERADAS, Camion), 70);
		limites.put(new ClimaTipoVehiculo(LLUVIAS_MODERADAS, Tractor), 60);
		
		limites.put(new ClimaTipoVehiculo(LLUVIAS_TORRENCIALES, Auto), 90);
		limites.put(new ClimaTipoVehiculo(LLUVIAS_TORRENCIALES, Moto), 90);
		limites.put(new ClimaTipoVehiculo(LLUVIAS_TORRENCIALES, Camion), 70);
		limites.put(new ClimaTipoVehiculo(LLUVIAS_TORRENCIALES, Tractor), 60);
	}
	
	protected void onNewMessage(String strJson) {
		System.out.println(strJson);
		
		var cv = com.facade.JsonFacade.fromJson(strJson, ClimaVehiculo.class);
		
		var maxima = limites.get(new ClimaTipoVehiculo(cv.tp, cv.dv.tipoVehiculo));
		
		if (cv.dv.velocidadMedida <= maxima) {
			System.out.println("NO HAY MULTA");
			return;
		}
		
		// IF MULTA
		var tkt = new Ticket(
				UUID.randomUUID().toString(),
				(System.currentTimeMillis() / 1000L),
				cv.dv.patente,
				cv.dv.tipoVehiculo,
				cv.dv.velocidadMedida,
				cv.tp,
				maxima
				);
		
		var tktJson = JsonFacade.toJson(tkt);
		
		broker.enviarMensaje(new Mensaje("com.mediator.repository.grabadormulta", tktJson));
		
	}
}
