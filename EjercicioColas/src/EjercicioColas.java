import javax.swing.*;

public class EjercicioColas {
    public static void main(String[] args) {
        int opcion = 0, elemento = 0;
        Cola cola = new Cola();

        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Insertar un elemneto en la Cola\n"
                +"2. Quitar elemento de la cola\n"
                +"3. la cola esta vacia?\n"
                +"4. elemento ubicado al inicio de la Cola\n"
                +"5. Tamanio de la Cola\n"
                +"6. salir", "Manu de opciones de una Cola", JOptionPane.QUESTION_MESSAGE));
                switch (opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a insertar", "Insertando en la Cola", JOptionPane.QUESTION_MESSAGE));
                        cola.insertar(elemento);
                        break;
                    case 2:
                        if(!cola.estaVacia()){
                            JOptionPane.showMessageDialog(null, "Elemento atendido es: "+ cola.quitar(), "Quitando Elemento de la cola", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La cola esta vacia","Cola Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(cola.estaVacia()){
                            JOptionPane.showMessageDialog(null, "La cola esta vacia","Cola Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La cola no esta vacia","Cola no esta Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!cola.estaVacia()){
                            JOptionPane.showMessageDialog(null, "Elemento ubicado al incio de la cola es" + cola.inicioCola(),"Elemento cola", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La cola esta vacia","Cola Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Tamanio dela cola es: " + cola.tamanioCola(),"Tamanio Cola", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada","Fin", JOptionPane.INFORMATION_MESSAGE);

                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta","!Cuidado", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch (NumberFormatException err){
                JOptionPane.showMessageDialog(null, "Error" + err.getMessage());
            }
        }while(opcion != 6);
    }
}
