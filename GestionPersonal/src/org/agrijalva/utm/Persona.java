package org.agrijalva.utm;

public class Persona {
	private String ci;
	private String nombre;
	private String apellidos;
	
	public Persona() {
		super();
	}
	
	
	public Persona(String ci, String nombre, String apellidos) {
		super();
		this.ci = ci;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}


	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	@Override
	public String toString() {
		return "Persona [ci=" + ci + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
		
}
