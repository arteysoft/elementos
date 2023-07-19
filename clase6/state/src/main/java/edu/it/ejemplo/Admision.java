package edu.it.ejemplo;

import edu.it.State;

public class Admision implements State {
	public State execute() {		
		System.out.println("Admision");
		return new Compresion();
	}

}
