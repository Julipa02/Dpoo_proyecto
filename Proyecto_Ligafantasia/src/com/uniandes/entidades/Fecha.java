package com.uniandes.entidades;

import java.util.Date;
import java.util.List;

public class Fecha {
	private String id;
	private Partido partido;
	private Date fecha;
	private int puntaje;
	private List<Formacion> formaciones;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public List<Formacion> getFormaciones() {
		return formaciones;
	}

	public void setFormaciones(List<Formacion> formaciones) {
		this.formaciones = formaciones;
	}

}
