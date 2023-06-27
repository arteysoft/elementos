package edu.it.components;

import java.util.Scanner;

import edu.it.dto.CompraDTO;

public class LeerConsolaClienteAutoModelo implements LectorClienteAutoModelo {
	public CompraDTO leer() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el cliente: ");
		String cliente = teclado.next();
		System.out.println("Ingrese el modelo: ");
		String modelo = teclado.next();
		var compra = new CompraDTO(cliente, modelo);
		return compra;
	}
}
