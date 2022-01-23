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

    //metodo para saber cuando el arbol esta vacio
    public boolean estaVacio(){
        return raiz == null;
    }

    //metodo para recorrer el arbol inOrden
    public void inOrden(NodoArbol r){
        if(r != null){
            inOrden(r.hijoIzquierdo);
            System.out.println(r.dato);
            inOrden(r.hijoDerecho);
        }
    }

    //metodo para recorrer el arbol en preOrden
    public  void preOrden(NodoArbol r){
        if(r != null){
            System.out.println(r.dato);
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho);
        }
    }

    //metodo para recorrer ela rbol en postOrden
    public void postorden(NodoArbol r){
        if(r != null){
            postorden(r.hijoIzquierdo);
            postorden(r.hijoDerecho);
            System.out.println(r.dato);
        }
    }

}
