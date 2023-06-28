package edu.it.components;

import edu.it.dto.CompraDTO;
import edu.it.entities.Compra;
import edu.it.utiles.GrabadorJson;

public class GrabadorCompraSQLEventualJSON implements GrabadorClienteAutoModelo {
	private GrabadorClienteAutoModelo grabadorClienteAutoModelo;
	
	// Dependency Injection o Injeccion de dependencia
	public GrabadorCompraSQLEventualJSON(GrabadorClienteAutoModelo grabadorClienteAutoModelo) {		
		this.grabadorClienteAutoModelo = grabadorClienteAutoModelo;
	}
	public void grabar(CompraDTO compra) {
		try {
			grabadorClienteAutoModelo.grabar(compra);
		}
		catch (Exception ex) {
			var compraEntity = new Compra();
			compraEntity.setId(compra.id);
			compraEntity.setNombre(compra.cliente);
			compraEntity.setModelo(compra.autoModelo);
			
			GrabadorJson.grabar(compraEntity);
		}
	}
}
