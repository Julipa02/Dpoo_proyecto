package com.uniandes.main;

import java.util.ArrayList;
import java.util.List;

import com.uniandes.entidades.Equipo;
import com.uniandes.entidades.Usuario;

public class InicializadorClase {
	public static void main(String[] args) {
		Usuario usuariofantasia = new Usuario();
//		usuariofantasia.setContrasenia();
		for(Equipo equipo : InicializadorClase.devolverEquipos()) {
			System.out.println(equipo.getId());
		}

	}

	public static List<Equipo> devolverEquipos() {
		List<Equipo> equipos = new ArrayList<>();
		for (int i = 0; i < 30; i++) {
			Equipo equipo = new Equipo();
			equipo.setId(String.valueOf(Math.random()));
			equipo.setNombre(String.valueOf(Math.random()));
			equipos.add(equipo);
		}
		return equipos;
	}
}
