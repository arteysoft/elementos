package edu.it;

import edu.it.factories.Factory;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
    
        var lector = Factory.obtenerLectorClienteAutoModelo();
        var compra = lector.leer();
        var grabador = Factory.obtenerGrabadorClienteAutoModelo();
        grabador.grabar(compra);
    }
}
