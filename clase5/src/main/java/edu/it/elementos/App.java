package edu.it.elementos;


import com.mediator.Broker;
import com.mediator.Evaluador;
import com.mediator.MemoryBroker;
import com.mediator.Mensaje;
import com.mediator.Suscriptor;
import com.mediator.ejercicio.SensorPermanente;
import com.mediator.repository.GrabadorMulta;
import com.mediator.repository.GrabadorMultaJson;
import com.mediator.repository.GrabadorMultaSQL;
import com.mediator.repository.LogActividad;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
        
        Broker brokerPrincipal = new MemoryBroker();
        
        brokerPrincipal.suscribir(new Suscriptor("com.mediator.ejercicio.sensorpermanente", new SensorPermanente()));
        brokerPrincipal.suscribir(new Suscriptor("com.mediator.ejercicio.evaluador", new Evaluador()));
        brokerPrincipal.suscribir(new Suscriptor("com.mediator.repository.grabadormulta", new GrabadorMulta()));
        brokerPrincipal.suscribir(new Suscriptor("com.mediator.repository.grabadormultajson", new GrabadorMultaJson()));
        brokerPrincipal.suscribir(new Suscriptor("com.mediator.repository.grabadormultasql", new GrabadorMultaSQL()));
        brokerPrincipal.suscribir(new Suscriptor("com.mediator.repository.logactividad", new LogActividad("/var/elementos/logs/log.log")));
        brokerPrincipal.suscribir(new Suscriptor("com.mediator.repository.logrecovery", new LogActividad("/var/elementos/logs/recovery/log.log")));
        // brokerPrincipal.suscribir(new Suscriptor("com.mediator.repository.recoveryPermanente", FALTA ESTE ACTOR));
        
        
        brokerPrincipal.enviarMensaje(new Mensaje("com.mediator.ejercicio.sensorpermanente", new String("GO")));
    }
}
