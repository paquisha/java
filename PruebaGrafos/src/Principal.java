import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0, elemento;

        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "" +
                        "1. Agregar vertice\n"
                        +"2. Recorrer grafo BFS\n"
                        +"3. Recorrer grafo DFS\n"
                        +"4. Salir\n"
                        +"Elige una opcion: ", "Grafos", JOptionPane.QUESTION_MESSAGE
                        ));
                switch (opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa numero vertice: ", "Agregando vertice", JOptionPane.QUESTION_MESSAGE));
                        //aqui vamos a enviar al grafo
                        System.out.println("vertices" + elemento);
                        break;
                    case 2:
                        //aqui le enviare al recorrido de BFS
                        System.out.println("Aqui es para usar BFS");
                        break;
                    case 3:
                        //aqui viene recorrido DFS
                        System.out.println("Aqui se usa DFS");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta", "Cuidado", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
            }
        }while(opcion != 2);

    }
}
