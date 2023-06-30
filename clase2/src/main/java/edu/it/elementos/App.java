package edu.it.elementos;

import com.bolivarsoft.components.MenuFileSystem;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");

        /*
        Object o = Class.forName("com.bolivarsoft.components")
        	.getConstructor()
        	.newInstance();
        */
        
        MenuFileSystem.crearMenu().mostrarMenu();
    }
}
