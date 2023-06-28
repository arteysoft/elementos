package edu.it.dto;

public class CompraDTO {
	public final String id;
	public final String cliente;
	public final String autoModelo;
	
	public CompraDTO(String id, String cliente, String autoModelo) {
		this.id = id;
		this.cliente = cliente;
		this.autoModelo = autoModelo;
	}
}
