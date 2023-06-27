package edu.it.components;

import java.util.UUID;

import edu.it.dto.CompraDTO;
import edu.it.entities.Compra;
import edu.it.factories.ConectorJPA;

public class GrabadorClienteAutoModeloSQL implements GrabadorClienteAutoModelo {
	public void grabar(CompraDTO compraDTO) {
		System.out.println("Grabando en SQL la compra");
		System.out.println(compraDTO.cliente);
		System.out.println(compraDTO.autoModelo);
		
		// Pasar CompraDTO a Compra Entity
		
		var compra = new Compra();
		compra.setId(UUID.randomUUID().toString());
		compra.setNombre(compraDTO.cliente);
		compra.setModelo(compraDTO.autoModelo);
		
		var conector = new ConectorJPA();
		var em = conector.getEntityManager();
		var tx = em.getTransaction();
		tx.begin();
		em.persist(compra);
		tx.commit();
	}
}
