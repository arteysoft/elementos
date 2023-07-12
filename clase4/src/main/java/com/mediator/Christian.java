package com.mediator;

public class Christian extends Actor {	
	protected void onNewMessage(String t) {
		System.out.println("Me llego el siguiente mensaje: " + t);
	}
}
