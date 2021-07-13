package org.agrijalva.utm;

public class Contrato {
	private String terminoFijo;
	private String indefinido;
	private String prestacionServicios;
	
	
	
	public Contrato() {
		super();
	}
	
	
	public Contrato(String terminoFijo, String indefinido, String prestacionServicios) {
		super();
		this.terminoFijo = terminoFijo;
		this.indefinido = indefinido;
		this.prestacionServicios = prestacionServicios;
	}
	public String getTerminoFijo() {
		return terminoFijo;
	}
	public void setTerminoFijo(String terminoFijo) {
		this.terminoFijo = terminoFijo;
	}
	public String getIndefinido() {
		return indefinido;
	}
	public void setIndefinido(String indefinido) {
		this.indefinido = indefinido;
	}
	public String getPrestacionServicios() {
		return prestacionServicios;
	}
	public void setPrestacionServicios(String prestacionServicios) {
		this.prestacionServicios = prestacionServicios;
	}
	@Override
	public String toString() {
		return "Contrato [terminoFijo=" + terminoFijo + ", indefinido=" + indefinido + ", prestacionServicios="
				+ prestacionServicios + "]";
	}
	
	
}
