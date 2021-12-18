import javax.swing.*;

public class EjercicioPilaDinamica {
    public static void main(String[] args) {
        int opcion = 0, elemento = 0;
        Pila pila = new Pila();

        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Empujar un elemento en el pila\n"
                                + "2. Sacar elemento de la pila\n"
                                + "3. La pila esta Vacia?\n"
                                + "4. Que elemento esta en la cima?\n"
                                + "5. tamanio de la pila\n"
                                + "6. Vacia Pila\n"
                                + "7. Salir\n"
                                + "Que deseas hacer? ", "Menu de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese elemento a empujar en la pila: ","Apilando datos", JOptionPane.INFORMATION_MESSAGE));
                        pila.empujar(elemento);
                        break;
                    case 2:
                        if(!pila.estaVacia()){
                            JOptionPane.showMessageDialog(null,"Elemento obtenido es: " + pila.sacar(), "Obteniendo datos de la pila", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"la pila esta vacia", "Pila Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(pila.estaVacia()){
                            JOptionPane.showMessageDialog(null,"la pila esta vacia", "Pila Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"la pila no esta vacia", "Pila tiene datos", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!pila.estaVacia()){
                            JOptionPane.showMessageDialog(null,"elemento de la cima es: " + pila.cima(), "Cima de la Pila", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"la pila esta vacia", "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,"el tamanio de la pila es: " + pila.tamanioPila(), "Tamanio de la Pila", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        if(!pila.estaVacia()){
                            pila.limpiarPila();
                            JOptionPane.showMessageDialog(null,"Vaciando pila: ", "pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"Pila esta vacia: " + pila.tamanioPila(), "Pila Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null,"Fin Aplicacion", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opcion Incorrecta", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch (NumberFormatException err){
                JOptionPane.showMessageDialog(null, "Error " + err.getMessage());
            }
        }while(opcion != 7);
    }
}
