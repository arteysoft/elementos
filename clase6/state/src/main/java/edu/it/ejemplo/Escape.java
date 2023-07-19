package edu.it.ejemplo;

import edu.it.State;

public class Escape implements State {
	public State execute() {
		System.out.println("Escape");
		return new Admision();
	}

}
