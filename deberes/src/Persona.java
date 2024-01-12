import java.util.Scanner;

//Confeccionar una clase que permita carga el nombre y la edad de una persona.
// Mostrar los datos cargados. Imprimir un mensaje si es mayor de edad (edad>=18)
public class Persona {
    private String nombre;
    private int edad;
    private Scanner ingreso;

    public void inicializar(){
        ingreso = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        nombre = ingreso.next();
        System.out.println("Ingrese la edad");
        edad = ingreso.nextInt();
    }

    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void esMayor(){
        if(edad >= 18){
            System.out.println(nombre + " es mayor de edad");
        }else{
            System.out.println(nombre + " no es mayor de edad");
        }
    }

    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.inicializar();
        persona.imprimir();
        persona.esMayor();
    }
}
