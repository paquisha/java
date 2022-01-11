
package ec.com.aekmot.sg.servicio;

import ec.com.aekmot.sga.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class PersonaserviceImpl implements PersonaserviceRemote{

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1,"Aime","Pachacama","aime@mail.com","1234567890"));
        personas.add(new Persona(2,"Nathalia","Pachacama","nati@mail.com","0987654321"));
        return personas;
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
    }

    @Override
    public void modificarPersona(Persona persona) {
    }

    @Override
    public void eliminarPerona(Persona persona) {
    }
    
}
