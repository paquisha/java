public class NodoDoble {
    public int dato;
    NodoDoble siguiente, anterior;

    //constructor para cuando no hay nodos
    public NodoDoble(int ele){
        this(ele, null, null);
    }
    //constructor para cuando haya nodos
    public NodoDoble(int ele, NodoDoble s, NodoDoble a){
        dato = ele;
        siguiente = s;
        anterior = a;
    }
}
