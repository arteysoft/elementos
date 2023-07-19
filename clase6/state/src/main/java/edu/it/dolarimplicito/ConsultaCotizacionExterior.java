package edu.it.dolarimplicito;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import edu.it.State;
import edu.it.model;

public class ConsultaCotizacionExterior implements State {
	public State execute(HashMap<String, Object> mapa) {		
		WebDriver webDriver = null;
		
		try {
			webDriver = new ChromeDriver();
			webDriver.get("https://www.invertironline.com/titulo/cotizacion/NYSE/YPF/YPF/");
			WebElement elemento = webDriver.findElement(By.id("IdTitulo"));
			String contenido = elemento.getText();
			System.out.println("------------------------------------------");
			System.out.println(contenido);
			System.out.println("------------------------------------------");
			webDriver.close();
			String parseable = contenido
                    .replace("US$ ", "")
                    .replace(",", ".");
			
			model.nuevaYork = Double.valueOf(parseable);
			
			return new Calculos(mapa);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return new EstadoInicial(mapa);
	}
}
