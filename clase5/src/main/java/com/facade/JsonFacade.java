package com.facade;

import java.sql.Date;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class JsonFacade {
	private static Gson gson = new Gson();  // Aca podriamos tener un strategy para ver si 
	                                        // usamos Gson o Apache
	
	public static String toJson(Object o) {
		return gson.toJson(o);
	}
	public <T> T fromJson(String json, Class<T> classOfT) {
		 return gson.fromJson(json, classOfT);
	}
}
