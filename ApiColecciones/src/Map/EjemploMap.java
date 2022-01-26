package Map;

import java.util.*;

public class EjemploMap {
    public static void main(String[] args) {
        Map miMapa = new HashMap();

        miMapa.put("valor1", "Aime");
        miMapa.put("valor2", "Nathalia");
        miMapa.put("valor3", "Evelyn");

        String elemento = (String) miMapa.get("valor3");
        //System.out.println("elemento: " + elemento);

        //vamos a ver el ejemplo LinkedHashMap
        LinkedHashMap<Integer, String> lhmap =
                new LinkedHashMap<Integer, String>();

        //agregando elementos LinkedHashMap
        lhmap.put(22, "Aime");
        lhmap.put(33, "Nathalia");
        lhmap.put(1, "Evelyn");
        lhmap.put(2, "Amaru");
        lhmap.put(100, "Andres");

        // Tenemos que convertirlo a un set
        Set set = lhmap.entrySet();

        // mostramos elementos de LinkedHashMap
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry me = (Map.Entry)iterator.next();
            System.out.print("la llave es: "+ me.getKey() +" y el valor es: "+me.getValue()+"\n");
        }
    }
}
