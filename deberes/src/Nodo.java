import java.util.ArrayList;
import java.util.List;

public class Nodo {
    String nombre;
    List<Nodo> hijos;

    public Nodo(String nombre) {
        this.nombre = nombre;
        this.hijos = new ArrayList<>();
    }
}