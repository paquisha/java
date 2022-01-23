import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0, elemento;
        String nombre;
        Arboles arbol = new Arboles();
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "" +
                        "1. Agregar un Nodo\n"
                        +"2. Recorrer arbol InOrden\n"
                        +"3. Recorrer el arbol preOrden\n"
                        +"4. Recorrer el arbol postOrden\n"
                        + "5. Salir\n"
                        + "Elige una opcion: ", "Arboles Binarios", JOptionPane.QUESTION_MESSAGE
                    ));

                switch (opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa numero del elemento del nodo: ", "Agregando nodo", JOptionPane.QUESTION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null, "Ingresa nombre el nodo", "Agregando Nodo", JOptionPane.QUESTION_MESSAGE);
                        arbol.agregarNodo(elemento, nombre);
                        break;
                    case 2:
                        if(!arbol.estaVacio()){
                            arbol.inOrden(arbol.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null, "Arbol esta vacio", "Arbol Vacio", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(!arbol.estaVacio()){
                            arbol.preOrden(arbol.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "Arbol vacio", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!arbol.estaVacio()){
                            arbol.postorden(arbol.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "Arbol vacio", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta", "Cuidado", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
            }
        }while(opcion != 2);
    }
}
