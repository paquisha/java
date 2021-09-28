package ec.com.ventas;

public class Orden {
	private int idOrden;
	private Producto productos[];
	private static int contadorOrdenes;
	private int contadorProductos;
	private static final int MAX_PRODUCTOS = 10;
	
	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;
		this.productos = new Producto[Orden.MAX_PRODUCTOS];
	}
	
	public void agregarProducto(Producto producto) {
		if(this.contadorProductos < Orden.MAX_PRODUCTOS) {
			this.productos[this.contadorProductos++] = producto;
		}else {
			System.out.println("se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
		}		
	}
	
	public double calcularTotal() {
		double total = 0;
		for(int i = 0; i < this.contadorProductos; i++) {
			//Producto producto = this.productos[i];
			//total += producto.getPrecio();//opcional
			total += this.productos[i].getPrecio();//poo
		}
		return total;
	}
}
