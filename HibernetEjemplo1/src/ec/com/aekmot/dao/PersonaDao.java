import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class PersonaDao {
    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDao(){
        emf = Persistence.createEntityManagerFactory("HibernateEjemplo1");
        em = emf.createEntityManager();
    }

    public void listar(){
        String hql = "SELECT p FROM Persona p";
        Query query = em.createQuery(hql);
        List<Persona> personas = query.getResultList();
        for(Persona p: personas){
            System.out.println("personas dao: " + p);
        }
    }

    public void insertar(Persona persona){
        try{
            em.getTransaction().begin();
            em.persist(persona);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        }finally {
            if(em != null){
                em.close();
            }
        }
    }

    public void modificar(Persona persona){
        try{
            em.getTransaction().begin();
            em.merge(persona);
            em.getTransaction().commit();
        }catch (Exception ex){
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        }finally {
            if(em != null){
                em.close();
            }
        }
    }

    //buscarpersona
    public Persona buscarPersonaPorId(Persona p){
        return em.find(Persona.class, p.getIdPersona());
    }
}
