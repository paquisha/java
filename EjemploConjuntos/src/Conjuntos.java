import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
    public static void main(String[] args) {

        Set <String> contabilidad = new HashSet <>(Arrays.asList("Ana", "Juan", "Johana", "Pedro", "Carlos", "Felipe", "Cecilia"));
        Set <String> tesoreria = new HashSet<>(Arrays.asList("Tatiana", "Juan", "Marcos", "Rolando", "Miriam", "Felipe", "Cecilia"));

        System.out.println("Conjunto Contabilidad:" +contabilidad);
        System.out.println("Conjunto tesoreria: "+ tesoreria);

        //personas pertenecen a ambos departamentos
        Set <String> interseccion = new HashSet<>(contabilidad);
        interseccion.retainAll(tesoreria);
        System.out.println("¿Qué personas pertenecen a ambos departamentos?");
        System.out.println(interseccion);


        //union de conjuntos
        Set<String> union = new HashSet<>(contabilidad);
        union.addAll(tesoreria);
        System.out.println("¿Quiénes están en al menos uno de los dos departamentos?");
        System.out.println(union);

        //solo contabilidad
        Set<String> soloContabilidad = new HashSet<>(contabilidad);
        soloContabilidad.removeAll(tesoreria);
        System.out.println("¿Qué personas pertenecen al departamento de Contabilidad, pero no al otro departamento?");
        System.out.println(soloContabilidad);


        //solo tesoreria
        Set<String> soloTesoreria = new HashSet<>(tesoreria);
        soloTesoreria.removeAll(contabilidad);
        System.out.println("¿Qué personas pertenecen únicamente al departamento de Tesorería?");
        System.out.println(soloTesoreria);


        //sin repetidos en conjuntos
        System.out.println("¿Qué personas pertenecen a un único departamento?");
        System.out.println("Contabilidad: " + soloContabilidad);
        System.out.println("Tesoreria: " + soloTesoreria);

    }
}
