import javax.swing.*;

public class EjercicioPila {
    public static void main(String[] args) {
        int opcion = 0, elemento, tamanio;
        boolean estado = false;

        try{
            tamanio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese tamanio de la pila: ", JOptionPane.INFORMATION_MESSAGE));
            Pila pila = new Pila(tamanio);
            do{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Empujar un elemento en el pila\n"
                        + "2. Sacar elemento de la pila\n"
                        + "3. La pila esta Vacia?\n"
                        + "4. La pila esta llena?\n"
                        + "5. Que elemento esta en la cima?\n"
                        + "6. tamanio de la pila\n"
                        + " 7. Salir\n"
                        + "Que deseas hacer? ", "Menu de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese elemento a empujar en la pila: ","Apilando datos", JOptionPane.INFORMATION_MESSAGE));
                        if(!pila.estaLLena()){
                            pila.empujar(elemento);
                        }else{
                            JOptionPane.showMessageDialog(null,"la pila esta llena", "Pila Llena", JOptionPane.INFORMATION_MESSAGE);
                        }
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
                        if(pila.estaLLena()){
                            JOptionPane.showMessageDialog(null,"la pila esta lena", "Pila Lena", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"la pila no esta llena", "Pila aun tiene espacio", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if(!pila.estaVacia()){
                            JOptionPane.showMessageDialog(null,"elemento de la cima es: " + pila.cimaPila(), "Cima de la Pila", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"la pila esta vacia", "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null,"tamanio de la pila es: " + pila.tamanioPila(), "Tamanio Pila", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null,"Fin Aplicacion", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opcion Incorrecta", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }while(opcion != 7);
        }catch (NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Error " + err.getMessage());
        }
    }
}
