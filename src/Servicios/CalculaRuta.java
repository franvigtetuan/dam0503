package Servicios;

import java.util.List;

public class CalculaRuta {
	public String rutaMasRapida(String origen, String destino) {
		if(!origen.isEmpty() && !origen.isEmpty())	
			return "Ruta más rápida entre " +origen + " y " +destino;
		return "Ruta no válida";
	}

	public String rutaMasEconomica(String origen, String destino, double presupuesto) {
		// Simulación de cálculo de ruta más económica
		//presupuesto>0
		return "Ruta 2";
	}

	public String rutaConLugaresDeInteres(String origen, String destino, List<String> lugaresDeInteres) {
	    // Simulación de cálculo de ruta con lugares de interés
		//!lugaresDeInteres.isEmpty()
	    return "Ruta 3";
	}

	public String rutaConGasolineras(String origen, String destino, int numGasolineras) {
		// Simulación de cálculo de ruta con gasolineras
		return "Ruta 4";
	}
}
