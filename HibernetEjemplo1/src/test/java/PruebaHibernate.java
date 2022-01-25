import javax.persistence.*;
import java.util.List;

public class PruebaHibernate {
    public static void main(String[] args) {

        //listar
        PersonaDao personaDao = new PersonaDao();
        personaDao.listar();

        Persona persona = new Persona();
        persona.setIdPersona(3);
        persona = personaDao.buscarPersonaPorId(persona);
        System.out.println("persona encontrada: " + persona);


        //insertar
        /*Persona persona = new Persona();
        persona.setNombre("Evelyn");
        persona.setApellido("Benavides");
        persona.setEmail("evelyn@mail.com");
        persona.setTelefono("1234567890");
        personaDao.insertar(persona);*/


        //modificar
        /*Persona personaModificada = new Persona();
        personaModificada.setIdPersona(2);
        personaModificada.setNombre("Iveth");
        personaModificada.setApellido("Pachacama");
        personaModificada.setEmail("iveth@mail.com");
        personaModificada.setTelefono("1234567890");
        personaDao.modificar(personaModificada);*/

        //eliminar
        personaDao.eliminar(persona);
        personaDao.listar();

    }
}
