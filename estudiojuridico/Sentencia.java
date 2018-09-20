package estudiojuridico;
public class Sentencia {

    /**
     * @return the fechaSentencia
     */
    public String getFechaSentencia() {
        return fechaSentencia;
    }

    /**
     * @param fechaSentencia the fechaSentencia to set
     */
    public void setFechaSentencia(String fechaSentencia) {
        this.fechaSentencia = fechaSentencia;
    }

    /**
     * @return the tipoSentencia
     */
    public String getTipoSentencia() {
        return tipoSentencia;
    }

    /**
     * @param tipoSentencia the tipoSentencia to set
     */
    public void setTipoSentencia(String tipoSentencia) {
        this.tipoSentencia = tipoSentencia;
    }

    /**
     * @return the motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * @return the monto
     */
    public double getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }
    private String fechaSentencia;
    private String tipoSentencia;
    private String motivo;
    private double monto;
}
