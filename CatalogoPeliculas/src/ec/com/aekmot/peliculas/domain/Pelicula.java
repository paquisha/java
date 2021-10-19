package ec.com.aekmot.peliculas.domain;

public class Pelicula {
	
	private String nombre;

	public Pelicula() {
		// TODO Auto-generated constructor stub
	}

	public Pelicula(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + "]";
	}
		
}
