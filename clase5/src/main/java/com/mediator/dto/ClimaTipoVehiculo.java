package com.mediator.dto;

import java.util.Objects;

import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.TipoVehiculo;

public class ClimaTipoVehiculo {
	public final TipoClima tipoClima;
	public final TipoVehiculo tipoVehiculo;
	
	public ClimaTipoVehiculo(TipoClima tipoClima, TipoVehiculo tipoVehiculo) {
		this.tipoClima = tipoClima;
		this.tipoVehiculo = tipoVehiculo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(tipoClima, tipoVehiculo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClimaTipoVehiculo other = (ClimaTipoVehiculo) obj;
		return tipoClima == other.tipoClima && tipoVehiculo == other.tipoVehiculo;
	}
}
