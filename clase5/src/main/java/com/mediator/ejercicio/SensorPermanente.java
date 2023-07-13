package com.mediator.ejercicio;

import com.bolivarsoft.sensorclima.SensorClima;
import com.bolivarsoft.sensorvelocidad.SensorVelocidad;
import com.facade.JsonFacade;
import com.mediator.Actor;
import com.mediator.Mensaje;
import com.mediator.dto.ClimaVehiculo;

public class SensorPermanente extends Actor {
	protected void onNewMessage(String t) {
		var sensorClima = new SensorClima();
        var sensorVelocidad = new SensorVelocidad();
        
        var tipoDeClima = sensorClima.sensar();
        System.out.println(tipoDeClima);
        for (;;) {
        	var vehiculo = sensorVelocidad.sensarVehiculo();
        	System.out.println(vehiculo.patente);
            System.out.println(vehiculo.velocidadMedida);
            System.out.println(vehiculo.tipoVehiculo);
            System.out.println();
            
            var strClimaVehiculo = JsonFacade.toJson(new ClimaVehiculo(tipoDeClima, vehiculo));
            
            broker.enviarMensaje(new Mensaje("com.mediator.ejercicio.evaluador", strClimaVehiculo));
        }
	}
}
