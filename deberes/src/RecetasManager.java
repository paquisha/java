import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class RecetasManager {
    private NavigableMap<String, String> recetas;

    public RecetasManager() {
        // Utilizamos TreeMap para mantener las recetas ordenadas por clave (nombre de receta)
        this.recetas = new TreeMap<>();
    }

    public void agregarReceta(String nombreReceta, String ingredientes) {
        // Verificamos si ya existe la receta antes de agregarla
        if (!recetas.containsKey(nombreReceta)) {
            recetas.put(nombreReceta, ingredientes);
            System.out.println("Receta agregada: " + nombreReceta);
        } else {
            System.out.println("La receta con el nombre " + nombreReceta + " ya existe. No se puede repetir.");
        }
    }

    public void modificarReceta(String nombreReceta, String nuevosIngredientes) {
        // Verificamos si la receta existe antes de modificarla
        if (recetas.containsKey(nombreReceta)) {
            recetas.put(nombreReceta, nuevosIngredientes);
            System.out.println("Receta modificada: " + nombreReceta);
        } else {
            System.out.println("La receta con el nombre " + nombreReceta + " no existe. No se puede modificar.");
        }
    }

    public void mostrarRecetasAscendente() {
        // Mostramos las recetas en orden ascendente por el nombre de receta
        recetas.forEach((nombre, ingredientes) -> System.out.println(nombre + ": " + ingredientes));
    }

    public void mostrarRecetasDescendente() {
        // Mostramos las recetas en orden descendente por el nombre de receta
        recetas.descendingMap().forEach((nombre, ingredientes) -> System.out.println(nombre + ": " + ingredientes));
    }

    public static void main(String[] args) {
        RecetasManager manager = new RecetasManager();

        manager.agregarReceta("Torta de Chocolate", "Harina, Azúcar, Chocolate, Huevos");
        manager.agregarReceta("Ensalada César", "Lechuga, Pollo, Queso, Aderezo");
        manager.agregarReceta("Torta de Chocolate", "Harina, Azúcar, Chocolate, Huevos"); // Intentamos agregar una receta repetida

        System.out.println("\nRecetas en orden ascendente:");
        manager.mostrarRecetasAscendente();

        System.out.println("\nRecetas en orden descendente:");
        manager.mostrarRecetasDescendente();

        manager.modificarReceta("Torta de Chocolate", "Harina, Azúcar, Chocolate, Huevos, Leche"); // Modificamos la receta

        System.out.println("\nRecetas después de la modificación:");
        manager.mostrarRecetasAscendente();
    }
}