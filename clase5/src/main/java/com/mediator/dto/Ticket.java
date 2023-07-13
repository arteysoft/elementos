package com.mediator.dto;

import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.TipoVehiculo;

public class Ticket {
	public String idTicket;
	public Long fechaHora;
	public String patente;
	public TipoVehiculo tipoVehiculo;
	public Integer velocidadMedida;
	public TipoClima tipoClima;
	public Integer limitePermitido;
	
	
	public Ticket(String idTicket, Long fechaHora, String patente, TipoVehiculo tipoVehiculo, Integer velocidadMedida,
			TipoClima tipoClima, Integer limitePermitido) {
		
		this.idTicket = idTicket;
		this.fechaHora = fechaHora;
		this.patente = patente;
		this.tipoVehiculo = tipoVehiculo;
		this.velocidadMedida = velocidadMedida;
		this.tipoClima = tipoClima;
		this.limitePermitido = limitePermitido;
	}
}
