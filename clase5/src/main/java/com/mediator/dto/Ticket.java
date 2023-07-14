package com.mediator.dto;

import javax.persistence.*;

import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.TipoVehiculo;

@Entity
public class Ticket {
	@Id
	@Column(name="id")
	public String idTicket;
	@Column(name="fecha_hora")
	public Long fechaHora;
	public String patente;
	@Column(name="tipo_vehiculo")
	public TipoVehiculo tipoVehiculo;
	@Column(name="velocidad_medida")
	public Integer velocidadMedida;
	@Column(name="tipo_clima")
	public TipoClima tipoClima;
	@Column(name="limite_permitido")
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
