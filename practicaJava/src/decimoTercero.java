import java.util.Scanner;

public class decimoTercero {
    /*Escribir un programa que pida ingresar la coordenada de un punto en el plano, es decir dos valores enteros x e y (distintos a cero).
Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto. (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)*/

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int x , y;

        System.out.println("Ingrese coordenada x: ");
        x = teclado.nextInt();

        System.out.println("Ingrese coordenada y:");
        y = teclado.nextInt();

        if(x > 0 && y > 0){
            System.out.println("Primer cuadrante, coordenadas: (" + x +":"+y+")");
        }else{
            if(x < 0 && y > 0){
                System.out.println("Segundo cuadrante, coordenadas: (" + x +":"+y+")");
            }else {
                if(x < 0 && y < 0){
                    System.out.println("Tercer cuadrante, coordenadas: (" + x +":"+y+")");
                }else{
                    System.out.println("Cuarto cuadrante, coordenadas: (" + x +":"+y+")");
                }
            }
        }
    }
}
