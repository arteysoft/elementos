package edu.it.elementos;

import javax.mispec.menu.MenuItem;

public class ServicioHora implements MenuItem {	
	public void ejecutarOpcionMenu() {
		System.out.println(System.currentTimeMillis() / 1000);		
	}
}
