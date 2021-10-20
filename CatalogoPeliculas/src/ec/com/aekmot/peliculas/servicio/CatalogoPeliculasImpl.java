package ec.com.aekmot.peliculas.servicio;

import ec.com.aekmot.peliculas.datos.AccesoDatosImpl;
import ec.com.aekmot.peliculas.datos.IAccesoDatos;
import ec.com.aekmot.peliculas.domain.Pelicula;
import ec.com.aekmot.peliculas.excepciones.AccesoDatosEx;
import ec.com.aekmot.peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {
	
	private final IAccesoDatos datos;
	
	public CatalogoPeliculasImpl() {
		this.datos = new AccesoDatosImpl();
	}

	public void agregarPelicula(String nombrePelicula) {
		Pelicula pelicula = new Pelicula(nombrePelicula);
		boolean anexar = false;
		try {
			anexar = datos.existe(NOMBRE_RECURSO);
			datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
		} catch (AccesoDatosEx ex) {
			System.out.println("Error de acceso a datos");
			ex.printStackTrace(System.out);
		}		
	}

	public void listarPeliculas() {
		try {
			var peliculas = this.datos.listar(NOMBRE_RECURSO);
			for(var pelicula: peliculas) {
				System.out.println("pelicula: " + pelicula);
			}
		} catch (LecturaDatosEx e) {
			System.out.println("Error de acceso a datos");
			e.printStackTrace(System.out);
		}	
	}

	public void buscarPeliculas(String buscar) {
		String resultado = null;
		try {
			resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
		} catch (LecturaDatosEx e) {
			System.out.println("Error de acceso a datos");
			e.printStackTrace(System.out);
		}
	}

	public void iniciarCatalogoPeliculas() {
		try {
			if(this.datos.existe(NOMBRE_RECURSO)) {
				datos.borrar(NOMBRE_RECURSO);
				datos.crear(NOMBRE_RECURSO);
			}else {
				datos.crear(NOMBRE_RECURSO);
			}
		} catch (AccesoDatosEx e) {
			System.out.println("Error al iniciar el catalogo de peliculas");
			e.printStackTrace(System.out);
		}
	}

}
