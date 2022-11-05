package com.uniandes.entidades;

public class Formacion {
	private String id;
	private Jugador jugador;
	private boolean titular;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public boolean isTitular() {
		return titular;
	}

	public void setTitular(boolean titular) {
		this.titular = titular;
	}

}
