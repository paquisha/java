import java.util.Stack;

public class PilasStack {
    public static void main(String[] args) {
        Stack pila = new Stack();

        pila.add(4);
        pila.add(2);
        pila.add(5);
        pila.add(6);
        pila.add(8);
        pila.add(9);

        System.out.println("La cima es: " + pila.peek());
        System.out.println("Sacando elemento de la pila " + pila.pop());
        System.out.println("Tamanio de pila: "+ pila.size());
        System.out.println("Pila vacia: " + pila.isEmpty());

    }
}
