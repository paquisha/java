package org.aekmot.hilos.clasesUTM.threads;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//creo constructor de la clase
public class NombreThread extends Thread{
    public NombreThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        //imprimo cada thread por nucleo
        System.out.println("Se inicia el metodo run del hilo " + getName());
        //obtengo la fecha del sistema
        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");
        //ciclo de 5 elementos como fue indicado
        for(int i = 0; i < 5; i++){
            try {
                //tiempo de ejecucion por hilo
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //imprimo el nombre del hilo con la fecha antual del sistema
            System.out.println(this.getName() + " " + fecha.format(LocalDateTime.now()));
        }
        System.out.println("Finaliza el hilo");
    }
}
