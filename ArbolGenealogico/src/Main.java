import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArbolGenealogico arbol = new ArbolGenealogico();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion(scanner);
            procesarOpcion(opcion, arbol, scanner);
        } while (opcion != 10);
    }

    private static void mostrarMenu() {
        System.out.println("** Menú **");
        System.out.println("1. Agregar nodo");
        System.out.println("2. Saber si el árbol está vacío");
        System.out.println("3. Buscar un nodo");
        System.out.println("4. Eliminar un nodo");
        System.out.println("5. Mostrar recorrido de orden");
        System.out.println("6. Mostrar recorrido en preorden");
        System.out.println("7. Mostrar recorrido en postorden");
        System.out.println("8. Mostrar el árbol");
        System.out.println("9. Profundidad del árbol");
        System.out.println("10. Salir");
        System.out.print("Ingrese una opción: ");
    }

    private static int leerOpcion(Scanner scanner) {
        int opcion = 0;
        while (true) {
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        return opcion;
    }

    private static void procesarOpcion(int opcion, ArbolGenealogico arbol, Scanner scanner) {
        switch (opcion) {
            case 1:
                agregarNodo(arbol, scanner);
                break;
            case 2:
                System.out.println("El árbol está " + (arbol.estaVacio() ? "vacío" : "lleno"));
                break;
            case 3:
                buscarNodo(arbol, scanner);
                break;
            case 4:
                eliminarNodo(arbol, scanner);
                break;
            case 5:
                arbol.mostrarRecorridoInorden();
                break;
            case 6:
                arbol.mostrarRecorridoPreorden();
                break;
            case 7:
                arbol.mostrarRecorridoPostorden();
                break;
            case 8:
                arbol.mostrarArbol();
                break;
            case 9:
                System.out.println("La profundidad del árbol es " + arbol.profundidadArbol());
                break;
            case 10:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    private static void agregarNodo(ArbolGenealogico arbol, Scanner scanner) {
        System.out.print("Ingrese el nombre del nodo a agregar: ");
        String nombre = scanner.nextLine();
        arbol.insertar(nombre);
    }

    private static void buscarNodo(ArbolGenealogico arbol, Scanner scanner) {
        System.out.print("Ingrese el nombre del nodo a buscar: ");
        String nombre = scanner.nextLine();
        Nodo nodo = arbol.buscar(nombre);
        if (nodo != null) {
            System.out.println("El nodo se encontró");
        } else {
            System.out.println("El nodo no se encontró");
        }
    }

    private static void eliminarNodo(ArbolGenealogico arbol, Scanner scanner) {
        System.out.print("Ingrese el nombre del nodo a eliminar: ");
        String nombre = scanner.nextLine();
        arbol.eliminar(nombre);
    }
}