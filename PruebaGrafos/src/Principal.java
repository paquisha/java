import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0, elemento1, elemento2;
        Grafos grafo = new Grafos(6);
        /*grafo.addArco(0, 3); //agregar estos valores para que funcione el grafo
        grafo.addArco(0, 4);
        grafo.addArco(1, 3);
        grafo.addArco(1, 5);
        grafo.addArco(2, 4);
        grafo.addArco(3, 0);
        grafo.addArco(3, 1);
        grafo.addArco(4, 0);
        grafo.addArco(4, 2);
        grafo.addArco(4, 5);
        grafo.addArco(5, 1);
        grafo.addArco(5, 4);*/

        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "" +
                        "1. Agregar arco y vertice\n"
                        +"2. Recorrer grafo BFS\n"
                        +"3. Recorrer grafo DFS\n"
                        +"4. Salir\n"
                        +"Elige una opcion: ", "Grafos", JOptionPane.QUESTION_MESSAGE
                        ));
                switch (opcion){
                    case 1:
                        elemento1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa numero arco: ", "Agregando arco", JOptionPane.QUESTION_MESSAGE));
                        elemento2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa numero vertice: ", "Agregando vertice", JOptionPane.QUESTION_MESSAGE));
                        //aqui vamos a enviar al grafo
                        grafo.addArco(elemento1, elemento2);
                        break;
                    case 2:
                        if(grafo != null){
                            System.out.println("Recorrido BFS\n");
                            grafo.BFS(4);
                            System.out.println("\n");
                        }else{
                            JOptionPane.showMessageDialog(null, "Grafo esta vacio", "Grafo Vacio", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(grafo != null){
                            System.out.println("Recorrido DFS\n");
                            grafo.DFS(4);
                            System.out.println("\n");
                        }else{
                            JOptionPane.showMessageDialog(null, "Grafo esta vacio", "Grafo Vacio", JOptionPane.INFORMATION_MESSAGE);
                        }
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
        }while(opcion != 4);

    }
}
