import javax.swing.*;

public class ListaDoble {
    private NodoDoble inicio, fin;

    //constructor por defecto
    public ListaDoble(){
        inicio=fin=null;
    }

    //metodo para saber cuando la lista esta vacia
    public boolean estaVacia(){
        return inicio==null;
    }

    //metodo para agregar nodos al final
    public void agregarAlFinal(int elemento){
        if(!estaVacia()){
            //como es al final el puntor siguiente apunta a null
            //y el anterior apuntara al fin
            fin = new NodoDoble(elemento, null, fin);
            fin.anterior.siguiente = fin;
        }else{
            inicio=fin=new NodoDoble(elemento);
        }
    }

    //metodo para agregar al inicio
    public void agregarAlInicio(int elemento){
        if(!estaVacia()){
            //como apuntamos al inicio el puntero anterior sera null
            inicio = new NodoDoble(elemento, inicio, null);
            inicio.siguiente.anterior=inicio;
        }else{
            inicio=fin= new NodoDoble(elemento);
        }
    }

    //metodo para mostrar la lista de inicio a fin
    public void mostrarListaInicioFin(){
        if (!estaVacia()){
            String datos = "<=>";
            NodoDoble auxiliar = inicio;
            while(auxiliar != null){
                datos = datos + "["+auxiliar.dato+"] <=>";
                auxiliar = auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando lista de inicio a fin",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //metodos para mostrar la lista de fin a inicio
    public void mostrarListaFinInicio(){
        if (!estaVacia()){
            String datos = "<=>";
            NodoDoble auxiliar = fin;
            while(auxiliar != null){
                datos = datos + "["+auxiliar.dato+"] <=>";
                auxiliar = auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando lista de fin a inicio",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
