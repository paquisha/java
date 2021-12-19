import java.util.Stack;

public class PilasStack {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();

        pila.add(50);
        pila.add(80);
        pila.add(100);
        pila.add(25);
        pila.add(2);

        //pila temporal
        Stack<Integer> temporalStack = pilaOrdenada(pila);
        System.out.println("Pila ordenada: ");
        while(!temporalStack.isEmpty()){
            System.out.println(temporalStack.pop() + " ");
        }

        //ahora vamos por caracteres alfanumericos
        String alfanumericos = "pr8ty0ue5bao9rde7nada1";
        int prb = alfanumericos.length();

        alfanumericosOrdenados(alfanumericos, prb);


    }

    //metodo para ordenar numeros
    public static Stack<Integer> pilaOrdenada(Stack<Integer> pila){
        Stack<Integer> temporalStack = new Stack<Integer>();
        while(!pila.isEmpty()){
            //saca el primer elemento
            int tmp = pila.pop();
            //mientras la pila temporal no esta vacia y es mayor que tmp
            while(!temporalStack.isEmpty() && temporalStack.peek() < tmp){
                //pasamos de una pila a la otra
                pila.push(temporalStack.pop());
            }
            temporalStack.push(tmp);
        }
        return temporalStack;
    }
    //metodo para ordenar alfanumericos
    public static void alfanumericosOrdenados(String alfanumericos, int prb){
        // pila primaria
        Stack<Character> pila = new Stack<Character>();

        // pila auxiliar
        Stack<Character> auxiliar  = new Stack<Character>();

        // agrega el primer caracter
        pila.push(alfanumericos.charAt(0));

        // iteramos todos los caracteres de la cadena
        for(int i = 1; i < prb; i++)
        {

            // caracter ASCII
            int a = alfanumericos.charAt(i);

            // ASCII del elemento superior de la pila
            int b = (int)((char)pila.peek());

            //si es mayor o igual elemento de la cima lo agregamos a la pila
            if ((a - b) >= 1 || (a == b))
            {
                pila.push(alfanumericos.charAt(i));
            }

            //si es menor lo agregamos a la pila auxiliar
            else if ((b - a) >= 1)
            {

                //Agregamos los elementos mayores
                while ((b - a) >= 1)
                {

                    // pusheamos
                    auxiliar.push(pila.peek());
                    pila.pop();

                    // agregamos hasta que la pila no esta vacia
                    if (pila.size() > 0)
                    {
                        b = (int)((char)pila.peek());
                    }
                    else
                    {
                        break;
                    }
                }

                // agregamos el caracter iterado
                pila.push(alfanumericos.charAt(i));

                // agregamos la pila temporal invertida
                while (auxiliar.size() > 0)
                {
                    pila.push(auxiliar.peek());
                    auxiliar.pop();
                }
            }
        }

        // Imprimimos la pila en orden inverso
        String answer = "";
        while (pila.size() > 0)
        {
            answer = pila.peek()+answer;
            pila.pop();
        }
        System.out.println(answer);
    }
}
