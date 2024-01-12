import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del primer integrante: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Ingrese el nombre del segundo integrante: ");
        String nombre2 = scanner.nextLine();

        System.out.print("Ingrese el nombre del tercer integrante: ");
        String nombre3 = scanner.nextLine();

        String nuevoNombre1 = procesarNombre(nombre1);
        String nuevoNombre2 = procesarNombre(nombre2);
        String nuevoNombre3 = procesarNombre(nombre3);

        String resultadoFinal = nuevoNombre1 + "_" + nuevoNombre2 + "_" + nuevoNombre3;
        System.out.println("Resultado final: " + resultadoFinal);

        scanner.close();
    }

    private static String procesarNombre(String nombre) {
        if (nombre.length() < 2) {
            return nombre;
        }

        char segundoCaracterMayuscula = Character.toUpperCase(nombre.charAt(1));

        String ultimosDosCaracteres = nombre.substring(Math.max(0, nombre.length() - 2));

        return segundoCaracterMayuscula + "." + ultimosDosCaracteres;
    }
}