package com.mediator.repository;

import java.io.File;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

import com.facade.JsonFacade;
import com.mediator.Actor;
import com.mediator.dto.Ticket;

public class LogActividad extends Actor {	
	private String pathTickets = null;
	
	public LogActividad(String pathTickets) {
		this.pathTickets = pathTickets;
	}

	protected void onNewMessage(String strJson) {
		var pathCompleto = pathTickets;
		var separador = "\r\n------------------------------------------------------------------\r\n";
		
		try {
			FileUtils.writeStringToFile(new File(pathCompleto), strJson, Charset.defaultCharset(), true);
			FileUtils.writeStringToFile(new File(pathCompleto), separador, Charset.defaultCharset(), true);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
