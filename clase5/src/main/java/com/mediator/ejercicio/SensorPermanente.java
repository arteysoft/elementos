package com.mediator.ejercicio;

import com.bolivarsoft.sensorclima.SensorClima;
import com.bolivarsoft.sensorvelocidad.SensorVelocidad;
import com.facade.JsonFacade;
import com.mediator.Actor;
import com.mediator.Mensaje;

public class SensorPermanente extends Actor {
	protected void onNewMessage(String t) {
		var sensorClima = new SensorClima();
        var sensorVelocidad = new SensorVelocidad();
        
        System.out.println(sensorClima.sensar());
        for (;;) {
        	var vehiculo = sensorVelocidad.sensarVehiculo();
        	System.out.println(vehiculo.patente);
            System.out.println(vehiculo.velocidadMedida);
            System.out.println(vehiculo.tipoVehiculo);
            System.out.println();
            
            broker.enviarMensaje(new Mensaje("com.mediator.ejercicio.evaluador", JsonFacade.toJson(vehiculo))); // vehiculo y clima
        }
	}
}
