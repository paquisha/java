import java.util.HashSet;
import java.util.Set;

public class DepurarDireccionesCorreo {

    public static void main(String[] args) {
        // Arreglos de las direcciones de correo electrónico
        String servidorA = "usuario1@dominio.com;usuario2@dominio.com;gabriel@dominio.com;gabriel@protonmail.com;gm@grupofmo.com;kevinmitnick@mnsecurity.com;rms@gnu.org;linus@kernel.org;jamesgosling@cmu.edu;dennisritchie@harvard.edu;kenthompson@berkeley.edu";
        String servidorB = "usuario1@dominio.com;usuario2@dominio.com;usuario3@dominio.com;darksoul@protonmail.com;rcd@rcd.com;davek@mnsecurity.com;rms@gnu.org;mdeicaza@gnome.org;alan.turing@ieee.org;gabriel.morejon@presidencia.gob.ec;user1000@berkeley.edu";

        // Conjuntos para cada servidor
        Set<String> conjuntoA = new HashSet<>();
        Set<String> conjuntoB = new HashSet<>();

        // Separar los elementos de los arreglos
        String[] arregloA = servidorA.split(";");
        String[] arregloB = servidorB.split(";");

        // Agregar los elementos a los conjuntos
        for (String cuenta : arregloA) {
            conjuntoA.add(cuenta);
        }

        for (String cuenta : arregloB) {
            conjuntoB.add(cuenta);
        }

        // Mostrar los elementos de los conjuntos
        System.out.println("Conjunto A:");
        for (String cuenta : conjuntoA) {
            System.out.println(cuenta);
        }

        System.out.println("Conjunto B:");
        for (String cuenta : conjuntoB) {
            System.out.println(cuenta);
        }

        // Conjunto depurado
        Set<String> conjuntoDepurado = new HashSet<>();

        // Agregar los elementos de los conjuntos al conjunto depurado
        conjuntoDepurado.addAll(conjuntoA);
        conjuntoDepurado.addAll(conjuntoB);

        // Mostrar el conjunto depurado
        System.out.println("Conjunto depurado:");
        for (String cuenta : conjuntoDepurado) {
            System.out.println(cuenta);
        }
    }
}
