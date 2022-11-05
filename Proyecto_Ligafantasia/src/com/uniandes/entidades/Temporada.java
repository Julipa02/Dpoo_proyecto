package com.uniandes.entidades;

import java.util.List;

public class Temporada {
	private String id;
	private List<Fecha> fechas;
	private boolean temporada_activa;
	private List<Equipo> equipos;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Fecha> getFechas() {
		return fechas;
	}
	public void setFechas(List<Fecha> fechas) {
		this.fechas = fechas;
	}
	public List<Equipo> getEquipos() {
		return equipos;
	}
	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}
	public boolean isTemporada_activa() {
		return temporada_activa;
	}
	public void setTemporada_activa(boolean temporada_activa) {
		this.temporada_activa = temporada_activa;
	}
	
}
