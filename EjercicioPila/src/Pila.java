public class Pila {
    int vectorPila[];
    int cima;
    //constructor
    public Pila(int tamanio){
        vectorPila = new int[tamanio];
        //se inicia asi par adarnos ccuenta cuando esta vacia y cuando ingresemos nuevo dato
        cima = -1;
    }

    //metodo push(para empujar elementos en la pila)
    public void empujar(int dato){
        cima++;
        vectorPila[cima] = dato;
    }

    //metodo pop(para sacar elementos)
    public int sacar(){
        int fuera = vectorPila[cima];
        cima--;
        return fuera;
    }

    //metodo para saber si la pila esta vacia
    public boolean estaVacia(){
        return cima == -1;
    }

    //metodo para saber cuando la pila esta llena
    public boolean estaLLena(){
        return vectorPila.length - 1 == cima;
    }

    //metodo para saber que elemento esta en la cima
    public int cimaPila(){
        return vectorPila[cima];
    }

    //metodo para saber el tamanio de la pila
    public int tamanioPila(){
        return vectorPila.length;
    }
}
