package edu.it.elementos;

import javax.mispec.menu.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");
        
        Menu m = (Menu)Class.forName(args[0])
        	.getConstructor()
        	.newInstance();
        
        m
        .crearMenu()        
        .mostrarMenu();
    }
}
