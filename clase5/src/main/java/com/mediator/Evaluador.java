package com.mediator;

import java.util.UUID;

import com.facade.JsonFacade;
import com.mediator.dto.ClimaVehiculo;
import com.mediator.dto.Ticket;

public class Evaluador extends Actor {	
	protected void onNewMessage(String strJson) {
		System.out.println(strJson);
		
		var cv = com.facade.JsonFacade.fromJson(strJson, ClimaVehiculo.class);
		
		// IF MULTA
		var tkt = new Ticket(
				UUID.randomUUID().toString(),
				(System.currentTimeMillis() / 1000L),
				cv.dv.patente,
				cv.dv.tipoVehiculo,
				cv.dv.velocidadMedida,
				cv.tp,
				10000
				);
		
		var tktJson = JsonFacade.toJson(tkt);
		
		broker.enviarMensaje(new Mensaje("com.mediator.repository.grabadormulta", tktJson));
	}
}
