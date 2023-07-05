package com.inversiondecontrol.ejemplo;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class Template {
	public void aceptarConexion() {
		int portNumber = 8888;
		try {
			ServerSocket serverSocket = new ServerSocket(portNumber);
			
			for (;;) {				
				Socket clientSocket = serverSocket.accept();
				
				var writer = new PrintWriter(clientSocket.getOutputStream(), true);			
				var strBuffer = new StringBuilder()
						.append("HTTP/1.1 200 OK")
						.append("\r\n")
						.append("Content-Type: text/html")
						.append("\r\n")
						.append("Content-Length: ")
						.append(obtenerLargoMensaje() * 3)
						.append("\r\n")
						.append("\r\n")
						.append(obtenerContenido())
						.append(obtenerContenido())
						.append(obtenerContenido());
				
				writer.println(strBuffer.toString());
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	protected abstract String obtenerContenido();
	protected abstract Integer obtenerLargoMensaje();
}
