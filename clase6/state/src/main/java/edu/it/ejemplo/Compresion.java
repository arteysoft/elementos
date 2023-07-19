package edu.it.ejemplo;

import edu.it.State;

public class Compresion implements State {
	public State execute() {
		System.out.println("Compresion");
		return new Explosion();
	}

}
