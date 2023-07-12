package edu.it.elementos;

import com.mediator.Ana;
import com.mediator.Broker;
import com.mediator.Christian;
import com.mediator.MemoryBroker;
import com.mediator.Mensaje;
import com.mediator.Suscriptor;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
        
        // var hm = new HolaMundoImpl();
        // hm.aceptarConexion();
        
        // var obs = new Observable();
        // obs.addNotificable(new Observador());
        // obs.run();
        
        Broker brokerPrincipal = new MemoryBroker();
        
        brokerPrincipal.suscribir(new Suscriptor("com.mediador.christian", new Christian()));
        brokerPrincipal.suscribir(new Suscriptor("com.mediador.ana", new Ana()));
        
        brokerPrincipal.enviarMensaje(new Mensaje("com.mediador.christian", "{}"));
        
        
    }
}
