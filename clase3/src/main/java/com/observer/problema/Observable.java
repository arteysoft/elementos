package com.observer.problema;

import java.util.ArrayList;
import java.util.List;

public class Observable implements Runnable {	
	private List<Notificable<Integer>> listaNotificables = new ArrayList<Notificable<Integer>>();
	
	public void addNotificable(Notificable<Integer> n) {
		listaNotificables.add(n);
	}
	public void run() {
		for (int x = 1; x < 10000000; x++) {
			System.out.println(x);
			if (x % 10000 == 0) {
				for (Notificable<Integer> not : listaNotificables) {
					not.notificar(x);
				}
			}
		}
	}
}
