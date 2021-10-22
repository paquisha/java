package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.*;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
               
        ///insertar en db nuevo objeto        
        /*Persona personaNueva = new Persona("Maria", "Banda", "maria@mail.com", "1234567890");
        personaDao.insertar(personaNueva);*/
        
        Persona personaModificar = new Persona(4, "Juan Carlos", "Esparza", "jcesparza@mail.com", "554456587");
        personaDao.actualizar(personaModificar);
        
        /*Persona borrarPersona = new Persona(5);
        personaDao.borrar(borrarPersona);*/
        List<Persona> personas = personaDao.seleccionar();
        //for normal para iterar datos de tablas
        for(Persona persona: personas){
            System.out.println("persona: " + persona);
        }
        //funciones lambda
        /*personas.forEach(persona -> {
            System.out.println("persona = " + personas);
        });*/
    }
}
