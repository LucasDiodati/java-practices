package ejercicio19;
public class Factura {
private int numFactura;
private double importe;
private Mozo mozoF;

    /**
     * @return the numFactura
     */
    public int getNumFactura() {
        return numFactura;
    }

    /**
     * @param numFactura the numFactura to set
     */
    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    /**
     * @return the importe
     */
    public double getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(double importe) {
        this.importe = importe;
    }

    /**
     * @return the mozoF
     */
    public Mozo getMozoF() {
        return mozoF;
    }

    /**
     * @param mozoF the mozoF to set
     */
    public void setMozoF(Mozo mozoF) {
        this.mozoF = mozoF;
    }
}
