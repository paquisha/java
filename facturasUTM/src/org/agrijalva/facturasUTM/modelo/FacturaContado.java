package org.agrijalva.facturasUTM.modelo;

public class FacturaContado {
    private String debito;
    private String contado;

    public String getDebito() {
        return debito;
    }

    public void setDebito(String debito) {
        this.debito = debito;
    }

    public String getContado() {
        return contado;
    }

    public void setContado(String contado) {
        this.contado = contado;
    }

    @Override
    public String toString() {
        return "FacturaContado{" +
                "debito='" + debito + '\'' +
                ", contado='" + contado + '\'' +
                '}';
    }
}
