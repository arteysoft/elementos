package edu.it.Utiles;

public class Util {
	public static void dormir(Integer seg) {
		try {
			Thread.sleep(seg * 1000);
		}
		catch (Exception ex) {
			
		}
	}
}
