package com.uniandes.entidades;

import java.util.List;

public class Equipo {
	private String id;
	private boolean equipo_real;
	private List<Jugador> jugadores;
	private String nombre;
	private double presupuesto;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isEquipo_real() {
		return equipo_real;
	}

	public void setEquipo_real(boolean equipo_real) {
		this.equipo_real = equipo_real;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

}
