import java.util.*;

public class Recetario {
    private Map<String, String> recetas;

    public Recetario() {
        this.recetas = new HashMap<>();
    }

    // Agregar o modificar una receta
    public void agregarReceta(String nombreReceta, String ingredientes) {
        recetas.put(nombreReceta, ingredientes);
    }

    // Obtener una receta por su nombre
    public String obtenerReceta(String nombreReceta) {
        return recetas.get(nombreReceta);
    }

    // Mostrar todas las recetas en orden ascendente por nombre
    public void mostrarRecetasAscendente() {
        TreeMap<String, String> recetasOrdenadas = new TreeMap<>(recetas);
        for (Map.Entry<String, String> entry : recetasOrdenadas.entrySet()) {
            System.out.println("Receta: " + entry.getKey() + ", Ingredientes: " + entry.getValue());
        }
    }

    // Mostrar todas las recetas en orden descendente por nombre
    public void mostrarRecetasDescendente() {
        TreeMap<String, String> recetasOrdenadas = new TreeMap<>(Collections.reverseOrder());
        recetasOrdenadas.putAll(recetas);
        for (Map.Entry<String, String> entry : recetasOrdenadas.entrySet()) {
            System.out.println("Receta: " + entry.getKey() + ", Ingredientes: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Recetario recetario = new Recetario();

        // Agregar algunas recetas
        recetario.agregarReceta("Spaghetti Bolognese", "Pasta, Salsa de tomate, Carne molida");
        recetario.agregarReceta("Chicken Alfredo", "Fettuccine, Pollo, Crema, Queso parmesano");
        recetario.agregarReceta("Caesar Salad", "Lechuga, Pollo, Crutones, Aderezo Caesar");

        // Mostrar recetas en orden ascendente
        System.out.println("Recetas en orden ascendente:");
        recetario.mostrarRecetasAscendente();

        // Mostrar recetas en orden descendente
        System.out.println("\nRecetas en orden descendente:");
        recetario.mostrarRecetasDescendente();
    }
}