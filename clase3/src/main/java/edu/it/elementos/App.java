package edu.it.elementos;

import com.inversiondecontrol.ejemplo.HolaMundoImpl;
import com.observer.problema.Observable;
import com.observer.problema.Observador;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
        
        // var hm = new HolaMundoImpl();
        // hm.aceptarConexion();
        
        var obs = new Observable();
        obs.addNotificable(new Observador());
        obs.run();
    }
}
