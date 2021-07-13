package org.agrijalva.utm;

import java.util.Date;

public class Empleado {
	private int idEmpleado;
	private String cedula;
	private String nombres;
	private String apellidos;
	private Date fechaingreso;
	private float sueldoMensual;
	private float porcentajeProyecto;
	private int numeroProyecto;
	
	
	
	public Empleado() {
		super();
	}
	
	
	public Empleado(int idEmpleado, String cedula, String nombres, String apellidos, Date fechaingreso,
			float sueldoMensual, float porcentajeProyecto, int numeroProyecto) {
		super();
		this.idEmpleado = idEmpleado;
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaingreso = fechaingreso;
		this.sueldoMensual = sueldoMensual;
		this.porcentajeProyecto = porcentajeProyecto;
		this.numeroProyecto = numeroProyecto;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Date getFechaingreso() {
		return fechaingreso;
	}
	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}
	public float getSueldoMensual() {
		return sueldoMensual;
	}
	public void setSueldoMensual(float sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}
	public float getPorcentajeProyecto() {
		return porcentajeProyecto;
	}
	public void setPorcentajeProyecto(float porcentajeProyecto) {
		this.porcentajeProyecto = porcentajeProyecto;
	}
	public int getNumeroProyecto() {
		return numeroProyecto;
	}
	public void setNumeroProyecto(int numeroProyecto) {
	
		this.numeroProyecto = numeroProyecto;
	}
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", cedula=" + cedula + ", nombres=" + nombres + ", apellidos="
				+ apellidos + ", fechaingreso=" + fechaingreso + ", sueldoMensual=" + sueldoMensual
				+ ", porcentajeProyecto=" + porcentajeProyecto + ", numeroProyecto=" + numeroProyecto + "]";
	}
		
	
}
