import java.util.HashSet;
import java.util.Set;

public class DepurarCorreos {
    public static void main(String[] args) {
        String servidorA = "usuario1@dominio.com;usuario2@dominio.com;gabriel@dominio.com;gabriel@protonmail.com;gm@grupofmo.com;kevinmitnick@mnsecurity.com;rms@gnu.org;linus@kernel.org;jamesgosling@cmu.edu;dennisritchie@harvard.edu;kenthompson@berkeley.edu";
        String servidorB = "usuario1@dominio.com;usuario2@dominio.com;usuario3@dominio.com;darksoul@protonmail.com;rcd@rcd.com;davek@mnsecurity.com;rms@gnu.org;mdeicaza@gnome.org;alan.turing@ieee.org;gabriel.morejon@presidencia.gob.ec;user1000@berkeley.edu";

        // Crear conjuntos para cada servidor
        Set<String> conjuntoA = new HashSet<>();
        Set<String> conjuntoB = new HashSet<>();

        // Dividir las cadenas y agregar elementos a los conjuntos
        agregarCorreosAlConjunto(servidorA, conjuntoA);
        agregarCorreosAlConjunto(servidorB, conjuntoB);

        // Mostrar elementos de cada conjunto
        System.out.println("Elementos en conjuntoA:");
        mostrarConjunto(conjuntoA);

        System.out.println("\nElementos en conjuntoB:");
        mostrarConjunto(conjuntoB);

        // Unir los conjuntos para obtener la depuración
        Set<String> depuracion = new HashSet<>(conjuntoA);
        depuracion.addAll(conjuntoB);

        // Mostrar el conjunto depurado
        System.out.println("\nDepuración (sin repetir elementos):");
        mostrarConjunto(depuracion);
    }

    // Método para agregar correos a un conjunto
    private static void agregarCorreosAlConjunto(String cadenaCorreos, Set<String> conjunto) {
        String[] correos = cadenaCorreos.split(";");
        for (String correo : correos) {
            conjunto.add(correo.trim());
        }
    }

    // Método para mostrar elementos de un conjunto
    private static void mostrarConjunto(Set<String> conjunto) {
        for (String elemento : conjunto) {
            System.out.println(elemento);
        }
    }
}
