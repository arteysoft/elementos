package com.modeloactor.ejemplo;

public class SegundoActor extends Actor {
	protected void onNewMessage(String t) {
		System.out.println("Soy el segundo actor");
		System.out.println(t);
		for (int x=0; x < 100; x++) {
			try  {Thread.sleep(10); } catch (Exception ex) {}
			System.out.print(".");
		}
	}
}
