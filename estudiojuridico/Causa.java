package estudiojuridico;
public class Causa {
   private Sentencia sent;
   private String fechaIni;
   private String juzgado;
   private String demandante;
   private String demandado;
   private String motivo;
   private int nroCausa;

    /**
     * @return the sent
     */
    public Sentencia getSent() {
        return sent;
    }

    /**
     * @param sent the sent to set
     */
    public void setSent(Sentencia sent) {
        this.sent = sent;
    }

    /**
     * @return the fechaIni
     */
    public String getFechaIni() {
        return fechaIni;
    }

    /**
     * @param fechaIni the fechaIni to set
     */
    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    /**
     * @return the juzgado
     */
    public String getJuzgado() {
        return juzgado;
    }

    /**
     * @param juzgado the juzgado to set
     */
    public void setJuzgado(String juzgado) {
        this.juzgado = juzgado;
    }

    /**
     * @return the demandante
     */
    public String getDemandante() {
        return demandante;
    }

    /**
     * @param demandante the demandante to set
     */
    public void setDemandante(String demandante) {
        this.demandante = demandante;
    }

    /**
     * @return the demandado
     */
    public String getDemandado() {
        return demandado;
    }

    /**
     * @param demandado the demandado to set
     */
    public void setDemandado(String demandado) {
        this.demandado = demandado;
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
     * @return the nroCausa
     */
    public int getNroCausa() {
        return nroCausa;
    }

    /**
     * @param nroCausa the nroCausa to set
     */
    public void setNroCausa(int nroCausa) {
        this.nroCausa = nroCausa;
    }
   
}
