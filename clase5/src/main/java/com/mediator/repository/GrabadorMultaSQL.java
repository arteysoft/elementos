package com.mediator.repository;

import com.facade.JsonFacade;
import com.mediator.Actor;
import com.mediator.dto.Ticket;

public class GrabadorMultaSQL extends Actor {	
	protected void onNewMessage(String strJson) {
		var tkt = JsonFacade.fromJson(strJson, Ticket.class);
	}
}
