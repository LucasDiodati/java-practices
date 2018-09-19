package estudiojuridico;
public class Causa {
   private Sentencia sent;
   private String fechaIni;
   private String juzgado;
   private String demandante;
   private String demandado;
   private String motivo;
   private String fuero;   
   private int nroCausa;

public Sentencia getSent() {
        return sent;
    }

    public void setSent(Sentencia sent) {
        this.sent = sent;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getJuzgado() {
        return juzgado;
    }

    public void setJuzgado(String juzgado) {
        this.juzgado = juzgado;
    }

    public String getDemandante() {
        return demandante;
    }

    public void setDemandante(String demandante) {
        this.demandante = demandante;
    }

    public String getDemandado() {
        return demandado;
    }

    public void setDemandado(String demandado) {
        this.demandado = demandado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getNroCausa() {
        return nroCausa;
    }

    public void setNroCausa(int nroCausa) {
        this.nroCausa = nroCausa;
    }   

    /**
     * @return the fuero
     */
    public String getFuero() {
        return fuero;
    }

    /**
     * @param fuero the fuero to set
     */
    public void setFuero(String fuero) {
        this.fuero = fuero;
    }
}