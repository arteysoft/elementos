package edu.it.ejemplo;

import edu.it.State;

public class EstadoPrincipal implements State {

	@Override
	public State execute() {		
		return new Admision();
	}
}
