package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.*;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        List<Persona> personas = personaDao.seleccionar();
        
        ///insertar en db nuevo objeto
        
        /*Persona personaNueva = new Persona("Maria", "Banda", "maria@mail.com", "1234567890");
        personaDao.insertar(personaNueva);*/
        
        Persona actualizarPersona = new Persona(6, "Nachita", "Banda", "nachita@mail.com", "0987654321");
        personaDao.actualizar(actualizarPersona);
        
        /*Persona borrarPersona = new Persona(5);
        personaDao.borrar(borrarPersona);*/
        
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
