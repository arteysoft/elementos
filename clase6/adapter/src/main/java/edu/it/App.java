package edu.it;

import com.google.gson.Gson;

import edu.it.factories.Factory;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
        
        Factory.crearServicioDiscador().run();
    }
}
