import javax.swing.*;

public class Presentacion {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        int opcion = 0, elemento;

        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar Nodo al inicio\n"
                        + "2. Agregar Nodo al Final\n"
                        + "3. Mostrar lista de Fin a Inicio\n"
                        + "4. Mostrar Lista de inicio a Fin\n"
                        + "5. Salir\n"
                        + "Que deseas hacer? ", "Menu de opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del nodo",
                                "Agregando Nodo al inicio", JOptionPane.INFORMATION_MESSAGE));
                        lista.agregarAlInicio(elemento);
                        break;
                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del nodo",
                                "Agregando Nodo al Final", JOptionPane.INFORMATION_MESSAGE));
                        lista.agregarAlFinal(elemento);
                        break;
                    case 3:
                        if(!lista.estaVacia()){
                            lista.mostrarListaInicioFin();
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay nodos Aun",
                                    "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!lista.estaVacia()){
                            lista.mostrarListaFinInicio();
                        }else{
                            JOptionPane.showMessageDialog(null, "NO hay nodos Aun",
                                    "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opcion no esta en el menu",
                                "Incorrecto", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        }while(opcion != 5);
    }
}
