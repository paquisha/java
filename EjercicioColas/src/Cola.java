public class Cola {
    NodoCola inicio, fin;
    int tamanio;

    public Cola(){
        inicio = fin = null;
        tamanio = 0;
    }

    public boolean estaVacia(){
        return inicio == null;
    }

    public void insertar(int elemento){
        NodoCola nuevo = new NodoCola(elemento);
        if(estaVacia()){
            inicio = nuevo;
        }else{
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tamanio++;
    }

    public int quitar(){
        int auxiliar = inicio.dato;
        inicio = inicio.siguiente;
        tamanio--;
        return auxiliar;
    }

    public int inicioCola(){
        return inicio.dato;
    }

    public int tamanioCola(){
        return tamanio;
    }
}
