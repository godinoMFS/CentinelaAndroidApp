package com.example.asteroides;

import java.util.Vector;

public class AlmacenPuntuacionesArray implements AlmacenPuntuaciones {

	private Vector<String> puntuaciones;

	public AlmacenPuntuacionesArray() {
		puntuaciones = new Vector<String>();
		puntuaciones.add("123000 Pepito Dominguez");
		puntuaciones.add("111000 Pedro Martinez");
		puntuaciones.add("011000 Paco Perez");
	}

	@Override
	public void guardarPuntuacion(int puntos, String Nombre, long fecha) {
		puntuaciones.add(0, puntos + " " + Nombre);

	}

	@Override
	public Vector<String> listaPuntuaciones(int cantidad) {

		return puntuaciones;
	}

}
