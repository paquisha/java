public class Arboles {

    NodoArbol raiz;
    public Arboles(){
        raiz = null;//para saber cuando cambie la raiz
    }


    //metodo par ainsertar un nmodo en el arbol
    public void agregarNodo(int d, String nomb){
        NodoArbol nuevo = new NodoArbol(d, nomb);
        if(raiz == null){
            raiz = nuevo;
        }else{
            NodoArbol aux = raiz;
            NodoArbol padre;
            while(true){
                padre = aux;
                if(d < aux.dato){
                    aux = aux.hijoIzquierdo;
                    if(aux == null){
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                }else{
                    aux = aux.hijoDerecho;
                    if(aux == null){
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
    }

}
