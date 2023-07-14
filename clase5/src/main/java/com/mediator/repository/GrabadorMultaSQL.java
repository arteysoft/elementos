package com.mediator.repository;

import com.facade.JsonFacade;
import com.mediator.Actor;
import com.mediator.Mensaje;
import com.mediator.dto.Ticket;

import edu.it.factories.ConectorJPA;

public class GrabadorMultaSQL extends Actor {	
	private ConectorJPA conector = null;

	public GrabadorMultaSQL() {
		conector = new ConectorJPA();
	}
	protected void onNewMessage(String strJson) {
		var tkt = JsonFacade.fromJson(strJson, Ticket.class);
		var em = conector.getEntityManager();
		try {
			var tx = em.getTransaction();
			tx.begin();
			em.persist(tkt);
			tx.commit();
		}
		catch (Exception ex) {
			ex.printStackTrace();
			broker.enviarMensaje(new Mensaje("com.mediator.repository.logrecovery", strJson));
		}
	}
}
