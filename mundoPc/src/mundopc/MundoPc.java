package mundopc;

import ec.aekmot.mundopc.*;

public class MundoPc {
	public static void main(String[] args) {
		Monitor monitorHP = new Monitor("HP", 13);
		Teclado tecladoHP = new Teclado("bluetooth", "HP");
		Raton ratonHP = new Raton("Bluetooth", "HP");
		Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
		
		
		Monitor monitorAsus = new Monitor("Asus", 32);
		Teclado teclado = new Teclado("tipo C", "logitech");
		Raton raton  = new Raton("Bluetooth", "Razer");
		Computadora computadoraAsus = new Computadora("Computadora Asus", monitorAsus, teclado, raton);
		
		Orden orden1 = new Orden();
		orden1.agregarComputadora(computadoraHP);
		orden1.agregarComputadora(computadoraAsus);
		
		orden1.mostrarOrden();
	}
}
