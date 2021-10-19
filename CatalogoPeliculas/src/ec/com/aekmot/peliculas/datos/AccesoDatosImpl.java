package ec.com.aekmot.peliculas.datos;

import java.io.File;
import java.util.*;

import ec.com.aekmot.peliculas.domain.Pelicula;
import ec.com.aekmot.peliculas.excepciones.*;

public class AccesoDatosImpl  implements IAccesoDatos{

	@Override
	public boolean existe(String nombreRecurso) throws AccesoDatosEx {
		var archivo = new File(nombreRecurso);
		return archivo.exists();
	}

	@Override
	public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crear(String nombreRecurso) throws AccesoDatosEx {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(String nombreRecurso) throws AccesoDatosEx {
		// TODO Auto-generated method stub
		
	}

}
