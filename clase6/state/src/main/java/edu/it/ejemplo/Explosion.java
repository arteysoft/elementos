package edu.it.ejemplo;

import edu.it.State;

public class Explosion implements State {
	public State execute() {
		System.out.println("Explosion");
		return new Escape();
	}
}
