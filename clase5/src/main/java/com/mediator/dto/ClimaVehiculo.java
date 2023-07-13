package com.mediator.dto;

import java.util.Objects;

import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.DatosVehiculo;
import com.bolivarsoft.sensorvelocidad.TipoVehiculo;

public class ClimaVehiculo {
	public final TipoClima tp;
	public final DatosVehiculo dv;
	
	public ClimaVehiculo(TipoClima tp, DatosVehiculo dv) {
		this.tp = tp;
		this.dv = dv;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dv, tp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClimaVehiculo other = (ClimaVehiculo) obj;
		return Objects.equals(dv, other.dv) && tp == other.tp;
	}
}
