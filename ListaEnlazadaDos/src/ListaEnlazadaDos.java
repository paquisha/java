import java.util.LinkedList;

public class ListaEnlazadaDos {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        int tamanio = lista.size();
        int i = 0;
        while(i < tamanio){
            System.out.println("["+lista.get(i)+"]->");
            i++;
        }
        lista.remove(2);
        lista.add(3, 100);
        i = 0;
        tamanio = lista.size();
        while(i < tamanio){
            System.out.println("["+lista.get(i)+"]->");
            i++;
        }

    }
}
