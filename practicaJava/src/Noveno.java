import java.util.Scanner;

public class Noveno {
    /*
    Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de
    preguntas que se le realizaron y la cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa
    que ingrese los dos datos por teclado e informe el nivel del mismo según el porcentaje de respuestas correctas que ha obtenido,
    y sabiendo que:
	Nivel máximo:	Porcentaje>=90%.
	Nivel medio:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int cantidadPreguntas, correctas;
        float porcentaje;

        System.out.println("Ingrese cantidad de preguntas: ");
        cantidadPreguntas = teclado.nextInt();

        System.out.println("Ingrese preguntas correctas: ");
        correctas = teclado.nextInt();

        porcentaje = (correctas * 100 )/cantidadPreguntas;

        if(porcentaje >= 90){
            System.out.println("nivel maximo, porcentaje: " + porcentaje);
        }else{
            if(porcentaje >= 75 && porcentaje < 90){
                System.out.println("nivel medio, porcentaje: " + porcentaje);
            }else{
                if(porcentaje >= 50 && porcentaje < 75){
                    System.out.println("nivel regular, porcentaje: " + porcentaje);
                }else{
                    System.out.println("fuera de nivel, porcentaje: " + porcentaje);
                }
            }
        }
    }
}
