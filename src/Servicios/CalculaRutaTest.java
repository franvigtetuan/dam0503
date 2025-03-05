package Servicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculaRutaTest {
	static CalculaRuta calculaRuta;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calculaRuta=new CalculaRuta();
	}

	@Test
	void testRutaMasRapida() {
		String ruta = calculaRuta.rutaMasRapida("Ventilla", "Barrio del Pilar");
		assertTrue(ruta.contains("Ventilla"));
	}
	
	@Test
	void testRutaOrigenVacio() {
		assertEquals("Ruta no válida",calculaRuta.rutaMasRapida("", "Barrio del Pilar"));
	}
	
	@Test
	void testRutaDestinoVacio() {
		assertEquals("Ruta no válida",calculaRuta.rutaMasRapida("Ventilla",""));
	}
	
	@Test
	void testRutaOrigenDestinoVacio() {
		assertEquals("Ruta no válida",calculaRuta.rutaMasRapida("",""));
	}

	@Test
	void testRutaMasEconomica() {
		String ruta = calculaRuta.rutaMasEconomica("Ventilla", "Barrio del Pilar", 100);
		assertTrue(ruta.contains("Ventilla"));
	}
	
	@Test
	void testRutaMasEconomicaPresupuesto0() {
		String ruta = calculaRuta.rutaMasEconomica("Ventilla", "Barrio del Pilar", 0);
		assertEquals("Sin presupuesto",ruta);
	}

	@Test
	void testRutaConLugaresDeInteres() {
		fail("Not yet implemented");
	}

	@Test
	void testRutaConGasolineras() {
		fail("Not yet implemented");
	}

}
