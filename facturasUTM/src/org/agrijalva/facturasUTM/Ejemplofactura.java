package org.agrijalva.facturasUTM;

import org.agrijalva.facturasUTM.modelo.*;

import java.util.Scanner;

public class Ejemplofactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setCi("1718970625");
        cliente.setNombre("Andres");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una descripcion de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;

        System.out.println();

        for(int i = 0; i < 5; i++){
            producto = new Producto();
            System.out.println("ingrese producto n " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.println("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.println("Ingrese la cantidad: ");
            factura.addItemsFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
            s.nextLine();
        }
        System.out.println(factura);
    }
}
