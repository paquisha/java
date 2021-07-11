package org.agrijalva.facturasUTM.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private int numeroConsecutivo;
    private String descripcion;
    private Date fechaCreacion;
    private Cliente cliente;
    private ItemFactura[] items;
    private FacturaContado facturaContado;
    private FacturaCredito facturaCredito;
    private int indiceItems;
    public static final int MAX_ITEMS = 4;
    private static int ultimoNumeroConsecutivo;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.numeroConsecutivo = ++ultimoNumeroConsecutivo;
        this.fechaCreacion = new Date();

    }

    public int getNumeroConsecutivo() {
        return numeroConsecutivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public FacturaContado getFacturaContado() {
        return facturaContado;
    }

    public void setFacturaContado(FacturaContado facturaContado) {
        this.facturaContado = facturaContado;
    }

    public FacturaCredito getFacturaCredito() {
        return facturaCredito;
    }

    public void setFacturaCredito(FacturaCredito facturaCredito) {
        this.facturaCredito = facturaCredito;
    }

    public void addItemsFactura(ItemFactura item){
        if(indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    public float calcularTotal(){
        float total = 0.0f;
        for(ItemFactura item: this.items){
            if(item == null){
                continue;
            }
            total += item.calcularImporte();
        }
        return total;
    }

    public String generarDetalle(){
        StringBuilder sb = new StringBuilder("Factura No: ");
        sb.append(numeroConsecutivo)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t C.I: ")
                .append(cliente.getCi())
                .append("\nDescripcion: ")
                .append(this.descripcion)
                .append("\n");


        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("fecha Emision: ")
                .append(df.format(this.fechaCreacion))
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        for(ItemFactura item: this.items){
            if(item == null){
                continue;
            }
            sb.append(item)
                    .append("\n");
        }
        sb.append("\nGran Total: ")
                .append(calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}
