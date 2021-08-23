package org.aekmot.hilos.clasesUTM;

import org.aekmot.hilos.clasesUTM.threads.NombreThread;

public class ExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        //instancio cada uno de los threads
        Thread hilo1 = new NombreThread("Soy el hilo 1");
        //inicio el thread
        hilo1.start();
        Thread hilo2 = new NombreThread("Soy el hilo 2");
        hilo2.start();
        Thread hilo3 = new NombreThread("Soy el hilo 3");
        hilo3.start();
        Thread hilo4 = new NombreThread("Soy el hilo 4");
        hilo4.start();
        //imprimo el estado de los threads
        System.out.println(hilo1.getState());
    }
}
