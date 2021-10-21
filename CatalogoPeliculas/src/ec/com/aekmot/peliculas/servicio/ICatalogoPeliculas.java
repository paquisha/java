package ec.com.aekmot.peliculas.servicio;

public interface ICatalogoPeliculas {
	
	String NOMBRE_RECURSO = "peliculas.txt";
	void agregarPelicula(String nombrePelicula);
	
	void listarPeliculas();
	
	void buscarPeliculas(String buscar);
	
	void iniciarCatalogoPeliculas();
}