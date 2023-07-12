package edu.it.elementos;

import com.bolivarsoft.sensorclima.SensorClima;
import com.bolivarsoft.sensorvelocidad.SensorVelocidad;
import com.google.gson.Gson;
import com.mediator.Ana;
import com.mediator.Broker;
import com.mediator.Christian;
import com.mediator.MemoryBroker;
import com.mediator.Mensaje;
import com.mediator.Numero;
import com.mediator.Suscriptor;
import com.mediator.ejercicio.SensorPermanente;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
        
        
        Broker brokerPrincipal = new MemoryBroker();
        
        brokerPrincipal.suscribir(new Suscriptor("com.mediator.ejercicio.sensorpermanente", new SensorPermanente()));
        brokerPrincipal.suscribir(new Suscriptor("com.mediator.ejercicio.evaluador", new Ana()));
        
        brokerPrincipal.enviarMensaje(new Mensaje("com.mediator.ejercicio.sensorpermanente", new String("GO")));
    }
}
