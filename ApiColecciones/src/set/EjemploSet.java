package set;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class EjemploSet {
    public static void main(String[] args) {
        //creamos variable de tipo Set, utilizando la clase mas comun que es hashSet
        Set miSet = new HashSet();
        //utilizamos metodo add del api de collections
        miSet.add(miSet);
        //agregamos los dias de la semana, pero puede recibir
        //cualquier tipo object
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        //imprimir(miSet);

        //creamos una variable para linkedset
        LinkedHashSet linkedSet = new LinkedHashSet();
        linkedSet.add("Lunes");
        linkedSet.add("Martes");
        linkedSet.add("Miercoles");
        linkedSet.add("Jueves");
        linkedSet.add("Viernes");
        linkedSet.add("Sabado");
        linkedSet.add("Domingo");
        imprimir(linkedSet);
    }
    //creamos metodo para recibir la lista
    public static void  imprimir(Collection coleccion){
        //vamos usar una expresion lambda, para iterar los elementos
        coleccion.forEach(elemento ->{
            System.out.println("elemento: " + elemento);
        });
    }
}
