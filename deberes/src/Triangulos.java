import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        /*Realizar un programa que lea los lados de n triángulos, e informar:
        a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales), isósceles (dos lados iguales), o escaleno (ningún lado igual)
        b) Cantidad de triángulos de cada tipo.
        c) Tipo de triángulo que posee menor cantidad.*/
        Scanner ingreso = new Scanner(System.in);
        int contador, lado1, lado2,lado3, cantidad1, cantidad2,cantidad3,numero;
        cantidad1 = 0;
        cantidad2 = 2;
        cantidad3 = 0;

        System.out.println("Ingrese la cantidad de triangulos: ");
        numero = ingreso.nextInt();

        for(contador = 1; contador <= numero; contador++){
            System.out.println("Ingrese numero 1: ");
            lado1 = ingreso.nextInt();
            System.out.println("Ingrese numero 2: ");
            lado2 = ingreso.nextInt();
            System.out.println("Ingrese numero 3: ");
            lado3 = ingreso.nextInt();

            if(lado1 == lado2 && lado1 == lado3){
                System.out.println("es un triangulo equilatero: ");
                cantidad1++;
            }else{
                if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                    System.out.println("Es un triangulo Isoceles");
                    cantidad2++;
                }else{
                    System.out.println("Es un triangulo escaleno");
                    cantidad3++;
                }
            }

            System.out.println("Cantidad de triangulos Equilateros: " + cantidad1);
            System.out.println("Cantidad de triangulo Isoceles: " + cantidad2);
            System.out.println("Cantidad de triangulos escalenos: " + cantidad3);

            if(cantidad1 < cantidad2 && cantidad1 < cantidad3){
                System.out.println("Hay menor cantidad du triangulas equilateros");
            }else{
                if(cantidad2 < cantidad3){
                    System.out.println("Hay menor cantidad de triangulos Isoceles");
                }else{
                    System.out.println("hay menor cantidad de triangulos escalenos");
                }
            }
        }
    }
}
