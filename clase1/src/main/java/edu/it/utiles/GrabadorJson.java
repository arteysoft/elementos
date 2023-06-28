package edu.it.utiles;

import java.io.File;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;
import com.google.gson.Gson;

public class GrabadorJson {
	public static void grabar(edu.it.entities.Compra compra) {
		var strJson = new Gson().toJson(compra);
		var archivo = new File("/var/elementos/" + compra.getId() + ".json");
		try {
			FileUtils.writeStringToFile(archivo, strJson, Charset.defaultCharset());
		}
		catch (Exception ex) {
			// Traga la exception
		}
	}
}
