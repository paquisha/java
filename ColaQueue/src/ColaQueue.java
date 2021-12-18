import java.util.LinkedList;
import java.util.Queue;

public class ColaQueue {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<Integer>();

        cola.add(60);
        cola.add(700);
        cola.add(30);
        cola.add(40);
        cola.add(50);

        System.out.println("Inicio de la cola es: " + cola.peek());




        int tamanio = cola.size();
        while(!cola.isEmpty()){
            System.out.println("Despachando elemento: " + cola.remove());
        }

    }
}
