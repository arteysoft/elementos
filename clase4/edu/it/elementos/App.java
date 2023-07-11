package edu.it.elementos;

import com.modeloactor.ejemplo.Actor;
import com.modeloactor.ejemplo.MiPrimerActor;
import com.modeloactor.ejemplo.SegundoActor;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
        
        // var hm = new HolaMundoImpl();
        // hm.aceptarConexion();
        
        // var obs = new Observable();
        // obs.addNotificable(new Observador());
        // obs.run();
        
        Actor segundoActor = new SegundoActor();
        Actor miPrimerActor = new MiPrimerActor(segundoActor);
        
        miPrimerActor.encolarMensaje("100");
    }
}
