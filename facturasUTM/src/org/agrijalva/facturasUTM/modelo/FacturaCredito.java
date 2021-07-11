package org.agrijalva.facturasUTM.modelo;

public class FacturaCredito {
    private int plazoMaximo;

    public int getPlazoMaximo() {
        return plazoMaximo;
    }

    public void setPlazoMaximo(int plazoMaximo) {
        this.plazoMaximo = plazoMaximo;
    }

    @Override
    public String toString() {
        return "FacturaCredito{" +
                "plazoMaximo=" + plazoMaximo +
                '}';
    }
}
