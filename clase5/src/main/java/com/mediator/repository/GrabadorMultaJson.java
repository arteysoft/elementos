package com.mediator.repository;

import java.io.File;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

import com.facade.JsonFacade;
import com.mediator.Actor;
import com.mediator.dto.Ticket;

public class GrabadorMultaJson extends Actor {
	private String pathTickets = "/var/elementos/multas";
	
	protected void onNewMessage(String strJson) {
		var tkt = JsonFacade.fromJson(strJson, Ticket.class);
		var pathCompleto = String.join("", pathTickets, "/", tkt.idTicket, ".json");
		
		try {
			FileUtils.writeStringToFile(new File(pathCompleto), strJson, Charset.defaultCharset());
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
