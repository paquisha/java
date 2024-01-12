import java.sql.SQLOutput;
import java.util.Scanner;

//Desarrollar un programa que cargue los lados de un triángulo e implemente los siguientes métodos: inicializar los atributos,
// imprimir el valor del lado mayor y otro método que muestre si es equilátero o no.
public class Triangulo {
    private Scanner ingreso;
    private int lado1;
    private int lado2, lado3;

    public void inicializar(){
        ingreso = new Scanner(System.in);

        System.out.print("Ingrese medida del lado 1: ");
        lado1 = ingreso.nextInt();
        System.out.print("Ingrese medida del lado 2: ");
        lado2 = ingreso.nextInt();
        System.out.print("Ingrese medida del lado 3: ");
        lado3 = ingreso.nextInt();
    }

    public void ladoMayor(){
        System.out.print("Lado Mayor: ");
        if(lado1 > lado2 && lado1 > lado3){
            System.out.println(lado1);
        }else{
            if(lado2 > lado3){
                System.out.println(lado2);
            }else{
                System.out.println(lado3);
            }
        }
    }

    public void esEquilatero(){
        if(lado1 == lado2 && lado1 == lado3){
            System.out.println("es Equilatero");
        }else{
            System.out.println("no es equilatero");
        }
    }
}
