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
                        + "2. Salir\n"
                        + "Elige una opcion: ", "Arboles Binarios", JOptionPane.QUESTION_MESSAGE
                    ));

                switch (opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa numero del elemento del nodo: ", "Agregando nodo", JOptionPane.QUESTION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null, "Ingresa nombre el nodo", "Agregando Nodo", JOptionPane.QUESTION_MESSAGE);
                        arbol.agregarNodo(elemento, nombre);
                        break;
                    case 2:
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
