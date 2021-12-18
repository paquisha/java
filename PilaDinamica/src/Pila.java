public class Pila {
    private NodoPila cima;
    int  tamanio;
    public Pila(){
        cima = null;
        tamanio = 0;
    }

    //metodo para saber cuando la pila esta vacia
    public boolean estaVacia(){
        return cima == null;
    }

    //metodo para empujar eelmento en la pila
    public void empujar( int elemento){
        NodoPila nueva = new NodoPila(elemento);

        nueva.siguiente = cima;
        cima = nueva;
        tamanio++;
    }
     //metodo para sacar elemento de la pila
    public int sacar(){
        int auxiliar = cima.dato;
        cima = cima.siguiente;
        tamanio--;
        return auxiliar;
    }

    //metodo para saber quien esta en la cima de la pila
    public int cima(){
        return cima.dato;
    }

    //metodo para saber el tamanio de la pila
    public int tamanioPila(){
        return tamanio;
    }

    //metodo para vaciar la pila
    public void limpiarPila(){
        while(!estaVacia()){
            sacar();
        }
    }
}
