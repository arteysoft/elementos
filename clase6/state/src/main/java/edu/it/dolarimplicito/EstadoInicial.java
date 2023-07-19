package edu.it.dolarimplicito;

import java.util.HashMap;

import edu.it.State;

public class EstadoInicial implements State {
	public State execute(HashMap<String, Object> mapa) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\cursos\\elementos\\clase6\\state\\chromedriver.exe");
		
		System.out.println("Estado incial");		
		return new ConsultaCotizacionLocal();
	}
}
