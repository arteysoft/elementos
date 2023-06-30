package com.bolivarsoft.components;

import javax.mispec.menu.Menu;

public class MenuGitHub implements Menu {
	public void mostrarMenu() {
		System.out.println("Mostrar menu configurado desde github");
	}
	public Menu crearMenu() {
		System.out.println("Creando menu configurado desde github");
		return null;
	}
}
