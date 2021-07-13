package org.agrijalva.utm;

import java.util.Date;

public class Empleado extends Persona{
	
	Persona persona;
	private Date fechaIngreso;
	private float sueldoBasico;
	private float procentajeProyectos;
	private int numeroProyectos;
	
	
	public Empleado() {
	}
	
	public Empleado(Persona persona, Date fechaIngreso, float sueldoBasico, float procentajeProyectos,
			int numeroProyectos) {
		super();
		this.persona = persona;
		this.fechaIngreso = new Date();
		this.sueldoBasico = sueldoBasico;
		this.procentajeProyectos = procentajeProyectos;
		this.numeroProyectos = numeroProyectos;
	}
	
	
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public float getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	public float getProcentajeProyectos() {
		return procentajeProyectos;
	}
	public void setProcentajeProyectos(float procentajeProyectos) {
		this.procentajeProyectos = procentajeProyectos;
	}
	public int getNumeroProyectos() {
		return numeroProyectos;
	}
	public void setNumeroProyectos(int numeroProyectos) {
		this.numeroProyectos = numeroProyectos;
	}

	@Override
	public String toString() {
		return "Empleado [persona=" + persona + ", fechaIngreso=" + fechaIngreso + ", sueldoBasico=" + sueldoBasico
				+ ", procentajeProyectos=" + procentajeProyectos + ", numeroProyectos=" + numeroProyectos + "]";
	}
	
	
}
