package edu.it.factories;

import edu.it.components.GrabadorClienteAutoModelo;
import edu.it.components.GrabadorClienteAutoModeloSQL;
import edu.it.components.GrabadorCompraSQLEventualJSON;
import edu.it.components.LectorClienteAutoModelo;
import edu.it.components.LeerConsolaClienteAutoModelo;

public class Factory {
	public static LectorClienteAutoModelo obtenerLectorClienteAutoModelo() {
		return new LeerConsolaClienteAutoModelo();
	}
	public static GrabadorClienteAutoModelo obtenerGrabadorClienteAutoModelo() {
		return new GrabadorCompraSQLEventualJSON(
				new GrabadorClienteAutoModeloSQL()
		);
	}
}
